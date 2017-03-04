Hadoop 的主要构成：HDFS 分布式文件系统，存储海量数据。MapReduce 并行处理框架，实现任务分解和调度。（高扩展，低成本，成熟的生态圈）

确保已经安装好 Java 环境，然后可以下载安装 hadoop
<pre>
wget http://mirror.bit.edu.cn/apache/hadoop/common/hadoop-1.2.1/hadoop-1.2.1.tar.gz
mv hadoop-1.2.1.tar.gz /opt/
cd /opt/
tar -zxvf hadoop-1.2.1.tar.gz
</pre>


需要对4个文件进行配置 mapred-site.xml core-site.xml hdfs-site.xml hadoop-env.sh

<pre>
cd hadoop-1.2.1/conf/
vi hadoop-env.sh
修改 JAVA_HOME 路径
修改 HADOOP_SSH_OPTS 的端口号
</pre>

<pre>

先通过 host 获取系统的本地名称

vi core-site.xml
<property>
    <name>hadoop.tmp.dir</name>
    <value>/hadoop</value>
</property>
<property>
    <name>dfs.name.dir</name>
    <value>/hadoop/name</value>
</property>
<property>
    <name>fs.default.name</name>
    <value>hdfs://localhost.localdomain:9000</value>
</property>

</pre>


<pre>
vi hdfs-site.xml

<property>
    <name>dfs.data.dir</name>
    <value>/hadoop/data</value>
</property>

</pre>


<pre>

vi mapred-site.xml

<property>
    <name>mapred.job.tracker</name>
    <value>localhost.localdomain:9001</value>
</property>


最后配置环境。
vi /etc/profile
export JAVA_HOME=/opt/jdk1.8.0_121
export JRE_HOME=/opt/jdk1.8.0_121/jre
export PATH=$JRE_HOME:$JAVA_HOME:$HADOOP_HOME/bin:$PATH
source /etc/profile
运行 hadoop 测试一下
</pre>


<pre>
检查 OpenSSH
yum -y install openssh-server openssh-clients
service sshd start
chkconfig sshd on
</pre>

<pre>
先对 namenode 进行格式化
hadoop namenode -format
start-all.sh

通过运行 jps 来显示当前运行的 java 进程，如果看到以下这些就成功了。
5314 DataNode
5714 Jps
5527 JobTracker
5434 SecondaryNameNode
5182 NameNode
5646 TaskTracker

还可以查看 hadoop 的文件有哪些
hadoop fs -ls /
</pre>






