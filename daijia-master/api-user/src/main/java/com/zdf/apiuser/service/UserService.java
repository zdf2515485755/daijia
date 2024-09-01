package com.zdf.apiuser.service;

import com.zdf.internalcommon.response.UserInfoVo;
import com.zdf.internalcommon.result.ResponseResult;

/**
 *@Description User Service
 *@Author mrzhang
 *@Date 2024/8/28 22:15
 */

public interface UserService {
    ResponseResult<String> login(String code);
    ResponseResult<UserInfoVo> getUserInfo();
}
