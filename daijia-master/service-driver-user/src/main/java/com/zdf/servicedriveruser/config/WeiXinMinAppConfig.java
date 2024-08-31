package com.zdf.servicedriveruser.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Description WeiXinMinAppConfig
 *@Author mrzhang
 *@Date 2024/7/17 16:26
 */
@Configuration
public class WeiXinMinAppConfig {
    @Value("${weixin.minapp.appId}")
    private String appId;
    @Value("${weixin.minapp.appSecret}")
    private String appSecret;

    @Bean
    public WxMaService wxMaService() {
        WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
        config.setAppid(appId);
        config.setSecret(appSecret);
        WxMaService wxMaService = new WxMaServiceImpl();
        wxMaService.setWxMaConfig(config);

        return wxMaService;
    }
}
