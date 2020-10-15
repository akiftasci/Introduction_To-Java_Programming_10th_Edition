package chapter11.C1103;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated = new java.util.Date();

	Account() {
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	public String toString() {
		return "ID: " + id + "\nDate Created: " + dateCreated + "\nBalance: $" + balance
				+ "\nMonthly Interest: $" + getMonthlyInterest();
	}
}

class CheckingAccount extends Account {

	private double limit;

	public double getLimit() {
		return limit=0;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public CheckingAccount(int id, double balance, double limit) {
		super(id, balance);
		this.limit = limit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > getLimit()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Error");
		}
	}

	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + limit;
	}
}

class SavingsAccount extends Account {

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Error");
		}
	}

	public String toString() {
		return super.toString();
	}
}
