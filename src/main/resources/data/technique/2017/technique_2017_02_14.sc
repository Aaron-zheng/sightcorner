当初 Java 的口号是"一次编写，到处运行" (Write once, Run anywhere)。所以设计的理念就是，跨平台。通过由 Sun / Oracle 公司提供不同平台上的虚拟机，然后载入一种与平台无关的字节码，来实现。

<pre>
一般的流程：源文件（可以是 .java / .rb / .groovy / ..） -> 对应的编译器 -> Java 虚拟机
Class 文件是以8位字节为基础单位的二进制流。Class 文件格式采用伪结构体来存储，这个结构中只有2种数据类型：无符号数，和表。
</pre>


u1, u2, u4, u8 来表示1个字节，2个字节，4个字节和8个字节的无符号数。表用于描述有层次关系的复合结构数据，所有表习惯用 _info 来结尾。(由于 Class 的结构不像 XML 等描述语言，所以没有分隔符，字节的含义和长度先后顺序都不允许改变的）
<pre>
magic u4
minor_version u2
major_version u2
constant_pool_count u2
constant_pool cp_info
access_flags u2
this_class u2
super_class u2
interfaces_count u2
interfaces u2
fields_count u2
fields fields_info
methods_count u2
methods method_info
attributes_count u2
attributes attribute_info
</pre>

随便编写了一个类。
2017_02_14_p1

打开 Class 文件所看到的数据
2017_02_14_p2

<pre>
magic - 每个 Class 文件开头的4个字节，是用来确认虚拟机可以接受的文件，值为0xCAFEBABE。其中 0x 代表16进制，16进制中，两个字符是一个字节，一个字符的话，是一个字节。例如：A是一个字节，AA是一个字节，AAA是两个字节，AAAA是两个字节。不过，16进制能够出现的字符(不区分大小写)是：1,2,3,4,5,6,7,8,9,0,A,B,C,D,E,F。
minor_version - 对应的就是0x0000
major_version - 对应的是0x0033，转换为十进制就是3*16+3=51，而 Java 的版本号是从45开始的，所以当前文件就是51-45+1=7，应该是 JDK 7 的 Class 文件了。
constant_pool_count - 对应的是0x0018，转换十进制就是1*16+8=24，即是23项常量，为1～23，而第0项是用来表达"不引用任何一个常量池项目"
constant_pool - 可以用命令行 javap 来查看，就我这个例子，我运行 javap -verbose Hello.class 就可以看到常量池里面的数据了
access_flags - 访问标示 0x001 为 public，0x0200 代表为接口，0x0400 代表抽象类，0x2000 代表注解，0x4000 代表枚举。
</pre>
2017_02_14_p3


<pre>
this_class - 类索引，用于确定这个类的全限定名
super_class - 用于确定父类的索引，除了 java.lang.Object 外，所有类的父索引都不为0。
interfaces_count - 如果类没有实现接口，则为0。
interfaces - 接口索引
fields_count
fields - 描述一个字段需要的信息，作用域，类级变量还是实例变量，可变性，并发可见性，可否序列化，数据类型，字段名称。
methods_count
methods - 在默认不是静态方法的时候，args_size 是会有1这个默认值的，因为默认会传递 this 这个作为实例对象引用作为第一个参数。
attributes_count
attributes
</pre>
2017_02_14_p4