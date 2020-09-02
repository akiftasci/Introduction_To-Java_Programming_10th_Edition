package chapter7;

import java.util.Scanner;

public class AmazonInterview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an input: ");
		String girdi = input.nextLine();
		char [] inp = new char[girdi.length()];
		
		for (int i = 0; i < girdi.length(); i++) {
			inp[i]=girdi.charAt(i);
		}
	
		char[] parantez = new char[2];
		parantez[0]='(';
		parantez[1]=')';
		char[] koseliParantez = new char[2];
		koseliParantez[0]='[';
		koseliParantez[1]=']';
		char[] susluParantez = new char[2];
		susluParantez[0]='{';
		susluParantez[1]='}';
		
		checkIfValid(inp,parantez,koseliParantez,susluParantez);
		
		
		
		// parantez0'dan sonra diðer arraylerin sýfýrlarý gelebilir veya parantez 1 
		//ayný eþkilde diðer arrayler için
		//inp.length%2==0 
	}

	private static void checkIfValid(char[] inp, char[] parantez, char[] koseliParantez, char[] susluParantez) {
		for (int i = 0; i < inp.length; i++) {
			switch(inp[i]){
			case('('):
				if(inp[i+1]==parantez[0] && inp[i+1]==koseliParantez[0] && inp[i+1]==susluParantez[0] && inp[i+1]==parantez[1]){
					
				}
				break;
			case('['):
			case('{'):
			}
		}
		
	}

}
