Google Material Design 关于间距的原网址是：https://material.google.com/layout/metrics-keylines.html#metrics-keylines-touch-target-size

先写一下基本概念（我也经常被这些词语搞混的）
在 Material Design Guide 是用像素密度 (Pixel density) 来作为计量单位的，但一般实际开发中，会更加偏向使用 DPI 这个词。
对像素密度的定义可以查阅：https://material.google.com/layout/units-measurements.html#units-measurements-pixel-density 
PPI (pixels per inch)：图像分辨率（在图像中，每英寸所包含的像素数目）。This concept is applied to computer screens under the name PPI for Pixels Per Inch. Same principle: It counts the number of pixels your screen can display per inch. The name DPI is also used in screens. 
DPI (dots per inch)： 打印分辨率（每英寸所能打印的点数，即打印精度）。This is a measure of spatial dot density initially used in print. It's the number of ink drops your printer can put in an inch. A smaller DPI yields a less-detailed image.
DPI 和 PPI 是两个密度单位，而不是度量单位。 
低密度界面
2016_06_25_p1
高密度界面
2016_06_25_p2
DPI 的计算公式：DPI = 屏幕的像素宽度 / 屏幕的英寸宽度 [DPI = screen width (or height) in pixel / screen width (or height) in inches]

Density-independent pixels(dp)：独立像素密度。这个词其实直接看是比较难理解的，换个角度说的话，其实是一个用于计算的过度单位，通过它来计算得出的值才是直接应用到开发中的。
表格中用 Screen density 来代表密度，其实可以直接理解为 DPI。套用上一条公式，根据 DPI (or Screen density) 是120，设备是1.5英寸，屏幕的像素宽度就是 120 * 1.5 = 180 px。
2016_06_25_p3
而计算 DP 的话，则要运用另外一条公式，DP = (width in pixels * 160) / DPI。简单理解就是在像素密度 DPI 为 160 的情况下，1dp 就会等于一个像素。
套用这条公式，在DPI 是120时，设备是1.5英寸，屏幕像素宽度是180时，DP = (180 * 160) / 120 = 240。

Scaleable pixels (sp) 和 Density-independent pixels(dp) 同理，不同点在于前者是应用在字体。对于不同的移动设备，除了图片显示等需要作出改变，其实字体也需要改变的。
为什么在移动设备设计和开发中需要用到 dp / sp 来代替 px 呢？因为移动设备实在有太多不同的型号，在相同的尺寸下又会有不同的 ppi，如果使用 px 的话，就要因应不同的设备有不同的值，而使用 dp 的话，则是一个用于计算的过度单位，不会因为不同的设备而发生值的改变。
2016_06_25_p4

额外材料阅读。这是我从《iOS开发指南 从零基础到App Store上架》的第四章摘录的。
2016_06_25_p5

现在才开始进入主题，基线和间距。
第一个基本原则就是所有的组建都必须遵循对齐 8dp 的基线网格（简单点理解就是大小是8的倍数）。头像图标则要遵循对齐 4dp 的基线网格。
2016_06_25_p6
基线和间距就是靠以下几个规范来作限制的。
其中第一个固定增长 (fixed increments) 可以忽略，因为这个在手机移动端基本不会使用到，这个只应用于平板或者桌面。
垂直基线 (vertical keylines) 决定了元素的开始边界。
垂直尺寸 (vetical sizing) 决定了内容块的高度。
水平边距 (horizontal margins) 决定了间距。 
2016_06_25_p7

接着可以看官网中的一些例子进行分析（例子是常见的组建，列表，详细，导航抽屉）。这几个例子就是重点了，把这几张图的基线和间距看明白，弄懂基本就没问题了。
2016_06_25_p8

另外，可以参考材料 Material Design 关于移动端模板的基线和间隔 https://material-design.storage.googleapis.com/publish/material_v_8/material_ext_publish/0B0J8hsRkk91LSGI2MmtqdFNEMG8/Layout_Mobile_Whiteframe.ai