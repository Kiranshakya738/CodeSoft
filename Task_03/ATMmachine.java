import java.util.*;

<<<<<<< HEAD

// create bankaccount class to represent user's account
=======
>>>>>>> 3223258 (third commit)
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


<<<<<<< HEAD
// create ATM class 
=======
// create ATM class to represent bankaccount

>>>>>>> 3223258 (third commit)
class ATM{
    Scanner sc = new Scanner(System.in);
    private BankAccount account;

    // connect atm to bankaccoount
    public ATM(BankAccount account) {
        this.account = account;
    }

<<<<<<< HEAD

    // design interface
=======
>>>>>>> 3223258 (third commit)
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

<<<<<<< HEAD
    // method to take input and call withdraw method
=======
>>>>>>> 3223258 (third commit)
    public void wid() {
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

<<<<<<< HEAD
    // method to take input and call deposite method
=======
>>>>>>> 3223258 (third commit)
    public void dep() {
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

<<<<<<< HEAD

    // method to call getbalance
=======
>>>>>>> 3223258 (third commit)
    public void checkBal() {
        System.out.println("Current Balance: "+account.getBalance());
    }

}

<<<<<<< HEAD


// main class
public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create bankaccount useraccount
        BankAccount userAccount = new BankAccount(10000);
        // create useraccount atm
        ATM atm = new ATM(userAccount);
        atm.start(); // start the process
=======
public class ATMmachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(10000);
        ATM atm = new ATM(userAccount);
        atm.start();
>>>>>>> 3223258 (third commit)

    }

}
