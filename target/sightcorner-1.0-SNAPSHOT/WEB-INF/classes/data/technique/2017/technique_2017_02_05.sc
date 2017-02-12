
mvn archetype:create -DgroupId=org.seckill -DartifactId=seckill -DarchetypeArtifactId=maven-archetype-webapp

maven的依赖包（pom文件）：
用来做单元测试的junit4
用来做日志实现的slf4j+logback
连接数据库的mysql+c3p0
数据访问框架mybatis
servlet相关的standard+jstl+jackson
spring依赖core+jdbc+web

秒杀难点：如何高效处理竞争

mybatis: http://www.mybatis.org/mybatis-3/
spring: http://docs.spring.io/spring/docs/
logback: https://logback.qos.ch/manual/
bootstrap: http://www.runoob.com/bootstrap/bootstrap-tutorial.html http://www.bootcdn.cn/

开发：
1. DAO 设计编码
mysql数据库：事务+行级锁
2. Service 设计编码
3. Web 设计编码
springmvc
所有请求都会去DispatcherServlet，
会去找DefaultAnnotationHandlerMapping，
然后会去找DefaultAnnotationHandlerAdapter，相当于我们写的Controller
返回了ModelAndView

转发forward和重定向redirect区别：转发是服务器行为，重定向是客户端行为。