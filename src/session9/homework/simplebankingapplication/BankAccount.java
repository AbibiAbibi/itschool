package session9.homework.simplebankingapplication;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add(new Transaction("Initial Deposit", initialDeposit, initialDeposit));
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount, balance));
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", -amount, balance));
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (Transaction transaction : transactionHistory) {
            System.out.println("Type: " + transaction.getType());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Balance After Transaction: " + transaction.getBalanceAfterTransaction());
            System.out.println("------------------------");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}