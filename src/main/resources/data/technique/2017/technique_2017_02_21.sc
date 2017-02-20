这次是安装 Web 服务器 Tomcat

<pre>
首先查下组的信息
cut -d: -f1 /etc/group
cut -d: -f1 /etc/passwd
大概知道组之后，可以创建一个专用的组 tomcat 和一个新的用户 tomcat
groupadd tomcat
useradd -s /sbin/nologin -g tomcat -d /opt/tomcat tomcat
</pre>

<pre>
下载最新的 Tomcat，我下载的是 Tomcat 8 版本。
wget http://mirrors.hust.edu.cn/apache/tomcat/tomcat-8/v8.5.11/bin/apache-tomcat-8.5.11.tar.gz
下载后就可以解压到 /opt/tomcat，其中 --strip-components=1 代表解压的时候不要目录
tar -zxvf apache-tomcat-8.5.11.tar.gz -C /opt/tomcat --strip-components=1
接着需要改变一下文件夹的权限控制
chgrp -R tomcat conf
chmod g+rwx conf
chmod g+r conf/*
chown -R tomcat logs/ temp/ webapps/ work/
</pre>

<pre>
然后就是启动 Tomcat 服务器了
/opt/tomcat/bin/startup.sh
在我们浏览器端访问：
http://138.128.207.103:8080/
看到页面，就证明启动成功了。
关闭服务器就完成测试了。
/opt/tomcat/bin/shutdown.sh
</pre>