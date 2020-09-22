package chapter9.C907;

public class TestAccount {
	public static void main(String[] args) {
		Account akif = new Account(1122,20000);
		akif.setAnnualInterestRate(4.5);
		akif.withdraw(2500);
		akif.deposit(3000);
		System.out.println("The balance is : "+akif.getBalance()+
				"\nThe montly interest rate is: "+akif.getMonthlyInterest()
				+"\nThe date account created is: "+akif.getDateCreated());
		
	}

}
