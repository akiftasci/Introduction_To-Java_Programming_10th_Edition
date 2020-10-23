package chapter13;

public class TestRasyonelSayi {
	 public static void main(String[] args) {
			  RasyonelSayi r1 = new RasyonelSayi(4, 2);
			  RasyonelSayi r2 = new RasyonelSayi(2, 3);
		
		    System.out.println(r1 + " + " + r2 + " = " + r1.ekle(r2));
		    System.out.println(r1 + " - " + r2 + " = " + r1.cikart(r2));
		    System.out.println(r1 + " * " + r2 + " = " + r1.carp(r2));
		    System.out.println(r1 + " / " + r2 + " = " + r1.bol(r2));
		    System.out.println(r2 + " is " + r2.doubleValue());
		  }
		}

