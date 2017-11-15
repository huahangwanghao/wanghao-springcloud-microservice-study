package com.wanghao.movie.feign.service;

import com.wanghao.movie.feign.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用@FeignClient("microservice-provider-user")注解
 *  绑定wanghao-microservice-provider-user服务，还可以使用url参数指定一个URL。
 *
 * Created by Administrator on 2017/11/15.
 */
@FeignClient("wanghao-microservice-provider-user")
public interface UserFeignClient {


    /**id=2的情况下
     * 这个最后也是接成http://wanghao-microservice-provider-user/2然后就去访问
     * wanghao-microservice-provider-user这个服务名 在eureka里面注册能够找到.
     * user这个模块下的内容@GetMapping("/{id}")  这个方法啦. 然后返回结果啦. 
     * 中间走的应该是http的服务.
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public User findByIdFeign( Long id);
    
}
