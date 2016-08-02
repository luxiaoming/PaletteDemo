# PaletteDemo
Palette 测试demo

![](http://upload-images.jianshu.io/upload_images/1603789-a715172c978d955b?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

Palette 让界面显示一致的利器
Palette 主要功能便是取到一张图的色彩，然后返回一系列颜色，可供我们选择设置我们的文本颜色，背景颜色，从而达到界面的一致性。

这篇文章有些坎坷，中途停电，丢失了内容，因此重新再敲一遍。

主要提取出来的颜色值有如下几个选择：
**Vibrant**(充满活力的)
**Vibrant dark**(充满活力的黑)
**Vibrant light**(充满活力的亮)
**Muted**(柔和的)
**Muted dark**(柔和的黑)
**Muted light**(柔和的亮)
下来我们实践中来看效果：
1 在build.gradle添加

![](http://upload-images.jianshu.io/upload_images/1603789-6db1c46c087e280f?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

引入Palette功能，版本自行选择。

2 创建Palette

![](http://upload-images.jianshu.io/upload_images/1603789-2a5e834862ee8809?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

这里我们可以看到有两个方法，一个同步，一个异步。异步使用的情况当我们的图片过大，处理会导致UI无响应的时候，可以使用异步进行避免。

3 使用

![](http://upload-images.jianshu.io/upload_images/1603789-81777dbbb3436547?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

4 效果

![](http://upload-images.jianshu.io/upload_images/1603789-a29e0621321c6c01?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

这里将六种同时显示出来，可以对比下。界面上要说明的是，最后一个是失败的，原因便是这张图里提取不出来对应的颜色。这个要注意。如果我们需要在没有提取出来，想自定义颜色的时候，使用getXXXColor一系列去获取。

5 其他

我们可以给Palette设置一些参数，具体参数有：
maximumColorCount 默认值16，一般风景使用10-16，头像类的使用24-30即可
resizeBitmapArea 对图片进行缩放。
setRegion 可以选择局部区域。
Swatch的getTitleTextColor和getBodyTextColor颜色值基本一致，我们一般选择getBodyTextColor设置字体颜色就可以了。
更高级的就是自己定义Filter进行颜色选择操作了。

6 demo地址

https://github.com/luxiaoming/PaletteDemo

7 glide封装

https://github.com/florent37/GlidePalette

![](http://upload-images.jianshu.io/upload_images/1603789-92b2c7b9fed0edf1?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
