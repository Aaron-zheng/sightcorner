安装Redis

上官网 https://redis.io/ 选择稳定的版本下载
解压后，进入到包中，在控制台输入 make
再输入 make install
启动服务器 redis-server

默认的配置，端口6379
/path/to/redis.conf 是做配置的，目前是没有任何配置。

redis-cli -p 6379
再输入info可以查看运行信息