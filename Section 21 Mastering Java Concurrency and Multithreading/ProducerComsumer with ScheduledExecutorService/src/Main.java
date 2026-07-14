import com.sun.source.tree.WhileLoopTree;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ShoeWarehouse warehouse = new ShoeWarehouse();

        /*
        In standard ExecutorService, tasks run as soon as possible. ScheduledExecutorService allows you to control when a task runs.
        It is essential for periodic tasks (like monitoring) or deferred execution (like retries).

        schedule(task, delay, unit): Executes a task once after a delay.

        scheduleAtFixedRate(task, initialDelay, period, unit): Runs the task at a strict time interval, regardless of how long the task takes to complete.

        scheduleWithFixedDelay(task, initialDelay, delay, unit): Ensures a specific pause between the end of one execution and the start of the next.
         */

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        scheduler.scheduleAtFixedRate(() ->
                {
                    int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size());
                    warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
                }, 0, 5, TimeUnit.SECONDS
                );

        scheduler.scheduleAtFixedRate(warehouse::fulfillOrder, 5, 3, TimeUnit.SECONDS
        );

        scheduler.schedule(scheduler::shutdown,15, TimeUnit.SECONDS);

    }
}