import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/*
  달력모양 출력하기
  다음달력도 선택해서 출력하기 (원하는 달, 년도 등등)
*/

public class PrintCalendar {
	public static void main(String[] args) {
		// 현재 날짜
		LocalDate now = LocalDate.now();
		// 현재 시간
		LocalTime time = LocalTime.now();
		// 현재 요일
		DayOfWeek day = now.getDayOfWeek();
		// 날짜 형식
		DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd EE");
		String result = dateFormat1.format(now);
		// 시간 형식
		DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("a h:mm:ss");
		String timeresult = dateFormat2.format(time);
		// 현재 요일 한글화;
//		String korDay = day.getDisplayName(TextStyle.SHORT, Locale.KOREA);
		// 끝 날짜 설정하기
		int lastday = now.lengthOfMonth();
		// 첫 날짜 설정하기
		LocalDate firstday = YearMonth.now().atDay(1);
		int first = firstday.getDayOfWeek().getValue();		
		// 날짜 형식 출력
		System.out.println("현재날짜 : " + result);
//		System.out.println("현재날짜 : " + result + " " + korDay);
		
		// 달력 모양 만들기
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int j = 0; j < first; j++) {
			System.out.printf("%s", "\t");
		}
		for (int i = 1; i <= lastday; i++) {
			if ((i + first) % 7 == 0) {
				System.out.printf("%02d\t", i);
				System.out.println();
			} else {
				System.out.printf("%02d\t", i);
			}
		}
		// 현재 시간 출력
		System.out.println();
		System.out.println("현재시간 : " + timeresult);
		
		
		// 달 입력받기, 윤년 메소드 만들기
		
		// 달 입력받는 메소드 호출
		Scanner scan = new Scanner(System.in);
		System.out.printf("년도 입력:");
		int yyyy = scan.nextInt();
		System.out.printf("월 입력:");
		int mm = scan.nextInt();
		InputCalendar.makeCalendar(yyyy, mm);
	}
}

