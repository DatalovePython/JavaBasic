1.java语言中，一律采用unicode编码，每个字符无论是中文还是英文，都是占用2个字节
2.Java的class文件编码为UTF-8，而虚拟机JVM编码为UTF-16，UTF-8编码下，一个中文占3个字节，一个英文占1个字节
3.实现国际化应用常用的手段是利用ResourceBundle类，ResourceBundle能够依据local的不同，选择性的读取local对应后缀的properties文件以达到国际化化的目的。
4.程序设计语言中，数组元素在内存中是一个接着一个线性存放的，通过第一个元素就能访问随后的元素，这样的数组称之为“真数组”。
  实现了真数组为Java语言健壮性的特点之一。
5.Java致力于检查程序在编译和运行时的错误。
6.Java自己操纵内存减少了内存出错的可能性
7.程序设计语言中，数组元素在内存中是一个接着一个线性存放的，通过第一个元素就能访问随后的元素，这样的数组称之为“真数组”。
  实现了真数组为Java语言健壮性的特点之一。
8.Error类体系描述了Java运行系统中的内部错误以及资源耗尽的情形，Error不需要捕捉
9.异常的继承结构：基类为Throwable，Error和Exception继承Throwable，RuntimeException和IOException等继承Exception
10.非RuntimeException一般是外部错误(非Error)，其必须被 try{}catch语句块所捕获
11.HashMap键值都可以为null，且其中的元素无序，HashMap的底层是由数组加链表实现的，对于每一个key值，都需要计算哈希值，然后通过哈希值来确定顺序，并不是按照加入顺序来存放的
12J2EE中常用的名词
EJB容器：Enterprise java bean 容器。更具有行业领域特色。他提供给运行在其中的组件EJB各种管理功能。只要满足J2EE规范的EJB放入该容器，马上就会被容器进行高效率的管理。并且可以通过现成的接口来获得系统级别的服务。例如邮件服务、事务管理。
JNDI：（Java Naming & Directory Interface）JAVA命名目录服务。主要提供的功能是：提供一个目录系，让其它各地的应用程序在其上面留下自己的索引，从而满足快速查找和定位分布式应用程序的功能。
JMS：（Java Message Service）JAVA消息服务。主要实现各个应用程序之间的通讯。包括点对点和广播。
JTA：（Java Transaction API）JAVA事务服务。提供各种分布式事务服务。应用程序只需调用其提供的接口即可。
JAF：（Java Action FrameWork）JAVA安全认证框架。提供一些安全控制方面的框架。让开发者通过各种部署和自定义实现自己的个性安全控制策略。
RMI/IIOP:（Remote Method Invocation /internet对象请求中介协议）他们主要用于通过远程调用服务。例如，远程有一台计算机上运行一个程序，它提供股票分析服务，我们可以在本地计算机上实现对其直接调用。当然这是要通过一定的规范才能在异构的系统之间进行通信。RMI是JAVA特有的。
13


  
