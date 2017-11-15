
#config-repo下面的配置文件  命名应该是有规范的,  应该和这个文件里面的spring.application.name=test 
#是一样的, 然后 profile:re 和config-repo 里面的 -xxxx.properties是一样的. 
#这个步骤就是, 
#1.客户端通过http://config-server:8040/ 去配置中心查询自己的命名的配置文件,
#2.根据配置的profile 去拉取不同的环境下面的配置文件

@RefreshScope 必须添加, 否则热部署不好使. 


如果修改.properties文件里面的属性值
比如
name=abc 修改为 name=123 提交git仓库后

进行热部署的url  这个使用post请求.http://localhost:8041/refresh
这样再次请求就可以看到name就是123啦
client的controller需要添加@RefreshScope注解，否则配置无法刷新。
本文的bootstrap.yml文件中的内容不能放到application.yml中，否则config部分无法被加载，因为config部分的配置先于application.yml被加载，而bootstrap.yml中的配置会先于application.yml加载，
Config Server也可以支持本地存储或svn而不使用git，相对较为简单，故而本文不作赘述，有兴趣的可以自行阅读Spring Cloud的文档。