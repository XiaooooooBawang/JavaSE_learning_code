import java.util.Queue;

public class Customer extends Thread{
    private String name;
    private Queue<Goods> queue;
    public Customer(String name,Queue<Goods> queue){
        this.name=name;
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            synchronized (queue){
                if(queue.isEmpty()){
                    try {
                        System.out.println("队列空了，不消费了，等等");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.buy();
                    queue.notifyAll();   //唤醒生产者
                }
            }
        }
    }
    public  void buy(){
        Goods goods = queue.poll();
        System.out.println(this.name+"消费了"+goods.getGoods_Id()+"号商品");
    }
}
