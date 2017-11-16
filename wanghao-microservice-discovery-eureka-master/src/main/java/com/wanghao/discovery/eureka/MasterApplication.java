package com.wanghao.discovery.eureka;/**
 * Created by Administrator on 2017/11/16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主的eureka
 *
 * @author WangH
 * @create 2017-11-16 14:44
 **/
@SpringBootApplication
@EnableEurekaServer
public class MasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MasterApplication.class,args);
    }
}
