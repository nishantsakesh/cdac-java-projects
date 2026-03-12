import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(101, "Nishant", 5000);

        int choice;

        do {

            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    acc.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    acc.withdraw(withdraw);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}