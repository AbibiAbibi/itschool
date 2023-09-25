package session11.homework;

public abstract class Bank {

    abstract double getBalance();
}

class BankA extends Bank {

    private double balance = 100;

    @Override
    public double getBalance() {
        return balance;
    }
}

class BankB extends Bank {

    private double balance = 150;

    @Override
    public double getBalance() {
        return balance;
    }
}

class BankC extends Bank {

    private double balance = 200;

    @Override
    public double getBalance() {
        return balance;
    }
}