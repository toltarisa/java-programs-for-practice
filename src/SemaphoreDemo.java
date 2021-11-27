import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                Connection.getInstance().connect();
            });
        }

        service.shutdown();
    }
}

class Connection {

    private static Connection instance = new Connection();
    private int connectionCount = 0;
    private Semaphore semaphore = new Semaphore(3);

    private Connection() {}

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            doConnect();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }

    private void doConnect() throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println("Connection count " + connectionCount);
        }

        Thread.sleep(1000);

        synchronized (this) {
            connectionCount--;
        }
    }
}