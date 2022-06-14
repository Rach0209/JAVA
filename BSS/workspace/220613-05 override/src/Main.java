public class Main {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.sound();
		
//		자식 클래스에 있는 것을 호출
		// Dog 클래스에 정의된 sound()메소드가 호출
//		Dog d = new Dog();
//		d.sound(); // 상속 받기 때문에 부모 클래스의 메소드 자체를 가져옴.
////		d.bark(); 
//		// Cat 클래스에 정의된 sound()메소드가 호출
//		Cat c = new Cat();
//		c.sound();
//		
//		System.out.println();
//		// 자동 업캐스팅.
//		Animal a = (Animal) new Dog();
//		a.sound();
//		
//		// 다운 캐스팅.
//		Dog dog = (Dog) a;
//		dog.sound();
		
		Animal a = new Cat();
		Animal a2 = new Dog();
		
		// 컴파일은 가능, 실행도중 에러
		// a가 참조하는 것은 고양이이지 개가 아님.
//		Dog d = (Dog) a;
		// 다운캐스팅 확인
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.sound(); // instanceof 값이 false : 형 변환 일어나지 않음.
		}
		if (a2 instanceof Dog) {
			Dog d2 = (Dog) a2; // 가능
			d2.sound(); // instanceof 값이 true : 형 변환 일어남.
		}
		
		Dog p = new Poodle();
		// 참조 가능. 푸들은 개고, 푸들은 동물이다.
		Animal animal = p;
		
		animal.sound();
		
/*
 * 객체는 상향 변환은 기본적으로 가능하다. 
 * 상향 : 동물의 참조로 푸들 인스턴스를 참조가능, 동물의 참조로 고양이 인스턴스 참조가능.
 * 하향 : 참조를 하려면 확인을 해주어야 가능.
 */
		
		Object o = new Dog(); // 되는 이유 : Object 클래스가 Dog의 상위 클래스이기 때문.
		// JAVA는 최상단에 Object라는 클래스를 상속 받을 수 있게끔 만들어준다.
		// 클래스 다이어그램 참조; Object > Animal > Dog > Poodle.
		// equals, toString은 Object클래스에 먼저 정의 되어 있었고,
		// 우리가 Override를 한 것.
		System.out.println(o.toString()); // Object toString() 객체의 기본 행동.
		
	}
}
