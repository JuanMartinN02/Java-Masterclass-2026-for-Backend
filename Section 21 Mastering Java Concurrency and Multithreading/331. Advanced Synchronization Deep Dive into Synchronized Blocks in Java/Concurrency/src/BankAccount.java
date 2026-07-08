public class BankAccount {
    private double balance;
    private String name;

    private final Object lockName = new Object();
    private final Object lockBalance = new Object();

    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    // Synchronized only lets one thread execute this code at a given time, fixes concurrency issues
    public void withdraw(double amount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double originalBalance = this.balance;

        synchronized (this.lockBalance) {
            if (amount > this.balance) {
                System.out.println("NOT ENOUGH FUNDS!");
            } else {
                this.balance -= amount;
                System.out.printf("STARTING BALANCE: %.0f, WITHDRAW (%.0f) : NEW BALANCE: %.0f%n", originalBalance, amount, this.balance);
            }
        }

    }

    public synchronized void deposit(double amount) {
        try {
            System.out.println("Talking to the teller...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Synchronized only lets one thread execute this code at a given time, fixes concurrency issues
        // Can only pass Objects as values
        synchronized (this.lockBalance){
            double originalBalance = this.balance;
            this.balance += amount;
            System.out.printf("STARTING BALANCE: %.0f, DEPOSIT (%.0f) : NEW BALANCE: %.0f%n", originalBalance, amount, this.balance);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // This only locks the name variable, so others threads can execute on other variables.
        synchronized (this.lockName){
            this.name = name;
            System.out.println("NEW ACCOUNT NAME: " + this.name);
        }
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void setBalance(double balance) {
        this.balance = balance;
    }
}
