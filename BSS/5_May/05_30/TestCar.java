// Car.java 와 클래스 연결;

public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		Car c2 = new Car("yellow");
		Car c3 = new Car("red"); // 파라미터의 값, (타입, 개수, 순서)가 일치 하지 않으면 컴파일 에러;
		
		// String newColor = "빨강";
		// if (newColor != null) {
			// c.color = "빨강";
		// }
		// c.color = "빨강";
		// System.out.println(c.color);		// <<<< 객체 지향에서는 이런 방식으로 쓰는 일은 별로 없을 것.
		
		// private 접근 제한자를 public으로 접근 가능케 하기.
		c.setColor("빨강");
		System.out.println(c.getColor());
		
		c.setSpeed(150);
		System.out.println(c.getSpeed());
		
		c.setGear(6);
		System.out.println(c.getGear());
	}
}