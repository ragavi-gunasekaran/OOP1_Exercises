package lexicon.exercises;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method to deposit
    public void deposit(double amount){
        System.out.println("Amount to deposit : " + amount);
        balance += amount;
        System.out.println("Balance amount in " + accountHolder + " account after deposit : " + getBalance());
    }

    //method to withdraw
    public void withdraw(double amount){
        System.out.println("Amount to withdraw : " + amount);
        balance -= amount;
        System.out.println("Balance amount in " + accountHolder + " account after withdrawal : " + getBalance());
    }
}
