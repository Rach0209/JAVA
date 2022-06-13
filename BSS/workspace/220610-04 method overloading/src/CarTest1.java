class Car {
	// 필드 선언
	private int speed;
	// 중복 메소드: 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	
	// 중복 메소드: 실수 버전
	public void setSpeed(double s) {
		speed = (int)s; // 필드가 int로 선언 되어있어서 필드값에 맞추기위해 정수부분만 필드로.(79.2 -> 79);
		System.out.println("실수 버전 호출");
	}
}

public class CarTest1 {
	public static void main(String[] args) {
		Car myCar = new Car();		// 첫 번째 객체 생성
		myCar.setSpeed(100); 		// 정수 버전 메소드 호출
		myCar.setSpeed(79.2); 		// 실수 버전 메소드 호출
		
		myCar.setSpeed(1000L);		// double 실수는 long 값보다 더 큰 범위 표현 가능해서 실수 버전메소드 호출
		myCar.setSpeed('A');		// 아스키코드로 인식되서 정수로 인식
//		myCar.setSpeed("A");		// 문자열. String 타입이 존재 하지 않음. 컴파일 에러.
	}

}
