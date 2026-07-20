import java.util.concurrent.*;

public class ShoeShop {
    public static void main(String[] args) {
       ShoeWarehouse warehouse = new ShoeWarehouse();
//
//        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
//
//        // Implementing ForksJoin to divide the AddOrder Tasks
//        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
//
//        RecursiveActionWarehouse myRecursiveAction = new RecursiveActionWarehouse(warehouse, 8);
//        forkJoinPool.invoke(myRecursiveAction);
//
//        scheduler.scheduleAtFixedRate(warehouse::fulfillOrder, 1, 2, TimeUnit.SECONDS);
//
//        scheduler.schedule(scheduler::shutdown,15, TimeUnit.SECONDS);
//
//
//        // Parallel Stream vs Sequential Stream!
//        var before = System.currentTimeMillis();
//
//
//
//        System.out.println(System.currentTimeMillis() - before);

        warehouse.inventoryToUpperParallel();
        warehouse.inventoryToUpperSeq();
    }
}

