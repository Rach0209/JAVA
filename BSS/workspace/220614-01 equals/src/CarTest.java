public class CarTest {
	public static void main(String[] args) {
		// Car 클래스에서 instanceof 메소드를 정의하지 않으면, 둘은 다른 참조값이기 때문에 동일하지 않음. false;
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
	}
}
