package chapter5;

public class C505 {
public static void main(String[] args) {
	int kg=1;
	double kg2=1;
	double pound2=20;
	double pound=0;
	System.out.println("Kilograms          Pounds | Pounds       Kilograms");
	while(kg<199){
		
		kg=kg+2;
		pound=kg*2.2;
		pound2+=5;
		kg2=pound2/2.2;
		System.out.printf(kg+"           %4.2f",pound,"|  %4.2f",pound2,"         \n"+kg2);
}
}}
