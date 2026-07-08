import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Marston", 10000);

        Thread thread1 = new Thread(() -> account.withdraw(5000));
        Thread thread2 = new Thread(() -> account.deposit(2500));
        Thread thread3 = new Thread(() -> account.setName("Tim Wallace"));
        Thread thread4 = new Thread(() -> account.deposit(2500));


        thread1.start();
        thread2.start();
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        thread4.start(); 

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("FINAL BALANCE: " + account.getBalance());
    }
}