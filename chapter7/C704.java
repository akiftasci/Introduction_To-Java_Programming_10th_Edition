package chapter7;

import java.util.Scanner;

public class C704 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array = new int [0];
		System.out.println("Enter the grades: (Enter a negative number to finish)");
		int grades,avarage;
		while((grades=input.nextInt())>0){
			array=add2Array(array,grades);
		}
		System.out.println("Avarage is :"+(avarage=findAvarage(array)));
		aboveAndBelowScores(array,avarage);
	}

	public static void aboveAndBelowScores(int[] array,int avarage) {
		int below=0,above=0,equals=0;
		for(int i=0;i<array.length;i++){
			if(array[i]<avarage){
				below++;
			}
			else if(array[i]==avarage){
				equals++;
			}
			else{
				above++;
			}
		}
		System.out.println("The number of grades below avarage is:"+below);
		System.out.println("The number of grades above avarage is:"+above);
		System.out.println("The number of grades equals avarage is:"+equals);
	}

	public static int findAvarage(int[] array) {
		int total=0,avarage=0;
		for(int i=0;i<array.length;i++){
			total=total+array[i];
		}
		avarage=total/array.length;
		return avarage;
	}

	public static int[] add2Array(int[] array, int grades) {
		int [] temp = new int [array.length+1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = grades;
		return temp;

		
	}

}
