import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        ShoeWarehouse warehouse = new ShoeWarehouse();

        // CachedThreadPool. Creates as many Threads as necessary for the tasks.
        // We also use submit instead of execute. This method can implement a callable.
        // Callable, unlike runnable, can return a value.
        ExecutorService executor = Executors.newCachedThreadPool();

        try {
            executor.submit(
                    () -> {
                        for (int i = 0; i < 10; i++){
                            int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size() - 1);
                            warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                        }
                    });
            executor.submit(
                    () -> {
                        for (int i = 0; i < 5; i++){
                            warehouse.fulfillOrder();
                        }
                    });
            executor.submit(
                    () -> {
                        for (int i = 0; i < 5; i++){
                            warehouse.fulfillOrder();
                        }
                    });
        }finally {
            executor.shutdown();
        }
    }
}