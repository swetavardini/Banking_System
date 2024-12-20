public class BankingSystem {
    private String accountNumber;
    private String accountName;
    private double balance;
    
    public BankingSystem(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0; 
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // public void displayAccountDetails() {
    //     System.out.println("Account Number: " + accountNumber);
    //     System.out.println("Account Name: " + accountName);
    //     System.out.println("Balance: " + balance);
    // }
}
