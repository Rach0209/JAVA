import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import java.time.LocalDate; // 1.8버전 이상~가능
//import java.time.format.DateTimeFormatter;

public class TestDateMethods {
	public static void main(String[] args) {
		// Calendar로 내일 날짜 구하기
		Calendar now = Calendar.getInstance();
//		now.set(2022, Calendar.JUNE, 4);
		now.add(Calendar.DAY_OF_MONTH, 1); // 1만큼 더해라~
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		

		// LocalDate로 내일 날짜 구하기
//		LocalDate now = LocalDate.now();
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		String result = dateFormat.format(now);
//		System.out.println(result);
//		
//		// 내일의 날짜 객체
//		LocalDate nowPlusOne = now.plusDays(1);
//		LocalDate tomorrow2 = LocalDate.of(2022, 6, 4);
//		LocalDate tomorrow1 = LocalDate.now().plusDays(1);
//		DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		DateTimeFormatter dateFormat3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		String result2 = dateFormat2.format(tomorrow1);
//		System.out.println(result2);
//		String result3 = dateFormat3.format(now);
//		System.out.println(result3);
//		// 내일 날짜객체 tomorrow2가 (내일 날짜)와 같은지 확인 하는 equals();
//		System.out.println(tomorrow2.equals(nowPlusOne));
		
		
	}
}
