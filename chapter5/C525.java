package chapter5;

import java.util.Scanner;

public class C525 {
	public static void main(String[] args) {

		double pi=0, negatives = 0, positives = 0, temporary;
		for (int x = 10000; x <= 100000; x += 10000) {
			for (int i = 3; i < x / 2; i += 4) {
				negatives =negatives+ (1 / (double)i);
			}
			for (int y = 5; y < x / 2; y += 4) {
				positives += (1 / (double)y);
			}
			pi=4.0*(1+positives-negatives);
			System.out.println("For "+x+" value pi is: "+pi);
		}
		
	}

}
