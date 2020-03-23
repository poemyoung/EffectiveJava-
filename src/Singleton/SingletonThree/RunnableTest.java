package Singleton.SingletonThree;

/**
 * @description 测试的类
 */
public class RunnableTest implements Runnable {
    private Thread thread;
    private String name;
    public RunnableTest(String name){
        this.name = name;
    }
    @Override
    public void run() {
        SingletonThree single = SingletonThree.getInstance();
        System.out.println(this.name+single.getCount());
    }
    public void start(){
        thread = new Thread(this,name);
        thread.start();
    }

    public static void main(String[] args) {
        RunnableTest a = new RunnableTest("thread1: ");
        RunnableTest b = new RunnableTest("thread2: ");
        RunnableTest c = new RunnableTest("thread3: ");
        a.start();
        b.start();
        c.start();
        //输出 thread1: 1
        //   thread3: 1
        //  thread2: 1
    }
}
