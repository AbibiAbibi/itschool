package session9.homework.simplebankingapplication;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void registerAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        BankAccount account = new BankAccount(accountHolderName, accountNumber, initialDeposit);
        accounts.put(accountNumber, account);
    }

    public BankAccount login(String accountNumber) {
        return accounts.get(accountNumber);
    }
}