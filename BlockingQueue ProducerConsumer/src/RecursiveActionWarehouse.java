import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RecursiveActionWarehouse extends RecursiveAction {
    private ShoeWarehouse warehouse;
    private int shoesToAdd = 0;

    public RecursiveActionWarehouse(ShoeWarehouse warehouse, int shoesToAdd) {
        this.warehouse = warehouse;
        this.shoesToAdd = shoesToAdd;
    }

    @Override
    protected void compute() {
        // If the workload is above the threshold, breaks task into smaller tasks
        if (this.shoesToAdd > 1){
            System.out.println("Splitting workload: " + this.shoesToAdd);

            long workload1 = this.shoesToAdd / 2;
            long workload2 = this.shoesToAdd - workload1;

            RecursiveActionWarehouse subtask1 = new RecursiveActionWarehouse(warehouse, (int)workload1);
            RecursiveActionWarehouse subtask2 = new RecursiveActionWarehouse(warehouse, (int)workload2);

            // invokeAll handles the forking and joining automatically
            invokeAll(subtask1, subtask2);

        }else {
            System.out.println("Doing workload by itself: " + this.shoesToAdd);
            int shoeIndex = ThreadLocalRandom.current().nextInt(0, ShoeWarehouse.getProducts().size());
            try {
                warehouse.receiveOrder(ShoeWarehouse.getProducts().get(shoeIndex));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
