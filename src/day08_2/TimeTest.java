package day08_2;
// getter  /  setter
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(25,60,70);
		t.setHour(25);
		System.out.println(t.getHour()); //  0  
	}
}
class Time{
	private int hour, minute, second;
	
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	// alt + shift + s + r
	// hour 0 ~23 minute 0 ~59 second 0 ~59
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if( hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if( minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if( second < 0 || second > 59 )
			return;
		this.second = second;
	}
}
