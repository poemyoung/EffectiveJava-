package Singleton;

/**
 * @description 枚举类型实现单例模式(最佳方法)
 */
public enum SingletonSeven {
    //枚举类中的每一个常量都是该类的一个实例
    INSTANCE;
    SingletonSeven(){
        System.out.println("创建中");
    }
    public void anyMethods(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println(INSTANCE instanceof SingletonSeven);
        //输出true,说明是Singleton的一个实例
        SingletonSeven instance = INSTANCE;
        //一定只会输出一个"创建中"
        instance.anyMethods();
    }
}
