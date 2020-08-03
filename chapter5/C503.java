package chapter5;

public class C503 {
public static void main(String[] args) {
	int kg=1;
	double pound=0;
	System.out.println("Kilograms          Pounds");
	while(kg<199){
		
		kg=kg+2;
		pound=kg*2.2;
		System.out.println(kg+"                  "+pound);
	}
	
}
}
