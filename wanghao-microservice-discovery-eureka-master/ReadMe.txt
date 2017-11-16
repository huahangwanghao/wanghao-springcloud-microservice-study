

可以配置多个application-xxx.yml文件
然后在运行的时候需要制定
比如如本项目所示,
java -jar xxxx.jar  --spring.profiles.active=master  就是运行application-master.yml文件啦.


这俩个yml文件里面需要spring.application.name 是一样的
而且要把registerWithEureka 设置为ture 否则会在unavailable-replicas 里面看见


然后在其他的项目中可以写多个配置,比如在user项目里面引入多个注册中心的时候
defaultZone: http://discovery:8761/eureka/,http://discovery:18761/eureka/    # 指定注册中心的地址

