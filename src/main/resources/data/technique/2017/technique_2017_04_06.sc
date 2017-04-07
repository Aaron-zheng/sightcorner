用来记录自己安装超级账本 Hyperledger Fabric v1.0 版本，当前运行的环境是 CentOS-7-x86_64。

记得开始之前，必须先检查内核版本，如果 kernel 版本低于 3.10.0 的话，docker 就不支持，需要进行升级。(如果当前使用的是 VPS，要留意这个用的是 OpenVZ 还是 KVM，OpenVZ 的话，内核一般是2.6，不能进行内核升级的。如果是 KVM 版本的，就可以升级内核）
<pre>
uname -sr
</pre>

安装 docker
<pre>
curl -sSL https://get.daocloud.io/docker | sh
curl -L https://get.daocloud.io/docker/compose/releases/download/1.11.2/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose

设置自动开启
systemctl enable docker.service
开启 docker
systemctl start docker.service
</pre>


在 docker 中拉取相关镜像
<pre>
docker pull hyperledger/fabric-orderer:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-peer:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-zookeeper:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-couchdb:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-kafka:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-ca:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-ccenv:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-javaenv:x86_64-1.0.0-alpha
docker pull hyperledger/fabric-baseos:x86_64-0.3.0
在 docker 中标记为最新版本 latest
docker tag [name]:[version] [name]:latest
docker tag hyperledger/fabric-orderer:x86_64-1.0.0-alpha hyperledger/fabric-orderer:latest
docker tag hyperledger/fabric-peer:x86_64-1.0.0-alpha hyperledger/fabric-peer:latest
docker tag hyperledger/fabric-zookeeper:x86_64-1.0.0-alpha hyperledger/fabric-zookeeper:latest
docker tag hyperledger/fabric-couchdb:x86_64-1.0.0-alpha hyperledger/fabric-couchdb:latest
docker tag hyperledger/fabric-kafka:x86_64-1.0.0-alpha  hyperledger/fabric-kafka:latest
docker tag hyperledger/fabric-ca:x86_64-1.0.0-alpha hyperledger/fabric-ca:latest
docker tag hyperledger/fabric-ccenv:x86_64-1.0.0-alpha hyperledger/fabric-ccenv:latest
docker tag hyperledger/fabric-javaenv:x86_64-1.0.0-alpha hyperledger/fabric-javaenv:latest
docker tag hyperledger/fabric-baseos:x86_64-0.3.0 hyperledger/fabric-baseos:latest
</pre>


安装 git，拉最新代码 fabric，并且解压
<pre>
yum install git
yum install wget
wget https://github.com/hyperledger/fabric/archive/v1.0.0-alpha.tar.gz
解压到这个目录下 /usr/local/gopath/src/github.com/hyperledger/fabric
</pre>


安装 go 环境
<pre>
curl -LO https://storage.googleapis.com/golang/go1.7.linux-amd64.tar.gz
tar -C /usr/local -xvzf go1.7.linux-amd64.tar.gz
mv /usr/local/go /usr/local/golang
添加环境变量
vi /etc/profile
export GOROOT=/usr/local/golang
export PATH=$PATH:$GOROOT/bin
export GOPATH=/usr/local/gopath
source /etc/profile
</pre>


安装ltdl包
<pre>
yum install gcc golang
yum install libtool-ltdl-devel-2.4.2-21.el7_2.i686
ln -s /usr/lib64/libltdl.so.7.3.0 /usr/lib64/libltdl.so
ln -s /usr/lib64/libltdl.so.7.3.0 /usr/lib64/libltdl.so.7
</pre>


所有都安装好后，就可以编辑和进行运行测试了
<pre>
cd /usr/local/gopath/src/github.com/hyperledger/fabric
make configtxgen
cd /usr/local/gopath/src/github.com/hyperledger/fabric/examples/e2e_cli
./network_setup.sh up <channel-ID>
</pre>