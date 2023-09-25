package session11.homework;

public class TestBank {

    public static void main(String[] args) {
        Bank firstBank = new BankA();
        Bank secondBank = new BankB();
        Bank thirdBank = new BankC();

        System.out.println("BankA balance: $" + firstBank.getBalance());
        System.out.println("BankB balance: $" + secondBank.getBalance());
        System.out.println("BankC balance: $" + thirdBank.getBalance());
    }
}