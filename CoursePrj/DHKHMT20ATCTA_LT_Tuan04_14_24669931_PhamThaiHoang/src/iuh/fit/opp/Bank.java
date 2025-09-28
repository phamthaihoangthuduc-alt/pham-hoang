package iuh.fit.opp;
import java.util.Arrays;

public class Bank {
	private String name;
	private BankAccount[] accounts;
	private int capacity;
	private int size;
	
	//constructor khong co tham so
	public Bank() {
		this("No name",100);
	}
	//constructor co tham so
	public Bank(String name,int numberOfAccounts) {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name must be not null");
		}
		if(numberOfAccounts <= 0) {
			throw new IllegalArgumentException("numberofaccounts must be geater than 0");
		}
		this.name = name;
		this.capacity = numberOfAccounts;
		this.accounts = new BankAccount[numberOfAccounts];
		this.size = 0;
	}
	
	// tim tai khoan 
	public BankAccount find(String accountNumber) {
		if(accountNumber == null) {
			return null;
		}
		for(int i = 0 ; i < size ; i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	//mo 1 tai khoan moi va them vao danh sach cac tai khoan ngan hang
	public void addNew(String accountNumber, String accountName, double balance) {
	    if (size >= capacity) {
	        throw new IllegalArgumentException("Bank is full");
	    }
	    if (accountNumber == null || accountNumber.trim().isEmpty()) {
	        throw new IllegalArgumentException("The account number must not be null");
	    }
	    if (accountName == null || accountName.trim().isEmpty()) {
	        throw new IllegalArgumentException("The owner name must not be null");
	    }
	    if (balance < 0) {
	        throw new IllegalArgumentException("Balance must be greater than or equal to 0");
	    }
	    if (find(accountNumber) != null) {
	        throw new IllegalArgumentException("Account number already exists");
	    }

	    BankAccount newAccount = new BankAccount(accountNumber,balance,accountName);
	    this.accounts[this.size++] = newAccount;
	}
	// tinh tong so tien trong tat ca tai khoan
	public double getTotalBalance() {
		double total = 0.0;
		for(int i = 0 ; i < size ; i++) {
			total += accounts[i].getBalance();
			}
		return total;
	}
	// so tk
	public int getNumberOfAccounts() {
		return size;
	}
	//lay tat ca cac tai khoan ngan hang
	public BankAccount[] getAccounts() {
		return Arrays.copyOf(accounts, size);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("The bank name must not be null");
		}this.name = name;
	}
	
}
