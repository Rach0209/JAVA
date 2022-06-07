import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// 달력 만들기
public class PrintCalendar2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd eee"); // , Locale.**** 로 언어 설정 가능.
		String result = format.format(now);
//		System.out.println(result);
		// 2022 06 01
		LocalDate firstDay = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
		// int형으로 월요일은 1, 일요일은 7의 값으로.
		int dayOfWeek = firstDay.getDayOfWeek().getValue(); 
//		LocalDate;; 마지막 일수 구하기
		int length = now.lengthOfMonth();
		
		
		System.out.println("오늘:" + result);
		System.out.println("일    월    화    수    목    금   토");
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("   ");			
		}
		for (int i = 1; i <= length; i++) {
			System.out.printf("%02d ", i);
			dayOfWeek++;
			if (dayOfWeek % 7 == 0)  {  // 토요일 마다 줄바꿈
				System.out.println();
			}
		}
	}
}
