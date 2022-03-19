package internship_Java;

import java.util.Scanner;

class Account {
    private String accountNumber;
    private int balance;

    public Account(String accNum, int bal) {
        this.accountNumber = accNum;
        this.balance = bal;
    }

    public void setAccNum(String accNum) {
        this.accountNumber = accNum;
    }

    public String getAccNum() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int transactionAmount) {
        this.balance += transactionAmount;
        System.out.println("Balance after transaction is: " + this.balance);
    }

    public void withdraw(int transactionAmount) {
        if (balance >= transactionAmount) {
            balance -= transactionAmount;
            System.out.println("Balance after transaction is: " + this.balance);
        } else {
            System.out.println("Insufficient Balance");
            System.out.println("Balance after transaction is: " + this.balance);
        }
    }
}

public class AccountTransactions {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accNum = input.nextLine();
        System.out.println("Enter Account Balance");
        int bal = input.nextInt();
        input.nextLine();

        Account account = new Account(accNum, bal);
        System.out.println("-------------------------------------------------\n" +
                "Enter 1 to deposit an amount\n" +
                "Enter 2 to withdraw an amount");

        char choice = input.next().charAt(0);

        switch (choice) {
            case '1' -> {
                System.out.println("Enter the amount to deposit");
                int amount = input.nextInt();
                input.nextLine();
                account.deposit(amount);
            }
            case '2' -> {
                System.out.println("Enter the amount to withdraw");
                int w_amount = input.nextInt();
                input.nextLine();
                account.withdraw(w_amount);
            }
        }
    }
}
