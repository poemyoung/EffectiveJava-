package Singleton;

/**
 * @description 静态内部类
 */
public class SingletonSix {
    private SingletonSix(){

    }
    //静态内部类
    private static class GetInstance{
        public static final SingletonSix INSTANCE = new SingletonSix();
    }
    public static SingletonSix getInstance(){
       return GetInstance.INSTANCE;
    }
}
