import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{
    private String name;
    private Queue<Goods> queue;
    private Integer max_queue;

    public Producer(String name,Queue<Goods> queue,Integer max_queue){
        this.name=name;
        this.queue=queue;
        this.max_queue=max_queue;
    }

    @Override
    public void run(){
        Random random = new Random();
        while (true){
            try {
                Thread.sleep(2000);   //模拟下面生产耗时2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Goods goods = this.produce(random.nextInt(1000)+1);  // 生产
            //synchronized锁
            synchronized (queue){
                if(queue.size()<Work.MAX_QUEUE){
                    queue.add(goods);  //商品入列
                    System.out.println(this.name+"生产了"+goods.getGoods_Id()+"号商品");
                    queue.notifyAll();  //唤醒消费者
                } else {
                    try {
                        System.out.println("队列满了，不生产了，休息一会儿");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public Goods produce(Integer id){
        Goods goods = new Goods(id);
        return goods;
    }
}
