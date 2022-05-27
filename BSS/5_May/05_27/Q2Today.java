// 1번
// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능(printAll)

// 2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27" 
//			   "05/27/22" 와 같은 다양한 서식으로 출력 선택적

// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

// 위의 클래스를 테스트 할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.

// 2번
import java.util.*;

class Date {
	int year;
	int month;
	int day;
	void yearMonthDay() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
	void monthDayYear() {
		System.out.printf("%02d/%02d/%04d\n", month, day, year);
	}
	void korDate() {
		System.out.printf("%04d년 %02d월 %02d일\n", year, month, day);
	}
}



public class Q2Today {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		int month;
		int day;
			System.out.println("년도를 입력하세요.");
			year = scan.nextInt();
		while (!(year > 0 && year <= 9999)) {
			System.out.println("0~9999까지의 년도만 가능합니다. 다시 입력하세요");
			year = scan.nextInt();
		}
		System.out.println("월을 입력하세요.");
		month = scan.nextInt();
		while (!(month > 0 && month <= 12)) {
			System.out.println("1 ~ 12까지의 월만 가능합니다. 다시 입력하세요");
			month = scan.nextInt();
		}
		System.out.println("일을 입력하세요.");
		day = scan.nextInt();
		while (!(day > 0 && day <= 31)) {
			System.out.println("1 ~ 31까지의 일만 가능합니다. 다시 입력하세요");
			day = scan.nextInt();
		}
		int type;
		System.out.println("표기할 방식을 선택하세요\n 1 : yyyy-mm-dd \n 2 : mm/dd/yyyy \n 3 : yyyy년 mm월 dd일");
		type = scan.nextInt();
		while (!(type > 0 && type <= 3)) {
			System.out.println("1 ~ 3까지의 숫자만 입력하세요");
			type = scan.nextInt();
		}
		
		Date ymd = new Date();
		ymd.year = year;
		ymd.month = month;
		ymd.day = day;
		
		Date mdy = new Date();
		mdy.year = year;
		mdy.month = month;
		mdy.day = day;
		
		Date kor = new Date();
		kor.year = year;
		kor.month = month;
		kor.day = day;
		
		if (type == 1) {
			ymd.yearMonthDay();
		} else if (type == 2){
			mdy.monthDayYear();
		} else {
			kor.korDate();
		} 
	}
}