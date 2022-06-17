import java.time.LocalTime;

// 상속을 통해 예외를 구체적으로 만들어 준다.
public class MyZeroDivideException extends RuntimeException {
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() +  "에 발생하였음");
	}
	

}
