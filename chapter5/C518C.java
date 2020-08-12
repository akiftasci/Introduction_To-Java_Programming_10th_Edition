package chapter5;

public class C518C {
	/*public static void main(String[] args) {
		System.out.println("Pattern C");
		for (int i = 1; i < 7; i++) {
			for (int x = 7; x >i; x--) {
				System.out.print("\t");
			}
			System.out.println(i+" ");
		}

	}*/
	public static void main(String[] args) {
        int numberOfLines = 6;
        System.out.println("Pattern C");
        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
