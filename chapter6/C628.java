package chapter6;

public class C628 {
	public static void main(String[] args) {
		int count = 0, p=0;
		System.out.println("p\t\t2^p-1");
		System.out.println("____________________");
		int i=2;
		
		for (i = 2; i <= 31; i++) {
			
				if (isPrime(i) ) {
			
				p=(int)Math.pow(2, i)-1;
				System.out.printf(i + "\t\t"+p+"\n");
				count++;
				
				
			}
		}
	}
	public static boolean isPrime(int i) {
		boolean isprime = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				isprime = false;
			}
		}
		return isprime;
	}
}
