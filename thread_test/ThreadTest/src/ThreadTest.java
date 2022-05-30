public class ThreadTest extends Thread{
    @Override
    public void run(){
        System.out.println("ThreadTest is running ...");
    }

    @Override
    public synchronized void start() {
        System.out.println("ThreadTest is starting ...");
        super.start();
    }

    public static void main(String[] args){   //在main函数这个主线程中，运行t1这个线程
        ThreadTest t1 = new ThreadTest();
        //t1.run();
        t1.start();  //start里面会自动运行run
    }
}
