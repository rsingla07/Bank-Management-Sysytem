import java.util.Scanner;

class BankAccount {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited.");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                account.deposit(amt);
            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                account.withdraw(amt);
            }
            else if (choice == 3) {
                account.checkBalance();
            }
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
