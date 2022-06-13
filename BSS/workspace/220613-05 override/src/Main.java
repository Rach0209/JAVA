public class Main {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.sound();
		
//		자식 클래스에 있는 것을 호출
		// Dog 클래스에 정의된 sound()메소드가 호출
		Dog d = new Dog();
		d.sound(); // 상속 받기 때문에 부모 클래스의 메소드 자체를 가져옴.
//		d.bark(); 
		// Cat 클래스에 정의된 sound()메소드가 호출
		Cat c = new Cat();
		c.sound();
	}
}
