import static java.lang.Thread.sleep;

public class DaemonTryOut {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("running!");
            }
        };

           // low-priority background thread that provides auxiliary services to user (non-daemon) threads
           // The JVM will automatically exit as soon as all user threads finish executing
           Thread thread = new Thread(runnable);
           thread.setDaemon(true);
           thread.start();

           // When main thread stops, Daemon threads stop
           sleep(3100);

        }
}

