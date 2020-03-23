package Singleton.SingletonFour;

/**
 * @description 饿汉模式，线程安全
 * @warn: 类可能会多次加载！
 */
public class SingletonFour {
    //类加载时就进行初始化
    private static SingletonFour instance = new SingletonFour();
    private SingletonFour(){
        System.out.println("创建一个类了");
    }
    public static SingletonFour getInstance(){
        return instance;
    }
}
