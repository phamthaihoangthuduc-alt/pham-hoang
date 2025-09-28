package iuh.fit.opp;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;
	
	// constructor khong co tham so
	public BankAccount() {
		this.accountNumber = "0000-0000-0000";
		this.balance = 0.0;
		this.ownerName = "No name";
		
		
	}
	//constructor day du tham so
	public BankAccount(String accountNumber, double balance, String ownerName) {
		if(accountNumber == null) {
			throw new IllegalArgumentException("account number must be not null");
		}
		if(balance == 0) {
			throw new IllegalArgumentException("balance must be greater than or equal 0");
		}
		if(ownerName == null) {
			throw new IllegalArgumentException("ownername must be not null");
		}
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	 
	// gui tien vao tai khoan
	public void deposit(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("amount must be geater than 0");
		}
		this.balance += amount;
	}
	
	
	// rut tien ra tai khoan
	public void withdraw(double amount) {
		if(amount <= 0 || amount > this.balance) {
			throw new IllegalArgumentException("amount must be geater than 0 and less or equal than balance");
		}
		this.balance -= amount;
	}
	
	// lay so du hien co
	public double getBalance() {
		return this.balance;
	}
	
	//chuyen tien 
	public void transfer(BankAccount other, double amount) {
		if(other == null) {
			throw new IllegalArgumentException("account number must be not null");
		}this.withdraw(amount);
		other.deposit(amount);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		if(accountNumber == null || accountNumber.isEmpty()) {
		throw new IllegalArgumentException("account number must be not null");
	}
	this.accountNumber = accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		if(ownerName == null || ownerName.isEmpty()) {
			throw new IllegalArgumentException("owner name must be not null");
		}
	}
	@Override
	public String toString() {
		return String.format("|%10s|%10s|%10s|",
				accountNumber,
				ownerName,
				balance);
	}
	
}
