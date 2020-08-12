package chapter5;

public class C520 {
	public static void main(String[] args) {

		int count = 0;

		System.out.println("The prime numbers between 2 and 1,000, inclusive are ");

		for (int number = 2; number <= 1000; number++) {

			boolean isPrime = true;

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				count++;

				if (count % 8 == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
		}
	}
}
