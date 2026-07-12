import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ShoeWarehouse warehouse = new ShoeWarehouse();

        Thread producer = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++){
                        int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size() - 1);
                        warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                    }
                }
        );

        Thread consumer1 = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++){
                        warehouse.fulfillOrder();
                    }
                }
        );

        Thread consumer2 = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++){
                        warehouse.fulfillOrder();
                    }
                }
        );

        producer.start();
        consumer1.start();
        consumer2.start();

    }
}