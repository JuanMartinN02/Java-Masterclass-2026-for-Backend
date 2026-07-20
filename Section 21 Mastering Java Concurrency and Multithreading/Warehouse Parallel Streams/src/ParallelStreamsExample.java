import java.util.stream.IntStream;

public class ParallelStreamsExample {
    private static final int TIME = 5;

    public static void main(String[] args) {
        // Parallel Stream vs Sequential Stream!

        // Sequential
        for (int i = 0; i < TIME; i++){
            var beforeSequential = System.currentTimeMillis();
            System.out.println("(Sequential) Result (" + i + ") :" + IntStream.range(1, 100_000_000).sum());
            System.out.println(System.currentTimeMillis() - beforeSequential);
        }

        // Parallel
        for (int i = 0; i < TIME; i++){
            var beforeParallel = System.currentTimeMillis();
            System.out.println("(Parallel) Result (" + i + ") :" + IntStream.range(1, 100_000_000).parallel().sum());
            System.out.println(System.currentTimeMillis() - beforeParallel);
        }

        // As always, we have to be careful with concurrency issues when using parallelization!
        System.out.println("**REDUCE** (Sequential) Result:" + IntStream.rangeClosed(1, 10)
                .reduce(100, Integer::sum));

        System.out.println("**REDUCE** (Parallel) Result:" + IntStream.rangeClosed(1, 10)
                .parallel()
                .reduce(100, Integer::sum));
    }
}
