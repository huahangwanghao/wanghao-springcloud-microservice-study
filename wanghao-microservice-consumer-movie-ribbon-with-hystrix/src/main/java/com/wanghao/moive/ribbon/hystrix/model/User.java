package com.wanghao.moive.ribbon.hystrix.model;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * user类
 *
 * @author WangH
 * @create 2017-11-15 10:52
 **/
public class User {
    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
