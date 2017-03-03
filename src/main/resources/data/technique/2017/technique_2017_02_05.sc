普通的 Web 项目搭建，其实通过 maven 基本可以把项目框架配备齐全。
简单的创建命令：
<pre>
mvn archetype:create -DgroupId=org.sightcorner -DartifactId=example -DarchetypeArtifactId=maven-archetype-webapp
</pre>

添加对应的包：
<pre>
maven的依赖包（pom文件）：
用来做单元测试的junit4
用来做日志实现的slf4j+logback
连接数据库的mysql+c3p0
数据访问框架mybatis
servlet相关的standard+jstl+jackson
spring依赖core+jdbc+web
</pre>

相关参考网站
<pre>
mybatis: http://www.mybatis.org/mybatis-3/
spring: http://docs.spring.io/spring/docs/
logback: https://logback.qos.ch/manual/
bootstrap: http://www.runoob.com/bootstrap/bootstrap-tutorial.html http://www.bootcdn.cn/
</pre>