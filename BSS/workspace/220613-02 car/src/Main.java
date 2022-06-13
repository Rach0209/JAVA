public class Main {
	public static void main(String[] args) {
		SportsCar c = new SportsCar(); // 서브 클래스 객체 생성 // 기본 생성자로 호출
		c.color = "Red";
		c.speedUp(100);				   // 수퍼 클래스 필드와 메소드 사용
		c.speedDown(30);
		c.setTurbo(true);			   // 자체 메소드 사용
		
		Car normalCar = new Car();
		normalCar.color = "Green";
		normalCar.speedUp(30);
		normalCar.speedDown(20);
		// 부모는 자식을 상속 받을 수 없음.
//		normalCar.setTurbo(true);
	}
}
