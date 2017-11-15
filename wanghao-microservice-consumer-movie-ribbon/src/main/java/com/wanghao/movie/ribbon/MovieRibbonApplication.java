package com.wanghao.movie.ribbon; /**
 * Created by Administrator on 2017/11/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * sdf
 *
 * @author WangH
 * @create 2017-11-14 14:54
 **/
@SpringBootApplication
@EnableEurekaClient
public class MovieRibbonApplication {

    /**
     * 实例化RestTemplate  通过@LoadBalanced进行负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonApplication.class,args);
    }
    
}
