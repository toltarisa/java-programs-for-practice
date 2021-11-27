import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable {

    CyclicBarrier cyclicBarrier;

    public Process (CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Finished: " + Thread.currentThread().getName());

    }
}

public class CyclicBarrierDemo {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(
                4,
                () -> System.out.println("All threads reached the barrier")
        );

        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 4; i++) {
            service.submit(new Process(cyclicBarrier));
        }
    }
}
