package com.zdf.apiuser.controller;

import com.zdf.apiuser.service.UserService;
import com.zdf.internalcommon.request.UpdateUserPhoneDto;
import com.zdf.internalcommon.response.UserInfoVo;
import com.zdf.internalcommon.result.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *@Description api for user
 *@Author mrzhang
 *@Date 2024/8/28 22:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login/{code}")
    public ResponseResult<String> login(@PathVariable String code) {
        return userService.login(code);
    }

    @GetMapping("/getUserInfo")
    public ResponseResult<UserInfoVo> getUserInfo() {
        return userService.getUserInfo();
    }
    @PostMapping("/updateUserPhone")
    public ResponseResult<Boolean>updateUserPhone(@RequestBody UpdateUserPhoneDto updateUserPhoneDto){
        return userService.updateUserPhone(updateUserPhoneDto);
    }
}
