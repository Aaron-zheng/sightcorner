Java 内存中有四种引用，分别是强引用 (Strong reference)，软引用 (Soft reference)，弱引用 (Weak reference)，幻象引用 (Phantom reference)。

常见的新建一个对象，就是强引用了，这个强引用就不在垃圾回收器的处理列表中了。当内存空间不足，虚拟机会抛出 OOM (Out of memory) 使程序异常终止，也不会回收强引用。
<pre>
StringBuffer buffer = new StringBuffer();
</pre>

软引用，不会强制对象保存在内存中。垃圾回收器再进行多次回收后，就会把软引用的对象移除。
<pre>
SoftReference<Object> ref = new SoftReference<Object>(new Object());
</pre>

弱引用，一般就是创建本身是 weak 的对象。在垃圾回收器进行的一个垃圾回收期内就会被移除。
<pre>
Map<String, Object> cache = new WeakHashMap<String, Object>();
</pre>




幻象引用，指向的对象非常弱，使用 get() 方法通常也是返回的是 null 值。唯一的作用就是跟踪列队在 ReferenceQuene 中的已经死去的对象。

