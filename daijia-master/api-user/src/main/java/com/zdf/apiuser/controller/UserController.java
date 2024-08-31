package com.zdf.apiuser.controller;

import com.zdf.apiuser.service.UserService;
import com.zdf.internalcommon.result.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
