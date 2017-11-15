
#config-repo下面的配置文件  命名应该是有规范的,  应该和这个文件里面的spring.application.name=test 
#是一样的, 然后 profile:re 和config-repo 里面的 -xxxx.properties是一样的. 
#这个步骤就是, 
#1.客户端通过http://config-server:8040/ 去配置中心查询自己的命名的配置文件,
#2.根据配置的profile 去拉取不同的环境下面的配置文件




如果修改.properties文件里面的属性值
比如
name=abc 修改为 name=123 提交git仓库后

进行热部署的url  这个使用post请求.http://localhost:8041/refresh
这样再次请求就可以看到name就是123啦
