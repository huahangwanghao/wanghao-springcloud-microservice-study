package com.wanghao.movie.ribbon.controller;/**
 * Created by Administrator on 2017/11/14.
 */

import com.wanghao.movie.ribbon.model.User;
import com.wanghao.movie.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangH
 * @create 2017-11-14 14:55
 **/
@RestController
public class RibbonController {
    
    @Autowired
    private RibbonService ribbonService;
    @Autowired
    private DiscoveryClient discoveryClient;
    
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable long id){
        return ribbonService.findById(id);
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance serviceinstance=this.discoveryClient.getLocalServiceInstance();
        return serviceinstance;
    }
    
}
