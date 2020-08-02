package chapter4;

public class C425 {
	public static void main(String[] args) {
		
		
		int first =(int)(Math.random()*25)+65;
		int second =(int)(Math.random()*25)+65;
		int third =(int)(Math.random()*25)+65;
		int no = (int)(Math.random()*1000);
		 char letterF = (char)first;
		 char letterS = (char)second;
		 char letterT = (char)third;
		 System.out.println("The plate is: "+letterF+letterS+letterT+(no));
		 
		 
		
	}

}
