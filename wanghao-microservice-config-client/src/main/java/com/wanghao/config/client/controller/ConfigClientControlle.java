package com.wanghao.config.client.controller;/**
 * Created by Administrator on 2017/11/15.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * @author WangH
 * @create 2017-11-15 15:03
 **/
@RestController
@RefreshScope
public class ConfigClientControlle {


    /**
     * 这个profile就是读取的配置中心的profile里面的值.
     * 整个流程是这样的, 
     * 1.在git上面上传上去文件.
     * #config-repo下面的配置文件  命名应该是有规范的,  应该和这个文件里面的spring.application.name=test 
     #是一样的, 然后 profile:re 和config-repo 里面的 -xxxx.properties是一样的. 
     #这个步骤就是, 
     #1.客户端通过http://config-server:8040/ 去配置中心查询自己的命名的配置文件,
     #2.根据配置的profile 去拉取不同的环境下面的配置文件
     */
    @Value("${profile}")
    private String profile;
    
    @GetMapping("/hello")
    public String testProfile(){
        return this.profile;
    }
    
}
