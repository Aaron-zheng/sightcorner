高并发秒杀的简单优化

<pre>
用户大量刷新
CDN-页面的静态话css,js等。CDN(content distribute network)加速用户获取数据的系统。部署在离客户最近的城域网的节点，命中CDN后就不用访问后端服务器。
获取系统时间不用优化，访问一次内存，大概需要10纳秒，1秒等于10亿纳秒，相当于1秒可以返回1亿次时间。
秒杀地址接口分析，适合放服务端的缓存redis
秒杀操作，数据库事务来确保库存正确性
</pre>

<pre>
执行秒杀

原子计数器 -> redis/nosql（确保原子性）
记录行为消息 -> 分布式MQ（RMQ可以支持几十万QPS）
后端服务会消费这个消息并且落地 -> MySQL（可以扛住很高并发） 
</pre>


<pre>
瓶颈分析：
update库存 -> insert购买明细 -> commit/rollback
每个过程中都有网络延迟和GC，行级锁是在commit之后释放，优化方向就改为如何减少行级锁持有时间
测试，同一个id执行mysql update，竞争一行，1秒可以扛住4万QPS
</pre>


<pre>
延迟分析：
同城机房网络(0.5ms~2ms) max(1000qps)
jvm-gc(50ms左右) max(20qps)
如果是异地机房，例如北京到上海机房，一次网络往返可能就13～20毫秒延迟。max(50qps)
</pre>

<pre>
优化思路，把客户端放到mysql
1. 定制SQL方法，update/*+[auto_commit]*/，需要修改mysql源码
2. 使用存储过程
</pre>

<pre>
优化总结：
1. 前端控制，暴露接口，按钮防重复
2. 动静态数据分析，CDN缓存，和后端缓存redis
3. 减少事务锁的时间
</pre>