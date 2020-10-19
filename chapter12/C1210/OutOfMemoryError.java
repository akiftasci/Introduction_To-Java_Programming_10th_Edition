package chapter12.C1210;

public class OutOfMemoryError {
public static void main(String[] args) {
	int[][][] arr = new int[1000000][1000000][100000];
	for (int i = 0; i < arr.length; i++) {
		arr[i][i][i]=arr[i][i][i]*arr[i][i][i];
		for (int j = 0; j < arr.length; j++) {
			arr[i][i][j]=arr[i][i][j]*arr[i][i][j];
			for (int j2 = 0; j2 < arr.length; j2++) {
				arr[i][i][j2]=arr[i][i][j2]*arr[i][i][j2];
			}
		}
	}
}
}
