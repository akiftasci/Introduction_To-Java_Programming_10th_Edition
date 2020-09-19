package chapter8;

public class C810 {
	public static void main(String[] args) {
		int [][] arr = new int[4][4];
		int maxRow=0,maxColumn=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=(int)(Math.random()*2);
			}
		}
		for(int[] is : arr){
			for(int i :is){
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		int tempRow=0,tempColumn=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1){
					maxRow++;
					if(maxRow>tempRow){
						tempRow=j;
					}
				}
				if(arr[j][i]==1){
					maxColumn++;
					if(maxColumn>tempColumn){
						tempColumn=i;
					}
				}
			}
			maxRow=0;
			maxColumn=0;
			
		}
		System.out.println("The largest row index: "+tempRow);
		System.out.println("The largest column index: "+tempColumn);
	}

}
