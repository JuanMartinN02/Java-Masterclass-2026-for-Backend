public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized only lets one thread execute this code at a given time, fixes concurrency issues
    public synchronized void withdraw(double amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double originalBalance = this.balance;

        if (amount > this.balance) {
            System.out.println("NOT ENOUGH FUNDS!");
        }else {
            this.balance -= amount;
            System.out.printf("STARTING BALANCE: %.0f, WITHDRAW (%.0f) : NEW BALANCE: %.0f%n", originalBalance, amount, this.balance);
        }

    }

    public void deposit(double amount) {
        try {
            System.out.println("Talking to the teller...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Synchronized only lets one thread execute this code at a given time, fixes concurrency issues
        synchronized (this){
            double originalBalance = this.balance;
            this.balance += amount;
            System.out.printf("STARTING BALANCE: %.0f, DEPOSIT (%.0f) : NEW BALANCE: %.0f%n", originalBalance, amount, this.balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
