package chapter6;

public class C626 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; count < 100; i++) {
			if (IsPrime(i) && IsPalindromic(i)) {
				System.out.print(i + "  ");
				count++;
				if (count % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}

	public static boolean IsPrime(int i) {
		boolean isprime = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				isprime = false;
			}
		}
		return isprime;
	}

	public static boolean IsPalindromic(int i) {
		boolean ispalindromic = false;
		String a = Integer.toString(i);
		String b = "";
		for (int j = a.length() - 1; 0 <= j; j--) {
			b = b + a.charAt(j);
		}
		if (a.equals(b)) {
			ispalindromic = true;
		}
		return ispalindromic;
	}
	
}
