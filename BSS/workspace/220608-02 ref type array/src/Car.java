public class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	public void speedUp() {		// 속도 증가 메소드
		speed += 10;
	}
	public String toString() {	// 객체의 상태를 문자열로 반환하는 메소드  // 소문자, 대문자 구분, 파라미터 비우기. // 아직 배우지 않은 표현.
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
}
