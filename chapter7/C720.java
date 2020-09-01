package chapter7;

public class C720 {
public static void main(String[] args) {
	int [] array = {1,5,3,6,7,1,7,9,4,3};
	selectionSort(array);
	
}

public static void selectionSort(int[] array) {
	for (int i = array.length-1; i >=0; i--) {
		int max = array[i];
		int maxIndex = i;
	
	for (int j = i-1; j >= 0; j--) {
		if(max<array[j]){
			max=array[j];
			maxIndex=j;
		}
	}
	if(maxIndex!=i){
		array[maxIndex]=array[i];
		array[i]=max;
	}
	}
}
}
