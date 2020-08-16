package chapter5;

public class C543 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int x = i + 1; x <= 7; x++) {
				count++;
				System.out.println(i + " " + x);

			}
		}
		System.out.println("Total bumber of all combinations is :" + count);
	}

}
