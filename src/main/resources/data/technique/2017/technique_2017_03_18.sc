系统配置与性能评价

性能评价方法
<pre>
时钟频率法，386，486，586 就是 CPU 的芯片频率，即处理速度。现在已经不能作为衡量指标。例如 Android 有八核，而 Apple 只有双核，但实际的性能不能只看这个。
指令执行速度法，衡量的是加法指令，但是是非常片面的。
等效指令速度法（吉普森混合法），用每种指令使用的概率乘以运行时间累积起来，这里只是考虑运算能力。
数据处理速率法（PDR），考虑运算能力和内存存取速率。
综合理论性能法（CTP）
基准程序法，Dhrystone Linpack Whetstone SPEC TPC，例如跑分程序，通过不同维度进行评分。
</pre>


性能检测方法
<pre>
软件监控，使用软件对系统性能数据进行采集分析，消耗较多系统资源，例如进程管理器。
硬件监控，使用专用硬件设备对系统进行采集分析，适用于高负载的计算机系统。
</pre>


