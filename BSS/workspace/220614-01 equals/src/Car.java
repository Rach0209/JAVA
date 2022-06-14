public class Car {
	private String model;
	public Car(String model) {
		this.model = model;
	}
	@Override // 헤더를 똑같이..
	public boolean equals(Object obj) { // 객체 하나를 비교
		if (obj instanceof Car) {
			Car otherCar = (Car) obj;
			return model.equals(otherCar.model);
//			return model.equals(((Car) obj).model);
		} else {
			return false;
		}
	}
}
