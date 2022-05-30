public class Car {
	private int speed; // 속도
	private int gear;  // 기어
	private String color; // 색상		// private 접근제한자 => 외부에서는 해당하는 필드를 볼 수도, 변경할 수도 없음. 접근 자체 불가.
						  // private은 Car 라는 자기자신 안(클래스)에서만 사용가능. // 정보의 보호. // 숨겨놓음.
	
	//  첫 번째 생성자
	public Car (String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// 색상만 주어진 생성자
	public Car(String c) {
		this(c, 0, 1);	// 첫 번째 생성자를 호출(this)한다. 생성자가 여러개일 경우, 타입과 순서가 일치하는 생성자를 찾아감.
						// 참조가 계속 전달되는 것. // this 키워드는 생성자의 첫줄을 불러옴
		
		System.out.println("초기화 과정 중~~");
	}
	
	// private 접근 제한자를 접근 가능케하기.
	// 접근(색상)
	// getter << 접근자
	public String getColor() {
		return color;
	}
	
	// 설정
	// setter << 설정자
	public boolean setColor(String c) {
		if (c != null) {
			color = c;
			return true;
		}
		return false;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean setSpeed(int s) {
		if (s != 0) {
			speed = s;
			return true;
		}
		return false;
	}
	
	public int getGear() {
		return gear;
	}
	
	public boolean setGear(int g) {
		if (g != 0) {
			gear = g;
			return true;
		}
		return false;
	}
}