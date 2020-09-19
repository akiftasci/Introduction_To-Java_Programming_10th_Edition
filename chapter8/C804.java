package chapter8;

public class C804 {
public static void main(String[] args) {
	int[][] arr = { { 2, 4, 3, 4, 5, 8, 8 }, 
			{ 7, 3, 4, 3, 3, 4, 4 }, 
			{ 3, 3, 4, 3, 3, 2, 2 },
			{ 9, 3, 4, 7, 3, 4, 1 }, 
			{ 3, 5, 4, 3, 6, 3, 8 }, 
			{ 3, 4, 4, 6, 3, 4, 4 }, 
			{ 3, 7, 4, 8, 3, 8, 4 },
			{ 6, 3, 5, 9, 2, 7, 9 } };
	int [][] total = new int [2][7];
	for (int i = 0; i < arr.length-1; i++) {
		total[0][i]=i+1;
	}
	int topla=0;
		for (int j = 0; j < arr.length-1; j++) {
				for (int i = 0; i < arr.length-1; i++) {
					topla=topla+arr[j][i];
				}
				total[1][j]=topla;
				topla=0;
		}
	int[][] sorted =sort(total);
	for (int i = 0; i <6; i++) {
		System.out.println("Employee "+sorted[0][i]+" total hours is: "+sorted[1][i]);
	}

}

private static int[][] sort(int[][] total) {
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < 5-i; j++) {
		if(total[1][j]<total[1][j+1]){
			for (int k = 0; k < 2; k++) {
			int temp = total[k][j];
			total[k][j]=total[k][j+1];
			total[k][j+1]=temp;
					}
				}
			}
		}
	return total;
}


}
