package com.zdf.servicedriveruser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zdf.internalcommon.entity.CustomerInfo;
import com.zdf.internalcommon.result.ResponseResult;
import me.chanjar.weixin.common.error.WxErrorException;

/**
* @author mrzhang
* @description 针对表【customer_info(客户表)】的数据库操作Service
* @createDate 2024-07-17 15:21:34
*/
public interface CustomerInfoService extends IService<CustomerInfo> {
    ResponseResult<Long> login(String code) throws WxErrorException;
    ResponseResult<CustomerInfo> getUserInfo(Long userId);
}
