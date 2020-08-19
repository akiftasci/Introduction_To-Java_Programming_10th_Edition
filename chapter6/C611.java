package chapter6;

public class C611 {
	public static void main(String[] args) {
		System.out.printf("Sales Amount\tComission\n");
		System.out.println("_______________________________");
		for(double a=10000;a<100001;a+=5000){
			System.out.print(a);
		System.out.printf("\t\t%5.1f\n",computeComission(a));
	}}
	
public static double computeComission(double salesAmount){
	double balance =0.0, commission = 0.0;
	if (salesAmount > 10000.01){
		commission += (balance = salesAmount - 10000) * 0.12;
	}

	if (salesAmount > 5000.01){
		commission += (balance -= balance - 5000) * 0.10;
	}
	if (salesAmount > 0.01){
		commission += balance * 0.08;
	}
	return commission;
}
}
