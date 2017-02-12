发布者和订阅者模型是软件架构中的消息模式。
	1. 第一种是1:n，一个发布者对应多个订阅者。例如汇率和RSS网站。
	2. 第二种是n:1，多个发布者对应一个订阅者。例如收集状态，历史记录和数据。
	3. 第三种是1:1，特定发布者对应特定订阅者。例如价格报价。
	4. 第四种是n:n，多个发布者对应多个订阅者。例如微博的话题。
2014_08_17_p0
而在中间的booker的实现方式有第三方应用
	1. 目前在用的：IBM MQ, IBM WMB/IIB, Spring Integration PubSub channel
	2. 市场上支持发布者和订阅者模式的：ZeroMQ, ActiveMQ, RabbitMQ, XMPP, Apache Camel Channel, Redis PubSub
	3. 市场上最新的：IBM MessageSight, Eclipse Paho, Apache Kafka