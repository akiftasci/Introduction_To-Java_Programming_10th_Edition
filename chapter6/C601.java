package chapter6;

public class C601 {
public static void main(String []args ){
	int count;
	for(int n=1;n<101;n++){
	System.out.printf("%7d ",getPentagonalNumber(n));
	if(n%10==0){
		System.out.println();
	}
	}
	
}
public static int getPentagonalNumber(int n){
	
	int result= (n*(3*n-1))/2;
	return result;
}
}
