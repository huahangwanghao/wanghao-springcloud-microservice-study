package com.wanghao.provider.controller;/**
 * Created by Administrator on 2017/11/14.
 */

import com.wanghao.provider.dao.UserRepository;
import com.wanghao.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User的控制器
 *
 * @author WangH
 * @create 2017-11-14 10:23
 **/
@RestController
public class UserController {
    
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user=this.userRepository.findOne(id);
        return user;
    }
    
    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance serviceinstance=this.discoveryClient.getLocalServiceInstance();
        return serviceinstance;
    }
}
