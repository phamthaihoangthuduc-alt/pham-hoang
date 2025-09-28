package iuh.fit.opp;

import java.util.Scanner;

public class BanKTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank("IUH bank",100);
		
		int choice;
		do {
			System.out.println("\nWelcome to IUH bank");
			System.out.println("1. Open new account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. The total balance of all bank accounts in the bank");
			System.out.println("6. Print all bank accoutns");
			System.out.println("7. Exit");
			System.out.println("Enter your choice:");
			
			choice = Integer.parseInt(sc.nextLine());
		try{
			switch (choice) {
			case 1: // Mở tài khoản mới
                System.out.println("Add new account");
                System.out.print("Enter account number: ");
                String accNumber = sc.nextLine();

                System.out.print("Enter account name: ");
                String accName = sc.nextLine();

                System.out.print("Enter balance: ");
                double balance = Double.parseDouble(sc.nextLine());

                bank.addNew(accNumber, accName, balance);
                System.out.println("Account created successfully!");
                break;

            case 2: // Nạp tiền
                System.out.print("Enter account number: ");
                String depNumber = sc.nextLine();

                BankAccount depAcc = bank.find(depNumber);
                if (depAcc != null) {
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = Double.parseDouble(sc.nextLine());
                    depAcc.deposit(depAmount);
                    System.out.println("Deposit successful!");
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 3: // Rút tiền
                System.out.print("Enter account number: ");
                String withNumber = sc.nextLine();

                BankAccount withAcc = bank.find(withNumber);
                if (withAcc != null) {
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = Double.parseDouble(sc.nextLine());
                    withAcc.withdraw(withAmount);
                    System.out.println("Withdraw successful!");
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 4: // Chuyển tiền
                System.out.print("Enter source account number: ");
                String srcNumber = sc.nextLine();
                BankAccount srcAcc = bank.find(srcNumber);

                System.out.print("Enter destination account number: ");
                String destNumber = sc.nextLine();
                BankAccount destAcc = bank.find(destNumber);

                if (srcAcc != null && destAcc != null) {
                    System.out.print("Enter amount to transfer: ");
                    double transAmount = Double.parseDouble(sc.nextLine());
                    srcAcc.transfer(destAcc, transAmount);
                    System.out.println("Transfer successful!");
                } else {
                    System.out.println("Invalid account(s)!");
                }
                break;

            case 5: // Tổng số dư
                System.out.println("Total balance: " + bank.getTotalBalance());
                break;

            case 6: // In tất cả tài khoản
                System.out.println("All accounts in the bank:");
                for (BankAccount acc : bank.getAccounts()) {
                    if (acc != null) {
                        System.out.println(acc);
                    }
                }
                break;

            case 7:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

} while (choice != 7);

sc.close();
			
	}
}
