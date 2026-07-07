import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running!");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " finished executing!");
        }, "MainThread");

        Thread threadWatcher = new Thread(() -> {
            long now = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() + " is running!");

            while (thread1.isAlive()){
                try {
                    Thread.sleep(1000);

                    if (System.currentTimeMillis() - now > 2000){
                        thread1.interrupt();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() + " finished executing!");
        }, "MonitorThread");

        Thread threadDownload = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running!");
            try {
                for (int i = 0; i < 5; i++){
                    sleep(2000);
                    System.out.print(".");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " finished executing!");
        }, "DownloadThread");

        threadDownload.start();
        System.out.println("Main thread is waiting for Download thread...");
        threadDownload.join();
        thread1.start();
        threadWatcher.start();


    }
}