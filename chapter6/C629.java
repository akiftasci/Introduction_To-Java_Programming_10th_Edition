package chapter6;

public class C629 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; count < 1000; i++) {
			if (isPrime(i) ) {
				
				
				if(isPrime(i+2)){
					System.out.println("( "+i+" , " +(i+2)+")");
				}
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
