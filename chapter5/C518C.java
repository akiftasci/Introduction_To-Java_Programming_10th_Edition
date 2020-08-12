package chapter5;

public class C518C {
	public static void main(String[] args) {
		System.out.println("Pattern C");
		for (int i = 1; i < 7; i++) {
			for (int x = 7; x >i; x--) {
				System.out.print("\t");
			}
			System.out.println(i+" ");
		}

	}
}
