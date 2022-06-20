
public class Main4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				// 0으로 나눌려고 함 (예외적인 상황) => 알기 쉬운 상태로 만듦.
				// 보고서 적어서 던질거임. => 객체를 하나 생성해야함.
				
//				new ArithmeticException("asfasdf"); 생성

				// 예외 객체 타입을 상속으로 구체화시킨다.
				// 상속을 통해 구현하기 메시지 + 시간 
				// 내가 사용할만한 객체가 없을 때, 상속구조를 통해 예외 객체 만들기
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황이 발생했습니다~~~");
				// MyZeroDivideException 파일에 정의해줌
				
				
//				throw new Exception("0으로 나누는 예외적인 상황이 발생했습니다~~~"); // 정보가 담긴 예외객체가 생성됨.
				// 발생한 예외를 던진다~ => e 로 전달
			}
		} catch (MyZeroDivideException e) {
			System.out.println(e.getMessage()); // 예외객체에 들어있는 메시지를 캐치해서 전달받음.
		}
	}
}
