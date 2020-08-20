package chapter6;

public class C614 {
	public static void main(String[] args) {
		System.out.println("i\tm(i)");
		System.out.println("_______________________");
		for(int i=1;i<902;i+=100){
			System.out.print(i+"\t");
			System.out.printf("%1.4f\n",estimatePi(i));
		}
	}

	public static double estimatePi(int i){
		double result=0;
		for(int x=1;x<=i;x++)
		result+=(double)4*(   Math.pow(-1, x+1)  /(2*x-1)   );
		return result;
	}
}
