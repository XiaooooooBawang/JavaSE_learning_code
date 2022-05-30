import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTestCallable implements Callable {
    @Override
    public Object call() throws InterruptedException {     //这里抛出异常是给sleep的异常签名
        System.out.println("ThreadTestCallable is running");
        System.out.println("睡两秒");
        Thread.sleep(2000);
        System.out.println("醒来,结束线程,返回值");
        return 1;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {  //这里抛出异常是给get的异常签名
        ThreadTestCallable callable = new ThreadTestCallable();
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        System.out.println(futureTask.get());
    }
     //FutureTask的get()方法返回call()方法的返回值，如果调用get时，call还没有执行完，那么调用get的线程就会阻塞等待知道call返回值
}
