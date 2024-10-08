package com.zdf.apiuser.service.impl;

import cn.hutool.jwt.JWTUtil;
import com.zdf.apiuser.client.ServiceDriverUserClient;
import com.zdf.apiuser.service.UserService;
import com.zdf.internalcommon.constant.JwtConstant;
import com.zdf.internalcommon.constant.RedisConstant;
import com.zdf.internalcommon.constant.StatusCode;
import com.zdf.internalcommon.entity.CustomerInfo;
import com.zdf.internalcommon.request.UpdateUserPhoneDto;
import com.zdf.internalcommon.response.UserInfoVo;
import com.zdf.internalcommon.result.ResponseResult;
import com.zdf.internalcommon.util.ThreadLocalUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *@Description User Service Implement
 *@Author mrzhang
 *@Date 2024/8/28 22:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private ServiceDriverUserClient serviceDriverUserClient;
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public ResponseResult<String> login(String code) {
        ResponseResult<Long> result = serviceDriverUserClient.login(code);
        if (result.getCode() != StatusCode.SUCCESS.getCode()) {
            return ResponseResult.fail("request failure");
        }
        Long data = result.getData();
        HashMap<String, Object> playLoad = new HashMap<>(1);
        playLoad.put(JwtConstant.JWT_TOKEN_ID, data);
        String token = JWTUtil.createToken(playLoad, JwtConstant.SIGN.getBytes());
        String tokenKey = RedisConstant.TOKEN_KEY_PREFIX + data;
        redisTemplate.opsForValue().set(tokenKey, token, RedisConstant.TOKEN_EXPIRE_TIME, TimeUnit.SECONDS);
        return ResponseResult.success(token);
    }

    @Override
    public ResponseResult<UserInfoVo> getUserInfo() {
        Long userId = (Long)ThreadLocalUtil.get();
        ResponseResult<CustomerInfo> userInfo = serviceDriverUserClient.getUserInfo(userId);
        if (userInfo.getCode() != StatusCode.SUCCESS.getCode()) {
            return ResponseResult.fail("request failure");
        }
        CustomerInfo customerInfo = userInfo.getData();
        UserInfoVo userInfoVo = new UserInfoVo();
        BeanUtils.copyProperties(customerInfo, userInfoVo);
        return ResponseResult.success(userInfoVo);
    }

    @Override
    public ResponseResult<Boolean> updateUserPhone(UpdateUserPhoneDto updateUserPhoneDto) {
        ResponseResult<String> stringResponseResult = serviceDriverUserClient.updateUserPhone(updateUserPhoneDto);
        if (stringResponseResult.getCode() != StatusCode.SUCCESS.getCode()) {
            return ResponseResult.fail(Boolean.FALSE);
        }
        return ResponseResult.success(Boolean.TRUE);
    }
}