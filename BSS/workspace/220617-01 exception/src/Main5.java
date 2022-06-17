import java.time.LocalTime;
import java.util.Scanner;

// 호출하는 쪽에서 예외처리 하고 싶을 때.throws MyZeroDivideException 뒤에 , 쉼표찍고 더 적어줄 수도 있음.
public class Main5 { // class 타입에 이름을 적어줌.
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 아직 미완성 ; 아직 지원하지 않는 기능 예외
		throw new UnsupportedOperationException("내일 만들게. 아직 덜 만듬~ㅋ");
	}
	
	public static void main(String[] args) {
		myFunction();
		//		Scanner scan = new Scanner(System.in);
//		scan.nextInt(); // 오류 중에 try catch 를 강요하지 않으면 runtimeException이다.
	}
}

// ******** Run Time Exception ********

// RuntimeException < Exception < Throwable

// // 상속을 통해 예외를 구체적으로 만들어 준다.
// RuntimeException 을 적어줌으로써 예외 만들어줌

// public class MyZeroDivideException extends RuntimeException {
// public MyZeroDivideException(String message) {
//		super(message + ", " + LocalTime.now() +  "에 발생하였음");
//	}
//}
