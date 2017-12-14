# Gaoxi
零基础搭建一套微服务框架（Spring Boot + Dubbo + Docker + Jenkins）

基于此篇文章：[http://gitbook.cn/books/5a1e1adb521443295ce72a7c/index.html](http://gitbook.cn/books/5a1e1adb521443295ce72a7c/index.html)

我们**继续**跳坑：

文章5.1节中启动了容器，但是访问`http://localhost:10000/dubbo-admin-2.8.4/`时需要输入账号密码，到容器的`/zookeeper-3.4.10/tomcat/apache-tomcat-8.5.23/webapps/dubbo-admin-2.8.4/WEB-INF/dubbo.properties`配置文件：

```
dubbo.registry.address=zookeeper://127.0.0.1:2181
dubbo.admin.root.password=jishimen2019
dubbo.admin.guest.password=jishimen2019
```

配置文件的意思是：

用户名：root，密码：admin 
root.password=jishimen2019

用户名：guest，密码：guest 
guest.password=jishimen2019
