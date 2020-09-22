package chapter9.C905;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
public static void main(String[] args) {
	GregorianCalendar myCal = new GregorianCalendar();
	System.out.println((myCal.get(myCal.MONTH))+"/"+myCal.get(myCal.DAY_OF_MONTH)+"/"+myCal.get(myCal.YEAR));

	myCal.setTimeInMillis(1234567898765L);
	
	System.out.print("\nElapsed time since January 1, 1970 set to " +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(myCal.get(myCal.MONTH) + "/" +
			myCal.get(myCal.DAY_OF_MONTH) + "/" + myCal.get(myCal.YEAR));
}
}
