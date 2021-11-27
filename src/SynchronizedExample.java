import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedExample {

    private int sum = 0;

    public void increment() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedExample example = new SynchronizedExample();

        for (int i = 0; i < 1000; i++)
            service.submit(example::increment);

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        System.out.println(example.getSum());
    }
}
