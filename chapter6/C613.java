package chapter6;

public class C613 {
public static void main(String[] args) {
	System.out.printf("i\tm(i)\n");
	System.out.println("_________________________");
	for(int i=1;i<21;i++){
		System.out.printf(i+"\t");
		System.out.printf("%2.4f\n",converterFor(i));
	}
	
}
public static double converterFor(int i){
	double result=0;
	for(int x=1;x<=i;x++){
	  result+=(double)x/(x+1); 
	}
	 return result;
}
}
