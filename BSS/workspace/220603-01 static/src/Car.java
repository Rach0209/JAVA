public class Car {
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars = 0;
	// 값을 공유하고 싶으면 변하지않는 상수로 만들어 사용.
	public static final int SHARE_NUMBER = 22;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		numberOfCars++;
		id = numberOfCars;
//		id = ++numberOfCars; 똑같은 표현임.
	}
	
//	public static void printColor() {
//		원래 color는 프로그램이 실행할 때, 인스턴스를 생성했을 때 생긴다!
//		System.out.println(color); // 에러 		
//	}
	
	public void printStaticNumber() { // << 객체의 행동이기 때문에, 인스턴스를 생성하여 불러줘야 한다.
		System.out.println(numberOfCars);
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars; // OK!
	}
}
