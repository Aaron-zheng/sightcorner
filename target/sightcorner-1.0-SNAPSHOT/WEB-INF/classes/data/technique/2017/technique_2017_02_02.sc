java.lang.Object 的默认方法
<pre>
protected Object	clone()
Creates and returns a copy of this object.
clone这个对象比new的效率要高，但注意浅复制和深复制，并且子类用的时候，需要重载clone方法。
</pre>

<pre>
boolean	equals(Object obj) 
Indicates whether some other object is "equal to" this one.
public boolean equals(Object obj) {
    return (this == obj);
}
equals方法其实本身的比较都是直接用了==的，只不过在String的时候equals方法被重写了，所以才有值对比。
</pre>

<pre>
protected void	finalize()
Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
finalize方法其实是属于被动调用的，当然也可以手动主动调用，不过如果这样做，和自己另外写一个新方法没什么区别。被动调用，主要是因为GC在执行清理内存的时候，会先把对象的finalize调用。
</pre>

<pre>
Class<?>	getClass()
Returns the runtime class of this Object.
获取当前运行对象的class
</pre>

<pre>
int	hashCode()
Returns a hash code value for the object.
hashCode方法主要应用于集合类。在集合类中，如果每次都通过遍历把对象都equals比较一次，那么时间复杂度就是o(n)。如果借助于hashCode方法，则可以计算对象的哈希码，然后计算对象的位置，直接判断此位置上是否已经存在对象即可，如果有的话，再进行equals判断。
</pre>

<pre>
String	toString()
Returns a string representation of the object.
默认的toString方法返回的是getClass().getName() + "@" + Integer.toHexString(hashCode()); 其中前面返回的是类的名称，而后面返回的则是以该对象的哈希码作为参数，以16进制无符号整数形式返回此哈希码的字符串表示形式。
</pre>