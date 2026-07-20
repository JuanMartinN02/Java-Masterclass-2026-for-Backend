import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.sleep;

public class ShoeWarehouse {
    public static List<String> products = Arrays.asList(
            "Air Jordan 1",
            "Air Jordan 3",
            "Air Jordan 4",
            "Air Jordan 11",
            "Nike Air Force 1",
            "Nike Air Max 90",
            "Nike Air Max 97",
            "Adidas Superstar",
            "Adidas Stan Smith",
            "Adidas Ultraboost",
            "Adidas Yeezy Boost 350"
    );

    // Replacing Queue with BlockingQueue where the thread automatically waits until space is available!
    public BlockingQueue<String> orders = new ArrayBlockingQueue<>(10);

    // Replacing Queue with BlockingQueue (No need to check if Queue is full or SYNCHRONIZED)
    public void receiveOrder(String order) throws InterruptedException {
        System.out.println("(Producer) Registering order");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // .put() automatically blocks if queue is full
        orders.put(order);
        System.out.println("(Producer) Added: " + order);
    }

    // Replacing Queue with BlockingQueue (No need to check if Queue is empty or SYNCHRONIZED)
    public synchronized void fulfillOrder() throws InterruptedException {
        System.out.println("(Consumer) Fulfilling order");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // .take() automatically blocks if queue is empty
        String order = orders.take();
        System.out.println("(Consumer) Fulfilled: " + order);
    }

    // Implementing Parallel Streams!
    public synchronized void inventoryToUpperSeq(){
        var before = System.currentTimeMillis();
        List<String> capitalizedInv = products.stream().map(s -> {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return s.toUpperCase();
        }).toList();

        System.out.println("**Sequential** Capitalization: \n" + capitalizedInv);
        System.out.println("**Sequential** Capitalization: (ms)" + (System.currentTimeMillis() - before));
        System.out.println();
    }

    public synchronized void inventoryToUpperParallel(){
        var before = System.currentTimeMillis();
        List<String> capitalizedInv = products.stream().map(s -> {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return s.toUpperCase();
        }).parallel().toList();

        System.out.println("**Parallel** Capitalization: \n" + capitalizedInv);
        System.out.println("**Parallel** Capitalization: (ms)" + (System.currentTimeMillis() - before));
        System.out.println();
    }


    public static List<String> getProducts() {
        return products;
    }

    public Queue<String> getOrders() {
        return orders;
    }
    
}