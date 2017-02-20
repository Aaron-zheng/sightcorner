空出了点时间，打算买个 VPS 来锻炼下自己。比较了价格后，就选择了搬瓦工 (Bandwagon)，买的是19.9刀/年的套餐。
<pre>
配置：
SPECIAL 10G PROMO V3 - LOS ANGELES - CHINA DIRECT ROUTE
SSD: 10 GB RAID-10
RAM: 512 MB
CPU: 1x Intel Xeon
Transfer: 1000 GB/mo
Link speed: 1 Gigabit
Location: Los Angeles (no other locations available on this plan)
Direct route via China Telecom and China Unicom
</pre>

这里有个好，就是可以多次重装系统，虽然系统一定要是它提供的（不可以使用自己提供的镜像），不过也足够了，适合新手。
通过 KiwiVM 的 Install new OS 可以安装新的系统，不过重新安装前，要先把原系统停止运行。（我选择的是 centos x86_64）
通过 KiwiVM 的 Main controls 可以看到服务器的地址和端口，可以用来作 SSH 的连接。
<pre>
ssh root@138.128.207.103 -p [port]
输入密码后，就连接上服务器了
</pre>

接着准备要安装一些常用的程序了。第一步是 JDK 的安装。
<pre>
先把 yum 更新
yum update
然后检查，是否有老版本的 JDK 已经安装了
rpm -qa | grep -E '^open[jre|jdk]|j[re|dk]'
要注意是32位的还是64位的。
uname -a
如果没有的话，就可以下载对应的32位还是64位的操作系统的 JDK 了，目前在 Oracle 官网最新的版本就是8u121了，于是选择这个。
cd /opt/
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u121-b13/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u121-linux-x64.tar.gz"
下载完后，就可以进行解压
tar xzf jdk-8u121-linux-x64.tar.gz
然后可以进行安装了
cd /opt/jdk1.8.0_121
alternatives --install /usr/bin/java java /opt/jdk1.8.0_121/bin/java 2
alternatives --config java
安装后，可以用 java -version 来测试是否安装完成。然后可以把相应的 jar 和 javac 命令都安装了。
alternatives --install /usr/bin/jar jar /opt/jdk1.8.0_121/bin/jar 2
alternatives --install /usr/bin/javac javac /opt/jdk1.8.0_121/bin/javac 2
alternatives --set jar /opt/jdk1.8.0_121/bin/jar
alternatives --set javac /opt/jdk1.8.0_121/bin/javac
为环境配置 JAVA_HOME
vi /etc/environment
export JAVA_HOME=/opt/jdk1.8.0_121
export JRE_HOME=/opt/jdk1.8.0_121/jre
export PATH=$PATH:/opt/jdk1.8.0_121/bin:/opt/jdk1.8.0_121/jre/bin
到此 JDK 部分安装完毕。
</pre>
