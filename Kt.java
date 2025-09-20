package kt13_9;

import java.util.ArrayList;
import java.util.List;

// ENUM: Trạng thái tài khoản
enum AccountStatus {
    ACTIVE,
    INACTIVE,
    CLOSED
}

// INTERFACE: Tính lãi suất
interface Interest {
    double calculateInterest();
}

// ABSTRACT CLASS: Tài khoản chung
abstract class Account implements Interest {
    protected String numberId;
    protected double balance;
    protected AccountStatus status;

    public Account(String numberId, double balance, AccountStatus status) {
        this.numberId = numberId;
        this.balance = balance;
        this.status = status;
    }

    public abstract boolean withdraw(double amount);

    public void deposit(double amount) {
        if (status == AccountStatus.ACTIVE) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getNumberId() {
        return numberId;
    }
}

// CLASS: Tài khoản tiết kiệm
class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String numberId, double balance, AccountStatus status, double interestRate) {
        super(numberId, balance, status);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if (status == AccountStatus.ACTIVE && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// CLASS: Tài khoản vãng lai
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String numberId, double balance, AccountStatus status, double overdraftLimit) {
        super(numberId, balance, status);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public boolean withdraw(double amount) {
        if (status == AccountStatus.ACTIVE && balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// CLASS: Khách hàng
class Customer {
    private String name;
    private String customerId;
    private String address;
    private List<Account> accounts;

    public Customer(String name, String customerId, String address) {
        this.name = name;
        this.customerId = customerId;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double getTotalBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

// CLASS: Ngân hàng
class Bank {
    private String name;
    private String address;
    private List<Account> accounts;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean withdraw(String numberId, double amount) {
        for (Account acc : accounts) {
            if (acc.getNumberId().equals(numberId)) {
                return acc.withdraw(amount);
            }
        }
        return false;
    }

    public void deposit(String numberId, double amount) {
        for (Account acc : accounts) {
            if (acc.getNumberId().equals(numberId)) {
                acc.deposit(amount);
                break;
            }
        }
    }

    public double getTotalBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public String getName() {
        return name;
    }
}

}

