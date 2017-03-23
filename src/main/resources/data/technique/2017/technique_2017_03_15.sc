搭建 Jenkins
<pre>
修改 tomcat 中的端口号，把8080修改为9090
cd /opt/tomcat-jenkins/conf
vi server.xml

进入 tomcat 目录
cd /opt/tomcat-jenkins/webapps
wget https://mirrors.tuna.tsinghua.edu.cn/jenkins/war-stable/2.32.3/jenkins.war

开启 tomcat
/opt/tomcat-jenkins/bin/startup.sh

访问 jenkins
http://138.128.207.103:9090/jenkins/

文件中找到初始密码并且输入
/root/.jenkins/secrets/initialAdminPassword

登录后，选择安装默认的 plugin
然后通过选择 Jenkins -> Manage Jenkins -> Configuration -> GitHub -> Secret text
在 Github 官网，则需要 Personal settings -> Developer settings -> Personal access tokens 选择 repo 和 admin:repo_hook
然后把那串字符帖回到 Jenkins 里，选择 Test connection 就可以了。
创建一个 freestyle 项目，输入 Github 中项目的地址
</pre>