数据库模型
<pre>
三级模式，两级映射
外模式（用户视图，视图的模式）-> 概念模式（概念级数据库 + DBA 视图，创建数据库表）-> 内模式（物理数据库 + 内部视图，最终是文件形式存储）
</pre>

E-R 模型
<pre>
Entity 实体，实体有属性
Relationship 联系
</pre>

关系代数与元组演算
<pre>
笛卡尔积，属性是两个表属性之和，数据是两表双乘。
投影，选择哪些列，就出对应数据
选择，选择什么行，就出对应数据
联结，自然联结没有重复列
</pre>

规范化理论
<pre>
非规范化的问题：数据冗余，更新异常，插入异常，删除异常
函数依赖，部分函数依赖，传递函数依赖
健，候选键，主键，外键
求候选键，找入度为0的节点
范式，1NF（属性值都是不可分的原子值），2NF（消除非主属性对候选键的部分依赖），3NF（消除非主属性对候选键的传递依赖），BCNF（消除主属性对候选键的传递依赖）

S学生，T老师，J课程。一老师教一门课，每门课有若干老师，某一学生选定某门课，就对应一个固定老师。
候选键：S+J / S+T，没有非主属性，所以就是直接满足第2和第3范式。
依赖是：S+J->T T->J，前者的决定是候选键，后者的决定不是候选键。

模式分解，有损和无损。R1 n R2 可以推出 (R1 - R2) 或者 (R2 - R1) 就是无损。
R=ABC, F={A->B}
如果分解是 R1(AB) R2(AC)，根据R1nR2=A, R1-R2=B, R2-R1=C 是无损的
如果分解是 R1(AB) R2(BC)，根据R1nR2=A, R1-R2=A, R2-R1=C 是有损的

</pre>

并发控制
<pre>
丢失更新，不可重复读，读脏数据
一级封锁协议，只加写锁不加读锁
二级封锁协议，加共享锁，读完就释放
三级封锁协议，加共享锁，直到事务完成才释放
两段锁协议，可串行化。
</pre>


数据库完整性约束
<pre>
实体完整性约束，相当于主键
参照完整性约束，相当于外键
用户自定义完整性约束，相当于某字段的长度

复杂的约束，需要触发器
</pre>


数据备份
<pre>
数据库：热备份，冷备份
数据量：完全备份，增量备份，差量备份
日志文件：事务日志是针对数据库改变所做的记录，它可以记录针对数据库的任何操作。
</pre>



<pre>
分布式数据库，分片（水平，垂直，混合）
联邦数据库 (FDBS)， 企业数据集成方法。
数据仓库，分析决策
数据挖掘，决策树，神经网络，遗传算法，关联规则挖掘算法
</pre>


数据库优化
<pre>

集中式数据库优化
硬件系统：CPU 内存 I/O 硬盘阵列，网络
系统软件：参数，进程优先级，CPU 使用权，内存使用
数据库设计：表视图（表规划，物化视图），索引（常查询建索引，常修改避免索引），SQL 优化（以不相干子查询代替相干子查询，经常提交尽早释放锁，减少多表查询）
应用软件：数据库连接池

分布式数据库优化
通信代价：全局查询树的变换，多副本策略，查询树分解，半连接与直接连接
</pre>