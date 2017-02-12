模拟在 Mac 的鼠标点击，主要是通过 .sh 文件控制鼠标移动，然后通过 Python 文件来控制循环。
开始前，请确认安装好 Python 和 Xcode，因为作者本身没有 Python 运营环境，所以这里也写了安装的步骤。
第一个安装 macports 这个软件管理工具。
<pre>
https://www.macports.org/
</pre>

接着就可以安装 Python 的运行环境。
<pre>
sudo port install py-game
sudo port install py-tkinter
</pre>

安装完成后，运行 Python 来测试是否成功。成功的话，一般会出现下面的版本号等信息。
<pre>
Python 2.7.10 (default, Oct 23 2015, 19:19:21) 
[GCC 4.2.1 Compatible Apple LLVM 7.0.0 (clang-700.0.59.5)] on darwin
Type "help", "copyright", "credits" or "license" for more information.
>>> 
</pre>

下载一些工具包，然后安装，至此，Python 已经安装完毕。 
<pre>
http://introcs.cs.princeton.edu/python/code/dist/introcs-1.0.zip
解压后，运行 sudo python setup.py install
</pre>

然后准备 .m 文件打包为 .sh 文件。默认已经安装了 xcode，这样基本都会自带 gcc。给出 x 和 y 的坐标，就可以控制鼠标点击。
<pre>
#import <Foundation/Foundation.h>
#import <ApplicationServices/ApplicationServices.h>

int main(int argc, char *argv[]) {
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    NSUserDefaults *args = [NSUserDefaults standardUserDefaults];

    int x = [args integerForKey:@"x"];
    int y = [args integerForKey:@"y"];

    CGPoint pt;
    pt.x = x;
    pt.y = y;

    CGPostMouseEvent( pt, 1, 1, 1 );
    CGPostMouseEvent( pt, 1, 1, 0 );

    [pool release];
    return 0;
}
</pre>
<pre>
gcc -o autoClicker autoClicker.m -framework ApplicationServices -framework Foundation
</pre>

最后写一个 Python 来模拟不停点击。
<pre>
import os
import time

def clickAction():
	os.system("./autoClicker -x 500 -y 500")
	os.system("./autoClicker -x 500 -y 700")
	time.sleep(1)
	print "clicking..."

def start(): 
	while True:
		clickAction()
		
start()
</pre>

最后运行上面的 Python 文件，就可以了。
<pre>
python pyscript.py
</pre>