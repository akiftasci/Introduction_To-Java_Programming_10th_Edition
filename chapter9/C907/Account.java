package chapter9.C907;
import java.util.Date;
public class Account {
private int id=0;
private double balance=0;
private double annualInterestRate=0;
private Date dateCreated;

Account(){
	
}
Account(int newId,double newBalance){
	id=newId;
	balance=newBalance;
	dateCreated = new Date();
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
public String getDateCreated(){
	return dateCreated.toString();
}
public double getMonthlyInterestRate(){
	return annualInterestRate/12;
}
public double getMonthlyInterest(){
	return balance*(getMonthlyInterestRate() /100);
}
public void withdraw(double withdraw){
	balance=balance-withdraw;
}
public void deposit(double deposit){
	balance= balance+deposit;
}
}
