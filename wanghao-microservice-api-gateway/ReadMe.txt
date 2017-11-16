通过API Gateway，可以统一向外部系统提供REST API。Spring Cloud中使用Zuul作为API Gateway。
Zuul提供了动态路由、监控、回退、安全等功能。

http://localhost:8050/wanghao-microservice-provider-user/1
是这个上面的连接也是可以访问的. 返回结果:{"id":1,"username":"Tom","age":12}



http://gateway_id:port/想要访问的服务名(小写)/路径   就可以访问后面的服务啦.



自定义访问路径,相当于是一个缩写吧
zuul:
  routes: 
    user:                                #可以随便写,  user/name/get....等等都可以
      path: /user/**                     #想要映射的路径
      service-id: wanghao-microservice-provider-user  #相当于做了一个映射
      
#上面就可以使用http://localhost:8050/user/2  这个访问啦.



#忽略掉某些服务, 比如user这个模块不想对外提供服务

访问http://localhost:8050/movie/ribbon/2 可以访问

访问http://localhost:8050/wanghao-microservice-provider-user/1 报404

zuul:
  routes: 
    user:                                #可以随便写,  user/name/get....等等都可以
      path: /movie/**                     #想要映射的路径
      service-id: wanghao-microservice-consumer-movie-ribbon  #相当于做了一个映射
  
  ignored-services: wanghao-microservice-provider-user
      


