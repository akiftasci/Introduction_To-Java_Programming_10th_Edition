package chapter7;



public class C723 {
	public static void main(String[] args) {

		boolean[] array = new boolean[100];
		int[] numArray = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = false;
			numArray[i] = i;
		}
		
		for (int div= 1; div < 100; div++) {
			for (int i = 0; i < array.length; i++) {
				if (numArray[i] % div == 0) {
					array[i] = !array[i];
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			if((i+1)%10==0){
				System.out.println();
			}
		}
	}
}
