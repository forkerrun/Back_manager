# Back-stageManagement

#作者：曾凡生
#完成时间：2019/04/04 16:46:53

#### 项目介绍
此项目源码采用前后端分离方式，spring boot开发后端，使用shiro进行权限控制,layui、bootstrap、jquery、html为前端,基于json进行交互,接口完全采用Restful的风格，实现按钮级权限控制。

#### 运行环境
1. jdk8、mysql8.0.15.、maven3.6.0

#######
运行部署：db文件夹下的sql文件拉取到mysql中运行
打开src/main/resources下的application.yml，配置mysql信息；

如何启动：打开com.zfsh下的ServerApplication.java，Run As ----> Spring Boot App
或者直接右键项目 Run As ----> Spring Boot App

开启之后浏览器输入localhost:8080进入，登录名默认admin/admin

