package chapter5;

public class C540 {
	public static void main(String[] args) {
		int heads=0, tails=0, coin;
		

		System.out.println("Fipping a coin one millon times..");
		for (int i = 0; i < 1000000; i++) {
			coin = (int) (Math.random() * 2);
			if(coin==0){
				heads++;
				
			}
			else{
				tails++;
			}
		}

		System.out.println("Heads: " + heads + "\nTails: " + tails);
	}
}
