package com.zdf.servicedriveruser.controller;

import com.zdf.internalcommon.result.ResponseResult;
import com.zdf.servicedriveruser.service.CustomerInfoService;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *@Description 类功能简要描述
 *@Author mrzhang
 *@Date 2024/7/17 16:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private CustomerInfoService customerInfoService;

    @GetMapping("/login/{code}")
    public ResponseResult<Long> login(@PathVariable String code) throws WxErrorException {
        return customerInfoService.login(code);
    }
}
