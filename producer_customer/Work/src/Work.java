import java.util.LinkedList;
import java.util.Queue;

public class Work {
    public static final Integer MAX_QUEUE=3;
    public static final Integer MAX_PRODUCER=5;
    public static final Integer MAX_CUSTOMER=2;

    public static void main(String[] args){
        Queue<Goods> queue = new LinkedList<>();
        for(int i=0;i<MAX_PRODUCER;i++)
        {
            Producer producer = new Producer("生产者"+i+"号",queue,MAX_QUEUE);
            producer.start();
        }
        for(int i=0;i<MAX_CUSTOMER;i++)
        {
            Customer customer = new Customer("消费者"+i+"号",queue);
            customer.start();
        }
    }
}
