数据仓库的建立是为了某群体提供决策服务的，属于决策支持系统(Decision Support System)。
数据仓库必须满足: 
1. 只读的(Read Only); 
2. 历史的(Historical); 
3. 聚合的(Aggregated);
实际中数据流动: 数据经由分段数据库到逻辑数据库最后才到数据库仓库。
Staging Layer -> Enterprise Layer -> Presentation Layer
2013_06_10_p1
对于需要高响应应付从不同地方，不同系统，不同要求的数据，一般情况下会立即存储在分段数据库(Staging Layer)，之后在做处理，这里起到一个临时表的作用。
2013_06_10_p2
经过系统的处理(process)，数据会存储于对应的逻辑数据库中。例如每一个时间段的银行的交易量都是非常大的，数据会先存在Staging，然后经过处理后存储进关系型数据库Enterprise，一般Enterprise数据库都符合第三范式。
2013_06_10_p3
数据仓库绝大部分都是归档数据(Archive Data)，很多业务流程往往不是第一时间进入数据库仓库，从而在到达数据仓库前会有一层业务数据库Enterprise Layer，所以Presentation与Enterprise是由代替键(Surrogate Key)与业务逻辑键(Natural Key)建立起联系，并且关系储存于Dimension。
星型数据库的组成: 1.事实(Fact table); 2.维(Dimension table);  一套星型数据结构，应该只有一个Fact，和多个Dimension，而每个dimension之间是没有任何联系的。
Fact的粒度应该是达到度量的最低层，例如每个货物的单价。而维度则是为划分的界限，例如想看到货物在某个时间段的价格，那么时间段就是一个维度。
因为有关系型数据库转换为星型数据库，所以某些表必然会存在冗余数据，而这正是建立的Fact与Dimension的要素。
2013_06_10_p4
关系图
2013_06_10_p0