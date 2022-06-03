//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
// Calendar는 시간 정보까지 들고 있음.

public class DateFormat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime();
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String result = dateFormat.format(date);
//		System.out.println(result);		
	}
}
