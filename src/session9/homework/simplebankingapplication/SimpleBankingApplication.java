package session9.homework.simplebankingapplication;

import java.util.Scanner;

public class SimpleBankingApplication {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Simple Banking App");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Create an account number: ");
                    String accNum = scanner.next();
                    System.out.print("Initial deposit amount: ");
                    double initialDeposit = scanner.nextDouble();
                    bank.registerAccount(name, accNum, initialDeposit);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter your account number: ");
                    String accountNumber = scanner.next();
                    BankAccount userAccount = bank.login(accountNumber);

                    if (userAccount != null) {
                        while (true) {
                            System.out.println("\nWelcome, " + userAccount.getAccountHolderName());
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Transaction History");
                            System.out.println("5. Logout");
                            System.out.print("Choose an option: ");
                            int userChoice = scanner.nextInt();

                            switch (userChoice) {
                                case 1:
                                    System.out.print("Enter deposit amount: ");
                                    double depositAmount = scanner.nextDouble();
                                    userAccount.deposit(depositAmount);
                                    System.out.println("Deposit successful!");
                                    break;

                                case 2:
                                    System.out.print("Enter withdrawal amount: ");
                                    double withdrawalAmount = scanner.nextDouble();
                                    if (userAccount.withdraw(withdrawalAmount)) {
                                        System.out.println("Withdrawal successful!");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Current Balance: " + userAccount.getBalance());
                                    break;

                                case 4:
                                    userAccount.viewTransactionHistory();
                                    break;

                                case 5:
                                    System.out.println("Logging out...");
                                    break;

                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }

                            if (userChoice == 5) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid account number. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}