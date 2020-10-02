package chapter10.C1001;

/*
 * -hour: long
 * -minute: long
 * -second: long
 * 
 * Time()                                        
 * Time(elapseTime: long)                       
 * Time(hour: long, minute: long, second: long)  
 * getHour(): long                               
 * getMinute(): long                             
 * getSecond(): long                             
 * setTime(elapseTime: long)
 * 
 * 
 * 
 */
public class Time {
	private long hour;
	private long minute;
	private long second;

	Time() {
		setTime(System.currentTimeMillis());
	}

	Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	private void setTime(long elapsedTime) {
		long remainingSecond = elapsedTime / 1000;
		second = remainingSecond % 60;
		remainingSecond /= 60;
		minute = remainingSecond % 60;
		remainingSecond /= 60;
		hour = remainingSecond % 24;
	}


	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	
}
