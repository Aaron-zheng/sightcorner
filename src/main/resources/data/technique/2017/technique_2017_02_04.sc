mysql 安装和创建表时候的知识点

官网下载，选择 download->community->mysql-x.x.x-macos_64.dmg
下载安装好后，会谈出一个对话框，那个是初始密码，一定要记录
然后打开控制台，修改vi ~/.bash_profile 
添加usr/local/mysql的路径到PATH中
然后登陆 mysql -u root -p 和之前的初始密码
必须要修改密码 SET PASSWORD FOR 'root'@'localhost' = PASSWORD('newpass');


需要查询当前数据库设置的模式。
show variables like 'sql_mode'; 
默认的话是：ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION
可以在运行前，添加 set sql_mode = '';

在创建表的时候可以选择ENGINE=INNODB或者其他。根据不同的ENGINE就相当于指定的哪种锁。（锁：可以同时读，但读操作时下不能写，写操作时下不能读。）
表级:引擎 MyISAM - 锁一张表。
页级:引擎 BDB - 锁相邻的一组记录。
行级:引擎 INNODB - 锁单独的一行。

事务：原子性（Atomicity）一致性（Consistent）隔离性（Isolation）持久性（Durable）