package com.wanghao.movie.feign;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类
 * 
 * 使用@EnableFeignClient客户端 开启 Feign
 *
 * @author WangH
 * @create 2017-11-15 10:16
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MovieFeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(MovieFeignApplication.class,args);
    }
    
}
