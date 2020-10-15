package chapter11;

public class YapiciZinciri {
public static void main(String[] args) {
	new Akademisyen();
}
}
class Akademisyen extends Calisan{
	public Akademisyen(){
		System.out.println("Akademisyen calisti");
	}
}
class Calisan extends Insan {
	public Calisan(){
		this("Calisanin yuklemis yapicisini cagiriyoruz");
		System.out.println("Calisanin yapicisi aclisti");
	}
	public Calisan (String s){
		System.out.println(s);
	}
}
class Insan{
	public Insan(){
		System.out.println("Insanin yapicisi cagrildi");
	}
}

