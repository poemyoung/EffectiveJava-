### 单例模式：

##### 特点：

- 单例类只能有一个实例。
- 单例类必须自己创建自己的唯一实例。
- 单例类必须给所有其他对象提供这一实例。

##### 应用：

当只能有一个实例出现的时候。

+ 处理一个文件，只能有一个文件的实例，以免多个线程同时更改该文件。

+ 生产唯一序列号
+ WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
+ 创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。

## 实现方式：

### 1. 最简单的实现：

直接创建一个类即可,用静态工厂方法

### 2. 懒汉式，线程不安全：

因为没有加锁 synchronized，所以严格意义上它并不算单例模式

### 3. 懒汉式，线程安全：

这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
优点：第一次调用才初始化，避免内存浪费。
缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。

### 4.饿汉式，线程安全：

这种方式比较常用，但容易产生垃圾对象。
优点：没有加锁，执行效率会提高。
缺点：类加载时就初始化，浪费内存。
它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。

### 5.双重校验锁方式：

这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getInstance() 的性能对应用程序很关键。

### 6.登记式/静态内部类：

### 7.枚举：



