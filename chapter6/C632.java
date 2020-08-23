package chapter6;

public class C632 {
	public static void main(String[] args) {
		diceRoller();
	}
	public static void diceRoller(){
		
		boolean point=false;
		int countWin=0,countLose=0;
		
	
		while(countLose+countWin!=10000){
			int dice1 =(int)((Math.random()*6)+1);
			int dice2 =(int)((Math.random()*6)+1);
			int sum=dice1+dice2;
			System.out.println("You rolled "+dice1+" + "+dice2+"="+sum);
		if(sum == 2 || sum==3||sum==12){
			System.out.println("You lose");
			countLose++;
			point=true;
		}
		else if (sum == 7 ||sum==11){
			System.out.println("You win");
			countWin++;
			point=true;
		}
		else{
			System.out.println("point is "+sum);
			if(pointMethod(sum)==true){
				countWin++;
			}
			else{
				countLose++;
			}
			point=true;
		}
	}
		
		
		System.out.println("You win "+countWin+"You lose "+countLose);
		}
public static boolean pointMethod(int sum){
	
	while(true){
		int dice1 =(int)((Math.random()*6)+1);
		int dice2 =(int)((Math.random()*6)+1);
		int sum2=dice1+dice2;
		System.out.println("You rolled "+dice1+" + "+dice2+"="+sum2);
		if(sum2==sum){
			System.out.println("You win");
			return true;
			
		}
		else if (sum2==7){
			System.out.println("You lose");
			return false;
			
			
		}
}}}
