package chapter7;

public class C707 {
public static void main(String[] args) {
	int [] array = randomNumbers();
	yazdir(array);
	int[] sayac = sayilariSay(array);
	sayaciYazdir(sayac);
}

public static void sayaciYazdir(int[] sayac) {
for (int i = 0; i < sayac.length; i++) {
	System.out.println(i +":"+sayac[i]);
}	
}

public static int[] sayilariSay(int[] array) {
	int [] sayac = new int[10];
	for (int i = 0; i < array.length; i++) {
		sayac[array[i]]++;
	}
	return sayac;
}

public static void yazdir(int[] array) {
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
		if((i+1)%10==0){
			System.out.println();
		}
		
	}
}

public static int[] randomNumbers() {
	int [] array = new int[100];

	for(int i=0;i<array.length;i++){
		array[i]= (int)((Math.random()*10));
	}
	return array;
}
}
