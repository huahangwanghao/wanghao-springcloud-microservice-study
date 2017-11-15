package com.wanghao.config.server.eureka;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author WangH
 * @create 2017-11-15 17:37
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class,args);
    }
    
}
