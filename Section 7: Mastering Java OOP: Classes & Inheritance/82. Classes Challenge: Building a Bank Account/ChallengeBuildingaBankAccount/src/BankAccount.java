public class BankAccount {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(int number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient funds!");
            return;
        }
        this.balance -= amount;
        System.out.println("Your new balance is $" + this.balance);
    }

    public void deposit(double amount){
        this.balance += amount;

        System.out.println("Your new balance is $" + this.balance);
    }
}
