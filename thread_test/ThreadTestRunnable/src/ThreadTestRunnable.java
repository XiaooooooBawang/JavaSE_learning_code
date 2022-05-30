public class ThreadTestRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("ThreadTestRunnable is running ...");
    }

    public static void main(String[] args){
        ThreadTestRunnable runnable = new ThreadTestRunnable();
        Thread t2 = new Thread(runnable);
        t2.run();
    }
}
