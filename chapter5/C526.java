package chapter5;

public class C526 {
public static void main(String[] args) {
	double e=2;
	for(int x=10000;x<100001;x+=10000){
		
	
	for(int i=2;i<x;i++){
		e+=1/(double)(i*(i-1));
	}
	
	System.out.println("For i value "+x+" e is:"+e);
	}
	}
}
