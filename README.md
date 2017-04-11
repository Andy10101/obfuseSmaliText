# obfuseSmaliText
smali字符串混淆

相关文章 http://mp.weixin.qq.com/s/SRv1Oar87w1iKuDXS4oaew

注意：配置中设置了仅会混淆包名目录下的文件

##### 2017-3-2
目前使用异或+十六进制的方式对字符串进行混淆，支持中文字符，测试未发现问题，有问题欢迎反馈

##### 2017-3-14
参考StringFog，增加对jar包的字符串混淆（使用asm）,支持自定义key

##### 2017-3-21
修复了因ide字符串替换导致的错误，编译了两个可执行jar包，并写了两个bat文件，双击即可执行

##### 使用方法
* 先使用apktool.jar将apk进行反编译
* java -jar 执行jar
* 输入当前已经反编译apk的路径（复制粘贴即可）
* 等待任务完成，重新打包回去即可

注：`jar包执行时需要指定运行编码，不然会导致混淆后乱码 ，使用命令如：java -Dfile.encoding=utf-8 -jar obfuseJarString.jar`
 
##### 混淆版酷安网
[下载](https://qtfreet.cn/com.coolapk.market_7_Mod.apk)

#### 效果图
![](http://p1.bpimg.com/567571/90927a8fd19786b1.png)

