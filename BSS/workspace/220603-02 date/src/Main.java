import java.time.LocalDate; // time 패키지 안에 존재.
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {

		// 자바에서 날짜 나타내는 것.
		// java.util.Calendar
		//Calendar today = new Calendar(); // 개발자가 생성자를 감춰놓음 . public하지않다. // Static이 붙은 아이들 => 객체가 아님.
//		Calendar now = Calendar.getInstance(); // 메소드 getInstance()안에 생성자가 들어가있다./ getInstace()는  Static한 메소드임 -> 클래스 이름으로 사용가능. 나중에더배움~
//		
//		// get(field) field int 값(1, 2, 5)을 상수로 이름을 붙여줌.
//		System.out.println("상수값 확인 : " + Calendar.YEAR);
//		
//		System.out.println(now.get(Calendar.YEAR));
//		// 상수값을 정할 때, 1월을 0으로 설정해서 +1을 해준 것.
//		System.out.println(now.get(Calendar.MONTH) + 1);
//		System.out.println(now.get(Calendar.DAY_OF_MONTH));
//		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 1은 일요일 ~월화수목금토~
//		
		
		// ******** 1.8버전 이후 ~~ java.time.LocalDate ********
		LocalDate now = LocalDate.now(); // LocalDate.now();의 now는 static
		System.out.println(now.getYear());
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
	}
}
