package com.wanghao.config.client.eureka.controller;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ,控制器
 *
 * @author WangH
 * @create 2017-11-15 17:41
 **/
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
