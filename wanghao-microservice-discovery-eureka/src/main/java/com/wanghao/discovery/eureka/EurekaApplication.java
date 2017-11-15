package com.wanghao.discovery.eureka;/**
 * Created by Administrator on 2017/11/13.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用eureka作服务发现
 *
 * @author WangH
 * @create 2017-11-13 10:23
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        //启动服务发现
        SpringApplication.run(EurekaApplication.class,args);
    }
}
