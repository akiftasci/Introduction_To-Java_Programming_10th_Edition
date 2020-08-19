package chapter6;

public class C608 {
public static void main(String[] args) {
	System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius"); 
	System.out.println("___________________________________________________________________");
	for(double i=40.0,a=120.0;i>30.0;i--,a-=10){
	System.out.printf("%2.1f\t",i);
	System.out.printf("%3.2f",celciusToFahrenheit(i));
		System.out.printf("\t\t|\t%3.1f\t\t",a);
		System.out.printf("%3.1f \t\t\t\n",fahrenheitToCelsius(a));
		
		
}}
public static double celciusToFahrenheit(double celsius){
	double fahrenheit = (9.0/5)*celsius +32;
	return fahrenheit;
}
public static double fahrenheitToCelsius(double fahrenheit){
double celsius=(5.0/9)*(fahrenheit-32);
return celsius;
}
}
