package com.wanghao.provider;/**
 * Created by Administrator on 2017/11/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * UserApplication启动接口
 *
 * @author WangH
 * @create 2017-11-14 10:28
 **/
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
    
}
