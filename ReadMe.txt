1.对于spring-boot不能打包的问题,
    解决版本是重新引入一个maven新的库就可以啦.
2.每个模块下面也有对应的readMe文件.

http://book.itmuch.com
  

对于整个项目的理解:
1.创建一个注册中心. wanghao-microservice-discovery-eureka-master 这个注册中心是采用的集群模式
    ,启动的时候里面有多个注册中心

2.创建一个服务提供者 wanghao-microservice-provider-user  在application.yml里面制定注册中心的位置
     defaultZone: http://discovery:8761/eureka/,http://discovery:18761/eureka/ 

3.创建一个消费者 wanghao-microservice-consumer-movie-ribbon-with-hystrix 这是一个带有异常熔断机制
    消费者,需要在代码里面配置 服务提供者的serverId 比如:restTemplate.getForObject("http://wanghao-microservice-provider-user/"+id,User.class);
   PS:所谓的熔断就是 A---> B---->C----->D 如果D挂啦,别一下子全部挂掉,应该有一个快速熔断机制. 
   
4.配置中心.  wanghao-microservice-config-server , 配置中心的概念就是把所有外部配置文件的内容全部存放到
    一个位置,这样方便大家的统一管理,然后 我们项目里面用到的是git这个管理工具,也就是说把每个项目的配置文件存放到
    这个git里面,但是需要每个{项目名}-{环境}.properties等等.
    
    服务:主要的作用就是去git上面读取所有的配置的.
    客户端: 也就是每个应用系统,这个需要配置一下uri: http://config-server:8040/ 配置中心的名称,
        还需要name: wanghao-microservice-config-client这个名称和git仓库里面的名称是一样的.

5.配置中心也可以和注册中心结合起来
    配置中心的服务:在里面制定注册中心的位置.
            eureka:      -------->连接注册中心
              client:
                serviceUrl:
                  defaultZone: http://discovery:8761/eureka/
    配置中心的客户端:
        cloud:                ---->上注册中心找哪个服务
            config:
              profile: dev
              label: master
              discovery:
                enabled: true                                 # 默认false，设为true表示使用注册中心中的configserver配置而不自己配置configserver的uri
                serviceId: wanghao-microservice-config-server-eureka  # 指定config server在服务发现中的serviceId，默认为：configserver
        eureka:               ------>连接注册中心
          client:
            serviceUrl:
              defaultZone: http://discovery:8761/eureka/























  
  
  
  
  
  
  
  
  