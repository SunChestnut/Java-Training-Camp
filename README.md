# Java-Training-Camp

> 不管生活有多糟，它都不能阻止你，做正确的事。

## 【第一周】 JVM 进阶

**🍭 作业：**

1. (选做) 写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，`if` 和 `for`
   ，然后分析一下对应的字节码。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

2. <span style="color:red">(必做) </span>自定义一个`Classloader`，加载一个 Hello.xlass 文件，执行`hello`方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件
   [作业传送门🚪](https://github.com/SunChestnut/Java-Training-Camp/blob/main/jvm-demo/src/main/java/syl/camp/homework/CustomerClassLoader.java)

3.  <span style="color:red">(必做) </span>画一张图，展示 Xmx、Xms、Xmn、Meta、DirectMemory、Xss
这些内存参数的关系。[作业传送门🚪](https://github.com/SunChestnut/Java-Training-Camp/blob/main/jvm-demo/src/main/java/syl/camp/homework/JVM%20%E8%BF%90%E8%A1%8C%E6%97%B6%E6%95%B0%E6%8D%AE%E5%8C%BA.png)

4. (选做) 检查一下自己维护的业务系统的 JVM 参数配置，用 jstat 和 jstack、jmap
查看一下详情，并且自己独立分析一下大概情况，思考有没有不合理的地方，如何改进。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

5. (选做) 本机使用 G1 GC 启动一个程序，仿照课上案例分析一下 JVM 情况。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

## 【第二周】 JVM 核心技术

**🍭 作业：**

1. （选做）使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。

2. （选做）使用压测工具（wrk 或 sb），演练 gateway-server-0.0.1-SNAPSHOT.jar 示例。

3. （选做）如果自己本地有可以运行的项目，可以按照 2 的方式进行演练。

4. <span style="color:red">（必做）</span>根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结，提交到 GitHub。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

5. （选做）运行课上的例子，以及 Netty 的例子，分析相关现象。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

6. <span style="color:red">（必做）</span>写一段代码，使用 HttpClient 或 OkHttp 访问  http://localhost:8801。

   * [作业传送门🚪-HttpClient](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/HttpClientDemo.java)
   * [作业传送门🚪-OkHttpClient](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/OkHttpDemo.java)

## 【第三周】 JVM 核心技术

**🍭 作业：**

1. <span style="color:red">（必做）</span>整合你上次作业的
httpclient/okhttp  [作业传送门🚪](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/HttpHandlerCustomer.java)

2. （选做）使用 netty 实现后端 http 访问（代替上一步骤）

3. <span style="color:red">（必做）</span>实现过滤器。 [作业传送门🚪](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/gateway)

4. （选做）实现路由。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loadingcolor.gif)

5. （选做）跑一跑课上的各个例子，加深对多线程的理解

6. （选做）完善网关的例子，试着调整其中的线程池参数



[🚀 回到顶部](#Java-Training-Camp)

