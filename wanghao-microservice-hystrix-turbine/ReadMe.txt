在复杂的分布式系统中，相同服务的节点经常需要部署上百甚至上千个，
很多时候，运维人员希望能够把相同服务的节点状态以一个整体集群的形式展现出来，这样可以更好的把握整个系统的状态。 
为此，Netflix提供了一个开源项目（Turbine）
    来提供把多个hystrix.stream的内容聚合为一个数据源供Dashboard展示。

和Hystrix Dashboard一样，Turbine也可以下载war包部署到Web容器，本文不做赘述。
下面讨论Spring Cloud是怎么使用Turbine的。