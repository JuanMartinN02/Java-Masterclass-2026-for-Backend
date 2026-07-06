import java.lang.management.MonitorInfo;

public class DaemonThreadsAndStops {

    public static class StoppableRunnable implements Runnable{
        private boolean stopRequest = false;

        public synchronized void requestStop(){
            this.stopRequest = true;
        }

        public synchronized boolean isStopRequested(){
            return this.stopRequest;
        }

        private void sleep(int millisecond) {
            try {
                Thread.sleep(millisecond);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            System.out.println("(Runnable) Thread running!");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("(Runnable) Thread finished running!");
        }

    }

    public static void main(String[] args) {
        /*
        I'm creating a Thread that can be stopped. To stop the thread we need
        to call the stop on the runnable (the process), as it's the one that contains
        the business logic.
        */

        StoppableRunnable stoppable = new StoppableRunnable();

        Thread thread = new Thread(stoppable, "Stoppable Thread");
        thread.start();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("**Requesting stop**");
        stoppable.requestStop();
        System.out.println("**Stop requested**");
    }
}
