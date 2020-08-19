package chapter6;

public class C601 {
public static void main(String []args ){
	int count;
	for(int n=1;n<101;n++){
	System.out.print(getPentagonalNumber(n,n)+" ");
	if(n%10==0){
		System.out.println();
	}
	}
	
}
public static int getPentagonalNumber(int n,int count){
	
	count++;
	int result= (n*(3*n-1))/2;
	return result;
}
}
