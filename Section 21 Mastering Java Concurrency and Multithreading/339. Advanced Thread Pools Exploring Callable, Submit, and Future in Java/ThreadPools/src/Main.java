import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        ShoeWarehouse warehouse = new ShoeWarehouse();

        // CachedThreadPool. Creates as many Threads as necessary for the tasks.
        // We also use submit instead of execute. This method can implement a callable.
        // Callable, unlike runnable, can return a value.
        ExecutorService producerCachedPool = Executors.newCachedThreadPool();

        try {
            producerCachedPool.execute(
                    () -> {
                        for (int i = 0; i < 5; i++){
                            int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size() - 1);
                            warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                        }
                    });
            producerCachedPool.submit(
                    () -> {
                        for (int i = 0; i < 5; i++){
                            int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size() - 1);
                            warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                        }
                    });
            producerCachedPool.submit(
                    () -> {
                        for (int i = 0; i < 5; i++){
                            int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size() - 1);
                            warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                        }
                    });
        }finally {
            producerCachedPool.shutdown();
        }

        // FixedThreadPool (Define a specific number of threads in the pool, allowing multiple tasks to run in parallel.)
        ExecutorService consumerThreadPool = Executors.newFixedThreadPool(2);

        consumerThreadPool.execute(
                () -> {
                    for (int i = 0; i < 5; i++){
                        warehouse.fulfillOrder();
                    }
                }
        );

        consumerThreadPool.execute(
                () -> {
                    for (int i = 0; i < 5; i++){
                        warehouse.fulfillOrder();
                    }
                }
        );

    }
}