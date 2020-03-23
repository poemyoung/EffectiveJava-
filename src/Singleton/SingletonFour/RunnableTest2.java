package Singleton.SingletonFour;

public class RunnableTest2 implements Runnable{
    private Thread thread;
    private String name;
    public RunnableTest2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        SingletonFour a = SingletonFour.getInstance();
    }
    public void start(){
        thread = new Thread(this,this.name);
        thread.start();
    }

    public static void main(String[] args) {
        RunnableTest2 thread1 = new RunnableTest2("thread1");
        RunnableTest2 thread2 = new RunnableTest2("thread2");
        RunnableTest2 thread3 = new RunnableTest2("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
