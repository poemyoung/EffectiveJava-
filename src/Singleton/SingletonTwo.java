package Singleton;

/**
 * @description 懒汉模式，线程不安全
 */
public class SingletonTwo {
    private static SingletonTwo instance;
    //私有构造函数
    private SingletonTwo(){

    }
    private static int count = 0;

    public static SingletonTwo getInstance(){
        if(instance == null){
            count++;
            instance = new SingletonTwo();
        }
        return instance;
    }
    public int getCount(){
        return count;
    }

    //测试
    public static void main(String[] args) {
        SingletonTwo a = SingletonTwo.getInstance();
        System.out.println(a.getCount());
        //输出1
        SingletonTwo b = SingletonTwo.getInstance();
        System.out.println(b.getCount());
        //输出1，表明只在调用第一次getInstance的时候创建了一个对象
    }
}
