package com.zdf.servicedriveruser.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zdf.internalcommon.entity.CustomerInfo;
import com.zdf.internalcommon.request.UpdateUserPhoneDto;
import com.zdf.internalcommon.result.ResponseResult;

/**
* @author mrzhang
* @description 针对表【customer_info(客户表)】的数据库操作Service
* @createDate 2024-07-17 15:21:34
*/
public interface CustomerInfoService extends IService<CustomerInfo> {
    ResponseResult<Long> login(String code);
    ResponseResult<CustomerInfo> getUserInfo(Long userId);
    ResponseResult<String>updateUserPhone(UpdateUserPhoneDto updateUserPhoneDto);
}
