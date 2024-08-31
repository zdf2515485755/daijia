package com.zdf.apiuser.client;

import com.zdf.internalcommon.result.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *@Description Service driver user remote call
 *@Author mrzhang
 *@Date 2024/8/28 22:24
 */
@FeignClient("service-driver-user")
public interface ServiceDriverUserClient {

    @GetMapping("/login/{code}")
    ResponseResult<Long> login(@PathVariable String code);
}
