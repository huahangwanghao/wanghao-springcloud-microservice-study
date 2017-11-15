package com.wanghao.config.client.eureka;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 客户端的配置
 *
 * @author WangH
 * @create 2017-11-15 17:40
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);    
    }
    
    
}
