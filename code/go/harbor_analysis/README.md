# 分析

组件

log -> goharbor/harbor-log

registry -> goharbor/registry-photon

registryctl ->  goharbor/harbor-registryctl

postgresql -> goharbor/harbor-db

core -> goharbor/harbor-core

portal -> goharbor/harbor-portal

​	depends_on:

​		log

jobservice -> goharbor/jobservice

​	depends_on:

​		core

redis -> goharbor/redis

​     depends_on:

​		log

proxy -> goharbor/nginx-photon

	 depends_on:
	  - registry
	  - core
	  - portal
	  - log




nginx中有两个upstream core和portal

/ -> portal

/c/ -> core

/api/ -> core/api

/chartrepo/ -> /core/chartrepo/

/v2/ -> core/v2/

/service/ -> core/service/