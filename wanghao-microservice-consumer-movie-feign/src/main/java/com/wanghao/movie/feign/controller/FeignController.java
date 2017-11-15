package com.wanghao.movie.feign.controller;/**
 * Created by Administrator on 2017/11/15.
 */

import com.wanghao.movie.feign.model.User;
import com.wanghao.movie.feign.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author WangH
 * @create 2017-11-15 10:18
 **/
@RestController
public class FeignController {
    
    @Autowired
    private UserFeignClient userFeignClient;
    
    @GetMapping("feign/{id}")
    public User findByFeignId(@PathVariable Long id){
        return userFeignClient.findByIdFeign(id);
    }
    
}
