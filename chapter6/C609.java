package chapter6;

public class C609 {
	public static void main(String[] args) {
		System.out.printf("Feet\tMeters\t | \tMeters\tFeet\n");
		System.out.println("______________________________________________");
		double ft=1.0;
		double mt=20.0;
		for (double i=ft;i<=10;i++){
			System.out.printf("%2.1f\t",i);
			System.out.printf("%1.3f\t  |\t",footToMeter(i));
			System.out.printf("%2.1f\t",mt);
			System.out.printf("%3.3f\n",meterToFoot(mt));
			mt=mt-5.0;
		}
	}
	public static double footToMeter(double foot){
		double meter = 0.305*foot;
		return meter;
	}
	public static double meterToFoot(double meter){
		double foot =3.279*meter;
		return foot;
	}

}
