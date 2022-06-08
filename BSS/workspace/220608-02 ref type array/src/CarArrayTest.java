public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
//		for (int i = 0; i < cars.length; i++) {
//			cars[i].speedUp();
//		}
		for (Car c : cars) { // for each 문에서 c = >>?? 변수선언은 의도와 다르게 흘러갈 수 있다는 것 기억.
			c.speedUp();
			c.color = "asdf"; // 참조하는 대상의 필드를 바꾸는 것은 가능 // 참조 변수가 아닌, 인스턴스에 접근해서 바꾸는 것.
		} 

//		for (Car c : cars) {
//			c = new Car();
//		}
		
		for (Car c : cars) {
			System.out.println(c);
		} // 값을 확인 할 때는 for each도 좋다.
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
	}
}
