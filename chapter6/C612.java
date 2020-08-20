package chapter6;

public class C612 {
	public static void main(String[] args) {
		printChars('1','Z',10);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine){
	int count=0;
		for(int i=(int)ch1;i<=(int)ch2;i++){
			ch1=(char)i;
			count++;
			System.out.print(ch1+" ");
			if(count%numberPerLine==0){
				System.out.println();
			}
		}
		
	}

}
