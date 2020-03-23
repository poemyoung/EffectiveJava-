package Singleton.SingletonFive;

/**
 * @description 双重校验锁，Double-Checked locking
 */
public class SingletonFive {
    //一重锁，当instance变量发生改变时会立刻通知其它的线程
    //并改变其他线程中的instance变量
    private static volatile SingletonFive instance;
    private static volatile int count = 0;
    private SingletonFive(){

    }
    public static SingletonFive getInstance(){
       //第一次校验instance
        if(instance == null){
            //可能有多个线程在此等待
            synchronized (SingletonFive.class){System.out.println(count++);}
            //以上必定会按顺序输出0，1，2......
            //第二重锁，把整个类放进去，表示所有变量均与之相关
            synchronized (SingletonFive.class){
                //再次校验instance，确定是否已经有其它线程初始化了instance
                if(instance == null){
                    instance = new SingletonFive();
                }
            }
        }
        return instance;
    }

}
