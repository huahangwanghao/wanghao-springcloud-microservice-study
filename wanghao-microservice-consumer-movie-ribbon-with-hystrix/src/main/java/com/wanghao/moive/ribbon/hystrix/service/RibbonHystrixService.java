package com.wanghao.moive.ribbon.hystrix.service;/**
 * Created by Administrator on 2017/11/15.
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wanghao.moive.ribbon.hystrix.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 熔断器service
 *
 * @author WangH
 * @create 2017-11-15 10:53
 **/
@Service
public class RibbonHystrixService {
    
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOGGER= LoggerFactory.getLogger(RibbonHystrixService.class);

    /**
     * @HystrixCommand 制定当发生异常时候调用的方法
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
        return restTemplate.getForObject("http://wanghao-microservice-provider-user/"+id,User.class);
    }
    
    public User fallback(Long id){
        LOGGER.info("发生异常,入参"+id);
        User user=new User();
        user.setId(-1L);
        user.setAge(0);
        user.setUsername("unset Name");
        return user;
    }
    
}
