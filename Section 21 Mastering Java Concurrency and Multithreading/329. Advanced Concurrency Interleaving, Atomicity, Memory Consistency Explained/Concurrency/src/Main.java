public class Main {

    public static void main(String[] args) {
        CachedData data = new CachedData(50);

        Runnable writer = () -> {
            System.out.println("(writer) Thread running! ");

            while (data.flag()){}

            try {
                data.setFlag(true);
                System.out.println("(writer) Locking data");
                data.setData(22);
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            data.setFlag(false);
            System.out.println("(writer) Unlocking data");
            System.out.println("(writer) Thread finished running! ");
        };

        Runnable reader = () -> {
            System.out.println("(reader) Thread running! ");
            while (data.flag()){}
            data.setFlag(true);
            System.out.println("(reader) Locking data");
            System.out.println(data.getData());
            data.setFlag(false);
            System.out.println("(reader) Unlocking data");
            System.out.println("(reader) Thread finished running! ");
        };

        Thread thread1 = new Thread(writer);
        Thread thread2 = new Thread(reader);

        thread1.start();
        thread2.start();

    }
}