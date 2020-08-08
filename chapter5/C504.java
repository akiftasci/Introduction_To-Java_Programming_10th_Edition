package chapter5;

public class C504 {
	public static void main(String[] args) {
		int mile=1;
		double km=0;
		System.out.println("Miles      Kilometers");
		while(mile<10){
			mile++;
			km=mile*1.609;
			System.out.printf(mile+"             %4.2f\n ",km);
			
		}
	}

}
