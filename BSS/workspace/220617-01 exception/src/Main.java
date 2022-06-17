import java.util.InputMismatchException;
import java.util.Scanner;
//		***********Exception 예외************

// 정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);

// 0으로 나눌 때		
// Exception in thread~~~~~ 예외적인 상황이 발생한 에러
//		***********Exception 예외;************
//		ArithmeticException 예외가 일어난 이유를 담고 있는 클래스 -> 예외 객체
//		자바는 예외적 상황을 객체로 관리중

		// try catch 구문으로 예외 처리가 가능하다
		// 기본 형태
//		try {
//			// 프로그램 흐름 문장 - (정상, 비정상)
//		} catch () { // 문장이 정상이면 catch를 건너뛴다. 비정상일 때 바로 들림 // 예외는 여러개 가능
//			// 예외를 처리하는 문장
		// 이후 정상흐름
//		}

		try {
			System.out.println("왼쪽 수 입력");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력");
			int right = scan.nextInt();

			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할 수 없습니다.");
			}
											// import 필요, InputMismatchException 입력값 타입이 다를 때 오류
		} catch (InputMismatchException e) { // 객체이기 때문에 객체참조 변수이름 하나 설정해줌. 
			System.out.println("숫자를 입력해야합니다."); // 출력 후 정상흐름
//			System.out.println(e.getMessage()); inputmismatch 는 원래 메세지없음 null값나옴
			e.printStackTrace(); // 예외가 발생됐던 경로를 콘솔창에 출력한다; 기록을 남김.
		}
		System.out.println("프로그램 정상 종료");

	}
}
