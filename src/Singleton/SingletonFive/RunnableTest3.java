package Singleton.SingletonFive;

import Singleton.SingletonThree.RunnableTest;

public class RunnableTest3 implements Runnable{
    private Thread thread;
    public RunnableTest3(){

    }
    @Override
    public void run() {
        SingletonFive a = SingletonFive.getInstance();
    }
    public void start(){
        thread = new Thread(this,"thread");
        thread.start();
    }

    public static void main(String[] args) {
        RunnableTest3 a = new RunnableTest3();
        RunnableTest3 b = new RunnableTest3();
        RunnableTest3 c = new RunnableTest3();
        a.start();
        b.start();
        c.start();
    }
}
