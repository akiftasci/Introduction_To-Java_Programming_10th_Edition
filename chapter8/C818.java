package chapter8;

public class C818 {
public static void main(String[] args) {
	int[][] m = {{1, 2}, 
				 {3, 4}, 
				 {5, 6}, 
			 	 {7, 8}, 
				 {9, 10}};
	shuffle(m);
}
public static void shuffle (int[][] m){
	for (int i = 0; i <6; i++) {
		int temp=0;
		int random=(int)(Math.random()*m.length);
		for (int j = 0; j <2; j++) {
			temp=m[i][j];
			m[i][j]=m[random][j];
			m[random][j]=temp;
		}
	}
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[0].length; j++) {
			System.out.print(m[i][j] + " ");
		}
	}
}
}
