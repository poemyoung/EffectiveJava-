package Singleton;

/**
 * @description 简单实现方法（静态工厂方法）
 */
public class SingletonOne {
    public static void main(String[] args) {
        SingletonOne a = SingletonOne.getInstance();
        System.out.println(a.getCount());
        //输出为1
        SingletonOne b = SingletonOne.getInstance();
        System.out.println(b.getCount());
        //输出仍为1,表明Singleton的构造函数只调用了一次
    }

    private int count = 0;
    public static SingletonOne single = new SingletonOne();

    private SingletonOne(){
        count++;
    }
    public int getCount(){
        return count;
    }

    //获取实例，静态工厂方法实现单例模式
    public static SingletonOne getInstance(){
        return single;
    }
}
