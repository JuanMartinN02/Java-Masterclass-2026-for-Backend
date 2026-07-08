public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        Thread thread1 = new Thread(() -> account.withdraw(5000));
        Thread thread2 = new Thread(() -> account.deposit(2500));
        Thread thread3 = new Thread(() -> account.deposit(2500));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("FINAL BALANCE: " + account.getBalance());
    }
}