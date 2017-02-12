Architecture中主要分为Enterprise Architecture, System Architecture and Software Architecture.
Software Architecture中Structures: Module structures, Component and connector structures, and Allocation structures.

Module structures中的类型为
1. Decomposition structure
切成小模块，块与块之间是有联系的。数量级别的不是问题，因为可以通过分层去管理。
不同的层级所以管理的module是不一样的。
2. Uses structure
展现出用处和之间的依赖
3. Layer structure
单位是Layer，有business layer, enterprise layer, presentation layer. layer pattern。
4. Class strucutre
单位是class, object。展现的是继承或者实现关系
5. Data model structure
单位是data entity，一对多或者多对一的关系。

Component and connector structures中的类型为
1. Service structure
单位是service，构建间的联系
2. Concurrency structure
线程同步

Allocation structures中的类型为
1. Deployment structure
单位是process, hardware processor, pathway
2. Implement structure
development/integartion
3. Work assignment structure
stakeholder，项目管理

一个工作流程应该是，
1. 找出所有的stakeholder
2. 找出concern
3. 什么是architecture view去address他们的concern，再对应回上面的architecture structure
4. 根据architecture viewpoint去得出view

view ISO/SEC/IEEE 42010
4+1 architecture

requrirement = functional requirement + quality attribute requirement + constraint
1. source of stimulus (event performance + user operation usability + attack security)
2. artifact
3. response measure
