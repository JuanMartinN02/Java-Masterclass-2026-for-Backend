import java.util.concurrent.ForkJoinPool;

import static java.lang.Thread.sleep;

public class JavaForkJoinPoolExample {

    public static void main(String[] args) {
        // Automatically adjusts to your CPU
        ForkJoinPool forkJoinPool1 = ForkJoinPool.commonPool();

        // Create the parallelism level yourself (amount of threads at the same time)
        ForkJoinPool forkJoinPool2 = new ForkJoinPool(4);

        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(123);
        forkJoinPool1.invoke(myRecursiveAction);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
