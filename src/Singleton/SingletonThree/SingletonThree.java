package Singleton.SingletonThree;

/**
 * @description 懒汉模式，线程安全
 */
public class SingletonThree {
    private SingletonThree(){

    }
    private static int count = 0;
    private static SingletonThree instance;
    public static synchronized SingletonThree getInstance(){
        if(instance == null){
            //this.count --error 静态变量不能用this访问
            count++;
            //如果没有synchronized,这条语句将执行三遍
            //这是因为三个线程可能会出现一起执行到instance==null
            //而此时类已经创建完毕，instance == null
            //System.out.println(count);
            instance = new SingletonThree();
        }
        return instance;
    }
    public int getCount(){
        return count;
    }

}
