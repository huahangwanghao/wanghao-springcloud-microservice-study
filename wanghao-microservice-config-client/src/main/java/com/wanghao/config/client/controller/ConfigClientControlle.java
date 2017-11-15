package com.wanghao.config.client.controller;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * @author WangH
 * @create 2017-11-15 15:03
 **/
@RestController
@RefreshScope
public class ConfigClientControlle {

    @Value("${profile}")
    private String profile;
    
    @GetMapping("/hello")
    public String testProfile(){
        return this.profile;
    }
    
}
