package chapter8;

public class C816 {
public static void main(String[] args) {
	int [][] arr ={{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
	sort(arr);
}
public static void sort(int m[][]){
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4-i; j++) {
			if(m[i][j]>m[i][j+1]){
				int temp = m[i][j];
				m[i][j] = m[i][j+1];
				m[i][j+1] = temp;
			}
		}
	}
}

}
