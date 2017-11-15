package com.wanghao.movie.ribbon.service;/**
 * Created by Administrator on 2017/11/14.
 */

import com.wanghao.movie.ribbon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangH
 * @create 2017-11-14 14:55
 **/
@Service
public class RibbonService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    
    public User findById(long id){
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://wanghao-microservice-provider-user/" + id, User.class);
    }
    
}
