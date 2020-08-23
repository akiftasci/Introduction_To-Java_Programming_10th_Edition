package chapter6;

public class C630 {
	public static void main(String[] args) {
		diceRoller();
	}
	public static void diceRoller(){
		
		boolean point=false;
		
		while(point!=true){
			int dice1 =(int)((Math.random()*6)+1);
			int dice2 =(int)((Math.random()*6)+1);
			int sum=dice1+dice2;
			System.out.println("You rolled "+dice1+" + "+dice2+"="+sum);
		if(sum == 2 || sum==3||sum==12){
			System.out.println("You lose");
			point=true;
		}
		else if (sum == 7 ||sum==11){
			System.out.println("You win");
			point=true;
		}
		else{
			System.out.println("point is "+sum);
			pointMethod(sum);
			point=true;
		}
	}}
public static void pointMethod(int sum){
	
	while(true){
		int dice1 =(int)((Math.random()*6)+1);
		int dice2 =(int)((Math.random()*6)+1);
		int sum2=dice1+dice2;
		System.out.println("You rolled "+dice1+" + "+dice2+"="+sum2);
		if(sum2==sum){
			System.out.println("You win");
			break;
		}
		else if (sum2==7){
			System.out.println("You lose");
			break;
			
		}
	}
}
}
