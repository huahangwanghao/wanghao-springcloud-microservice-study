package com.wanghao.moive.ribbon.hystrix.controller;/**
 * Created by Administrator on 2017/11/15.
 */

import com.wanghao.moive.ribbon.hystrix.model.User;
import com.wanghao.moive.ribbon.hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author WangH
 * @create 2017-11-15 11:00
 **/
@RestController
public class RibbonHystrixController {
    
    @Autowired
    private RibbonHystrixService ribbonHystrixService;
    
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable("id") Long id){
        return ribbonHystrixService.findById(id);
    }
    
    
}
