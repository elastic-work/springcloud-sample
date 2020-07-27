# SpringCloudSample
+ 子模块名字:cloud_pay_8001
+ pom依赖
+ 创建application.yml
```server:
   	port: 8001   
   spring:
   	application:
   		name: cloud-payment-service
   	datasource:
       # 当前数据源操作类型
       type: com.alibaba.druid.pool.DruidDataSource
       # mysql驱动类
       driver-class-name: com.mysql.cj.jdbc.Driver
         url: jdbc:mysql://localhost:3306/db2019?useUnicode=true&characterEncoding=
               UTF-8&useSSL=false&serverTimezone=GMT%2B8								
       username: root
       password: 123456
       #扫描对应的mapper映射文件
   mybatis:			
       mapper-locations: classpath*:mapper/*.xml
      	type-aliases-package: com.eiletxie.springcloud.entities
```
+ 子模块名字:elastic-eureka-order
+ pom依赖
+ 创建application.yml
```eureka:
     instance:
       hostname:   localhost # eureka服务端的实例名称（可以配置自定义域名）
       instance-id: ${spring.application.name}:${server.port} # 指定实例ID,就不会显示主机名称
     client:
       registerWithEureka: true # 服务注册，false表示不将自已注册到Eureka服务中
       fetchRegistry: true # 服务发现，false表示自己不从Eureka服务中获取注册信息
       serviceUrl:    # Eureka客户端与Eureka服务端的交互地址，集群版配置对方的地址，单机版配置自己（如果不配置则默认本机8761端口）
         #defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
         #集群版
         defaultZone: http://localhost:6002/eureka/,http://localhost:6001/eureka/
     server:
       enable-self-preservation: false # 禁用自我保护机制
   spring:
     application:
       name: elastic-order
 ```

