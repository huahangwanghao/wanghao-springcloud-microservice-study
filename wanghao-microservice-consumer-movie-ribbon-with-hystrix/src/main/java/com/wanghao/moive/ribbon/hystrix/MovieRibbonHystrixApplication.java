package com.wanghao.moive.ribbon.hystrix;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 熔断器
 *@EnableCircuitBreaker 这个注解是开启熔断器功能
 * @author WangH
 * @create 2017-11-15 10:50
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MovieRibbonHystrixApplication {
    
    
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonHystrixApplication.class,args);
    }
    
    
    
}
