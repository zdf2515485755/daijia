package com.zdf.servicedriveruser.controller;

import com.zdf.internalcommon.entity.CustomerInfo;
import com.zdf.internalcommon.request.UpdateUserPhoneDto;
import com.zdf.internalcommon.result.ResponseResult;
import com.zdf.servicedriveruser.service.CustomerInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

/**
 *@Description api for user
 *@Author mrzhang
 *@Date 2024/7/17 16:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private CustomerInfoService customerInfoService;

    @GetMapping("/login/{code}")
    public ResponseResult<Long> login(@PathVariable String code){
        return customerInfoService.login(code);
    }

    @GetMapping("/getUserInfo/{userId}")
    public ResponseResult<CustomerInfo> getUserInfo(@NotNull @PathVariable Long userId){
        return customerInfoService.getUserInfo(userId);
    }

    @PostMapping("/updateUserPhone")
    public ResponseResult<String>updateUserPhone(@RequestBody UpdateUserPhoneDto updateUserPhoneDto){
        return customerInfoService.updateUserPhone(updateUserPhoneDto);
    }
}