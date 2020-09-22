package chapter9.C902;

public class Stock {
String symbol;
String name;
double previousClosingPrice;
double currentPrice;

Stock(String newSymbol,String newName,double newPreviousClosingPrice,double newCurrentPrice){
	symbol=newSymbol;
	name = newName;
	previousClosingPrice= newPreviousClosingPrice;
	currentPrice = newCurrentPrice;
	
}
public double getChangePercent(){
	return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
}
}
