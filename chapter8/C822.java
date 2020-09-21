package chapter8;

public class C822 {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=(int)(Math.random()*2);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		int columnj=0;
		for (int i = 0; i < arr.length; i++) {
			int row=0,column=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1){
					row++;
				}
				if(arr[j][i]==1){
					column++;
					
				}
				
			}
			if(row%2==0 && row>0){
				System.out.println((i+1)+". Row true");
			}
			if(column%2==0 && column>0){
				System.out.println((i+1)+ ". Column true");
			}
		}
	}

}
