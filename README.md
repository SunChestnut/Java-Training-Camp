# Java-Training-Camp

> 不管生活有多糟，它都不能阻止你，做正确的事。

## 【第一周】 JVM 进阶

**🍭 作业：**

1. (选做) 写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，`if` 和 `for`
   ，然后分析一下对应的字节码。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

2. <span style="color:red">(必做) </span>自定义一个`Classloader`，加载一个 Hello.xlass 文件，执行`hello`方法，此文件内容是一个 Hello.class
   文件所有字节（x=255-x）处理后的文件
   [作业传送门 😋](https://github.com/SunChestnut/Java-Training-Camp/blob/main/jvm-demo/src/main/java/syl/camp/homework/CustomerClassLoader.java)

3. <span style="color:red">(必做) </span>画一张图，展示 Xmx、Xms、Xmn、Meta、DirectMemory、Xss
   这些内存参数的关系。[作业传送门 😋](https://github.com/SunChestnut/Java-Training-Camp/blob/main/jvm-demo/src/main/java/syl/camp/homework/JVM%20%E8%BF%90%E8%A1%8C%E6%97%B6%E6%95%B0%E6%8D%AE%E5%8C%BA.png)

4. (选做) 检查一下自己维护的业务系统的 JVM 参数配置，用 jstat 和 jstack、jmap
   查看一下详情，并且自己独立分析一下大概情况，思考有没有不合理的地方，如何改进。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

5. (选做) 本机使用 G1 GC 启动一个程序，仿照课上案例分析一下 JVM 情况。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

## 【第二周】 JVM 核心技术

**🍭 作业：**

1. （选做）使用 GCLogAnalysis.java 自己演练一遍串行 / 并行 /CMS/G1 的案例。

2. （选做）使用压测工具（wrk 或 sb），演练 gateway-server-0.0.1-SNAPSHOT.jar 示例。

3. （选做）如果自己本地有可以运行的项目，可以按照 2 的方式进行演练。

4. <span style="color:red">（必做）</span>根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结，提交到
   GitHub。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

5. （选做）运行课上的例子，以及 Netty 的例子，分析相关现象。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

6. <span style="color:red">（必做）</span>写一段代码，使用 HttpClient 或 OkHttp 访问  http://localhost:8801。

    * [作业传送门 😋-HttpClient](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/HttpClientDemo.java)
    * [作业传送门 😋-OkHttpClient](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/OkHttpDemo.java)

## 【第三周】 JVM 核心技术

**🍭 作业：**

1. <span style="color:red">（必做）</span>整合上次作业的
   httpclient/okhttp  [作业传送门😋](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/HttpHandlerCustomer.java)

2. （选做）使用 netty 实现后端 http 访问（代替上一步骤）

3. <span style="color:red">（必做）</span>
   实现过滤器。 [作业传送门 😋](https://github.com/SunChestnut/Java-Training-Camp/blob/main/nio-demo/src/main/java/syl/camp/homework/gateway)

4. （选做）实现路由。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

5. （选做）跑一跑课上的各个例子，加深对多线程的理解

6. （选做）完善网关的例子，试着调整其中的线程池参数

## 【第四周】 Java 并发编程

1.（选做）把示例代码，运行一遍，思考课上相关的问题。也可以做一些比较。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

2.<span style="color:red">（必做）</span>实现过滤器。思考有多少种方式，在 main 函数启动一个新线程，运行一个方法，拿到这个方法的返回值后，退出主线程? 写出你的方法，越多越好，提交到
GitHub。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

3.（选做）列举常用的并发操作 API 和工具类，简单分析其使用场景和优缺点。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

4.（选做）请思考: 什么是并发? 什么是高并发? 实现高并发高可用系统需要考虑哪些 因素，对于这些你是怎么理解的?![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

5.（选做）请思考: 还有哪些跟并发类似 / 有关的场景和问题，有哪些可以借鉴的解决办法。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

6.<span style="color:red">（必做）</span>实现过滤器。把多线程和并发相关知识梳理一遍，画一个脑图，截图上传到 GitHub 上。 可选工具:
xmind，百度脑图，wps，MindManage，或其他。![酝酿中，敬请期待……](http://119.29.157.197:8899/blog/loading.gif)

## 【第五周】 Java 相关框架

1.（选做）使 Java 里的动态代理，实现一个简单的 AOP。

2.<span style="color:red">（必做）</span>写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub。

3.（选做）实现一个 Spring XML 自定义配置，配置一组 Bean，例如：Student/Klass/School。

4.（选做，会添加到高手附加题） </br>

      4.1 （挑战）讲网关的 frontend/backend/filter/router 线程池都改造成 Spring 配置方式；

      4.2 （挑战）基于 AOP 改造 Netty 网关，filter 和 router 使用 AOP 方式实现；

      4.3 （中级挑战）基于前述改造，将网关请求前后端分离，中级使用 JMS 传递消息； 
   
      4.4 （中级挑战）尝试使用 ByteBuddy 实现一个简单的基于类的 AOP； 
   
      4.5 （超级挑战）尝试使用 ByteBuddy 与 Instrument 实现一个简单 JavaAgent 实现无侵入下的 AOP。

5.（选做）总结一下，单例的各种写法，比较它们的优劣。

6.（选做）maven/spring 的 profile 机制，都有什么用法？

7.（选做）总结 Hibernate 与 MyBatis 的各方面异同点。

8.<span style="color:red">（必做）</span>给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。

9.（选做）学习 MyBatis-generator 的用法和原理，学会自定义 TypeHandler 处理复杂类型。

10.<span style="color:red">（必做）</span>研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法：

      1）使用 JDBC 原生接口，实现数据库的增删改查操作。 
      2）使用事务，PrepareStatement 方式，批处理方式，改进上述操作。 
      3）配置 Hikari 连接池，改进上述操作。提交代码到 GitHub。

附加题（可以后面上完数据库的课再考虑做）：

      (挑战) 基于 AOP 和自定义注解，实现 @MyCache(60) 对于指定方法返回值缓存 60 秒。

      (挑战) 自定义实现一个数据库连接池，并整合 Hibernate/Mybatis/Spring/SpringBoot。

      (挑战) 基于 MyBatis 实现一个简单的分库分表 + 读写分离 + 分布式 ID 生成方案。

## 【第六周】 Java 相关框架/系统性能优化

1.（选做）尝试使用 Lambda/Stream/Guava 优化之前作业的代码。

2.（选做）尝试使用 Lambda/Stream/Guava 优化工作中编码的代码。

3.（选做）根据课上提供的材料，系统性学习一遍设计模式，并在工作学习中思考如何用设计模式解决问题。

4.（选做）根据课上提供的材料，深入了解 Google 和 Alibaba 编码规范，并根据这些规范，检查自己写代码是否符合规范，有什么可以改进的。

5.（选做）基于课程中的设计原则和最佳实践，分析是否可以将自己负责的业务系统进行数据库设计或是数据库服务器方面的优化

6.（必做）基于电商交易场景（用户、商品、订单），设计一套简单的表结构，提交 DDL 的 SQL 文件到 Github（后面 2
周的作业依然要是用到这个表结构） [作业传送门 😋](https://github.com/SunChestnut/Java-Training-Camp/blob/main/doc/homework.sql)

7.（选做）尽可能多的从“常见关系数据库”中列的清单，安装运行，并使用上一题的 SQL 测试简单的增删改查。

8.（选做）基于上一题，尝试对各个数据库测试 100 万订单数据的增删改查性能。

9.（选做）尝试对 MySQL 不同引擎下测试 100 万订单数据的增删改查性能。

10.（选做）模拟 1000 万订单数据，测试不同方式下导入导出（数据备份还原）MySQL 的速度，包括 jdbc 程序处理和命令行处理。思考和实践，如何提升处理效率。

11.（选做）对 MySQL 配置不同的数据库连接池（DBCP、C3P0、Druid、Hikari），测试增删改查 100 万次，对比性能，生成报告。

[🚀 回到顶部](#Java-Training-Camp)

