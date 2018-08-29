<pre>
mysql 需要 libaio 的依赖，所以需要安装 libaio
yum install libaio
yum install perl-Data-Dumper.x86_64
</pre>


<pre>
下载 mysql 的 tar.gz
wget https://cdn.mysql.com/Downloads/MySQL-5.6/mysql-5.6.35-linux-glibc2.5-x86_64.tar.gz
wget https://cdn.mysql.com/Downloads/MySQL-5.6/mysql-5.6.41-linux-glibc2.12-x86_64.tar.gz
解压并且创建链接
tar -zxvf mysql-5.6.35-linux-glibc2.5-x86_64.tar.gz 
ln -s mysql-5.6.35-linux-glibc2.5-x86_64 mysql
</pre>


<pre>
创建 mysql 的组和用户
groupadd mysql
useradd -r -g mysql -s /bin/false mysql
</pre>

<pre>
帮文件夹改 owner 关系
chown -R mysql:mysql mysql
mkdir /data/mysql
</pre>

<pre>
安装 mysql 服务器，安装只能在 mysql 的根目录运行
su mysql
cd /usr/local/mysql
./scripts/mysql_install_db --user=mysql
</pre>



<pre>
启动
./support-files/mysql.server start
/usr/local/mysql/bin/mysqld_safe &

cd mysql-test ; perl mysql-test-run.pl
./bin/mysqladmin -u root password 'haoku!999' -h 127.0.0.1
./bin/mysqladmin -u root -h VM_16_4_centos password 'haoku!999' -h 127.0.0.1

查询是否有 mysql 在运行
ps -ef | grep mysql

停止
kill -TERM PID
</pre>


