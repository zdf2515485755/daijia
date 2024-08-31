package com.zdf.servicedriveruser.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zdf.internalcommon.constant.UserConstant;
import com.zdf.internalcommon.entity.CustomerInfo;
import com.zdf.internalcommon.entity.CustomerLoginLog;
import com.zdf.internalcommon.result.ResponseResult;
import com.zdf.servicedriveruser.mapper.CustomerInfoMapper;
import com.zdf.servicedriveruser.mapper.CustomerLoginLogMapper;
import com.zdf.servicedriveruser.service.CustomerInfoService;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
* @author mrzhang
* @description 针对表【customer_info(客户表)】的数据库操作Service实现
* @createDate 2024-07-17 15:21:34
*/
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo>
    implements CustomerInfoService {

    @Resource
    private WxMaService wxMaService;
    @Resource
    private CustomerInfoMapper customerInfoMapper;
    @Resource
    private CustomerLoginLogMapper customerLoginLogMapper;

    @Override
    public ResponseResult<Long> login(String code) throws WxErrorException {
        WxMaJscode2SessionResult sessionInfo;
        try {
            sessionInfo = wxMaService.getUserService().getSessionInfo(code);
        } catch (WxErrorException e) {
            throw new WxErrorException(e.getMessage());
        }
        String openid = sessionInfo.getOpenid();
        //查看是否有对应的用户
        QueryWrapper<CustomerInfo> customerInfoQueryWrapper = new QueryWrapper<>();
        customerInfoQueryWrapper.eq("wx_open_id", openid)
                .eq("is_deleted", UserConstant.IS_NOT_DELETED)
                .eq("status", UserConstant.IS_NORMAL);
        CustomerInfo customerInfo = customerInfoMapper.selectOne(customerInfoQueryWrapper);
        CustomerLoginLog customerLoginLog = new CustomerLoginLog();
        Long userId;
        if (Objects.isNull(customerInfo)){
            CustomerInfo info = new CustomerInfo();
            info.setWxOpenId(openid);
            customerInfoMapper.insert(info);
            customerInfoQueryWrapper.eq("wx_open_id", openid)
                    .eq("is_deleted", UserConstant.IS_NOT_DELETED)
                    .eq("status", UserConstant.IS_NORMAL);
            CustomerInfo userInfo = customerInfoMapper.selectOne(customerInfoQueryWrapper);
            customerLoginLog.setCustomerId(userInfo.getId().toString());
            userId = userInfo.getId();
        }else {
            customerLoginLog.setCustomerId(customerInfo.getId().toString());
            userId = customerInfo.getId();
        }
        customerLoginLogMapper.insert(customerLoginLog);
        return ResponseResult.success(userId);
    }
}
