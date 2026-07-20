import java.util.*;

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

    public Queue<String> orders = new LinkedList<>();

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

    public synchronized void receiveOrder(String order){
        System.out.println("(Producer) Order received!");

        while (orders.size() > 10){
            try {
                System.out.println("(Producer) Waiting, orders full!");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("(Producer) Registering order");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("(Producer) Adding order for: " + order);
        orders.add(order);
        System.out.println(orders.toString());
        notifyAll();
    }

    public synchronized void fulfillOrder(){
        System.out.println("(Consumer) Checking orders!");

        while (orders.isEmpty()){
            try {
                System.out.println("(Consumer) Waiting, no orders!");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("(Consumer) Fulfilling order");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("(Consumer) Fulfilled order for: " + orders.peek());
        orders.poll();
        System.out.println(orders.toString());
        notifyAll();

    }


    public static List<String> getProducts() {
        return products;
    }

    public Queue<String> getOrders() {
        return orders;
    }
    
}