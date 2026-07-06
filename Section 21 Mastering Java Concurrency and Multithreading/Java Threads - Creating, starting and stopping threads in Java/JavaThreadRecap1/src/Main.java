
public class Main {

    public static class  MyThread extends Thread{
        public void run(){
            System.out.println("Thread running!");
            System.out.println("Thread finished running!");
        }
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("(Runnable) Thread running!");
            System.out.println("(Runnable) Thread finished running!");
        }

    }

    public static void main(String[] args) {

        // #1 Create a subclass of the Thread Class
        MyThread thread1 = new MyThread();
        thread1.start();

        // #2 Create a runnable Class that implements runnable interface (Recommended)
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // #3 Runnable with lambda expression
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("(Runnable Lambda) Thread running! " + threadName);
            // Sleep the thread
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("(Runnable Lambda) Thread finished running! " + threadName);
        };
        Thread thread3 = new Thread(runnable, "**Thread Name Test**");
        thread3.start();

    }
}