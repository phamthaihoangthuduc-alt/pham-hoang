package iuh.fit.opp;

import java.text.NumberFormat;
import java.util.Locale;

public class Bai4_Bank {
	private long numberAccount;
	private String nameAccount;
	private double balance;
	private AccountStatus status;
	private String message ="";
	private final double interestRate = 0.035;
	
	public Bai4_Bank() {
		this.numberAccount = 999999;
		this.nameAccount = "chua xac dinh";
		this.balance = 50;
		this.status = AccountStatus.ACTIVE;
	}

	public Bai4_Bank(long numberAccount, String nameAccount, double balance) {
		setNumberAccount(numberAccount);
		setNameAccount(nameAccount);
		setBalance(balance);
		setStatus(status);
	}

	public long getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(long numberAccount) {
		if(numberAccount < 0 || numberAccount == 999999) {
			this.numberAccount = 999999;
			message += "So tai khoan :";
		}
		this.numberAccount = numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		if(nameAccount == null || nameAccount.isEmpty()) {
			this.nameAccount = "chua xac dinh";
			message += "ten tai khoan";
		}
		this.nameAccount = nameAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance < 50) {
			this.balance = 50;
		}
		this.balance = balance;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		if(status == null || !(status instanceof AccountStatus)) {
			status = AccountStatus.ACTIVE;
		}
		this.status = status;
	}
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		return String.format("|%5s|%25s|%15s|%20s|%20s", 
				numberAccount,
				nameAccount,
				nf.format(balance),
				status,
				message);
	}
	
	public double deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return amount;
		}
		return -1;
	}
	public double withdraw(double amount) {
		if(amount > 0 && amount  < balance) {
			balance -= amount;
			return amount;
		}
		return -1;
	}
	
	public double stranfer (Bai4_Bank other , double amount) {
		if(this.withdraw(amount)>0) {
			other.deposit(amount);
			return amount;
		}
		return -1;
	}
	
}

