import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class ShoeShop {
    public static void main(String[] args) {
        ShoeWarehouse warehouse = new ShoeWarehouse();

        // 1. Asynchronous execution for the pool
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        forkJoinPool.execute(new RecursiveActionWarehouse(warehouse, 8));

        // 2. Schedule consumers
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            try {
                warehouse.fulfillOrder();
            } catch (InterruptedException e) {
                // Restore the interrupted status and stop execution
                Thread.currentThread().interrupt();
                throw new RuntimeException("Consumer interrupted", e);
            }
        }, 1, 2, TimeUnit.SECONDS);

        // 3. Graceful Shutdown
        scheduler.schedule(scheduler::shutdown, 10, TimeUnit.SECONDS);
        forkJoinPool.shutdown();

        try {
            sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(warehouse.orders);
    }
}

