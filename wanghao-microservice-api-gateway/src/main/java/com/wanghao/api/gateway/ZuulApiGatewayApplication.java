package com.wanghao.api.gateway;/**
 * Created by Administrator on 2017/11/16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 启动类
 *  使用@EnableZuulProxy注解激活zuul。
 *跟进该注解可以看到该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置。
 * @author WangH
 * @create 2017-11-16 9:39
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApiGatewayApplication.class,args);
    }
    
}
