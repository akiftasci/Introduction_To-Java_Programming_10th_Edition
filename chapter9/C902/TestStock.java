package chapter9.C902;

public class TestStock {
public static void main(String[] args) {
	Stock myStock = new Stock("ORCL","Oracle Corporation", 34.5,34.35);
	System.out.println("The price-change percentage is: "+myStock.getChangePercent());
	
}
}
