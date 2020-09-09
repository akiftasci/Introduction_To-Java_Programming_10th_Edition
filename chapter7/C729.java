package chapter7;

public class C729 {
	public static void main(String[] args) {
		int [] deck = new int[13];
		int a=1;
		for (int i = 0; i <13; i++) {
			deck[i]=a;
			a++;
		}
		while(true){
			int pick1 =deck[(int)(Math.random()*13)];
			int pick2=deck[(int)(Math.random()*13)];
			int pick3=deck[(int)(Math.random()*13)];
			int pick4=deck[(int)(Math.random()*13)];
		if(pick1+pick2+pick3+pick4==14){
			System.out.println(pick1 +" "+pick2+" "+pick3+" "+pick4+" ");
			
		}}
	}

}
