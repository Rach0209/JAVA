// p.216
class Time {
	private int time;
	private int minute;
	private int second;
	
	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	
	public int getTime() {
		return time;
	}
}

class AlarmClock {
	private Time currentTime;
	private Time alarmTime;
	
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}
	
	public Time getCurrentTime() {
		return currentTime;
	}
}

public class AlarmClockTest {
	public static void main(String[] args) {
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c = new AlarmClock(alarm, current);
		System.out.println(c);
		
		int hour = c.getCurrentTime().getTime();
		// c.getCurrentTime() 만 넣으면 컴파일 오류 ;; -> Time 이라는 타입으로 전달 했기때문에 int 와 맞지않아서.
		// -> getTime()을 추가해줌으로 해결
		System.out.println(hour);
	}			// end main
}				// end class