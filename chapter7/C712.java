package chapter7;

public class C712 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int e : reverse(array)) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static int[] reverse(int[] list) {
		int temp = 0;
		int j = list.length - 1;
		for (int i = 0; i < list.length / 2; i++) {

			temp = list[i];
			list[i] = list[j];
			list[j] = temp;

			j--;
		}
		return list;
	}
}
