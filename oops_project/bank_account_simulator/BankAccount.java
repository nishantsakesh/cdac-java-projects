class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    void withdraw(double amount) {

        if(amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}