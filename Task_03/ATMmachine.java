import java.util.*;

class BankAccount {
    private double balance;
    public BankAccount(double inbalance) {
        this.balance = inbalance;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("withdraw successfully!");
        } else {
            System.out.println("insufficient balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit successfully!");
        } else {
            System.out.println("invalid! try agian..");
        }
    }

    public double getBalance() {
        return balance;
    }

}


// create ATM class to represent bankaccount

class ATM{
    Scanner sc = new Scanner(System.in);
    private BankAccount account;

    // connect atm to bankaccoount
    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        while (true) {
            System.out.println("welcome to the ATM machine!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit!");
            System.out.print("Enter here: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:wid();
                    break;
                case 2:dep();
                    break;
                case 3:checkBal();
                    break;
                case 4:System.out.println("Thank you for using ATM machine !!");
                    return;
                default:System.out.println("invalid!");
                    break;
            }
        }
    }

    public void wid() {
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    public void dep() {
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    public void checkBal() {
        System.out.println("Current Balance: "+account.getBalance());
    }

}

public class ATMmachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.start();

    }

}
