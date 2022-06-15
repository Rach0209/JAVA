// 다중상속이 불가능한 자바에서 인터페이스를 이용하여 비슷한 기능 하기
// 인터페이스 => 추상적 동작에 집중
// ~ 할 수 있음 // 날 수 있음 ...
// 인터페이스는 추상 메소드만 가짐

public interface Flyable {
	// 추상적 메소드만 가지기 때문에, 앞에 추상 생략가능, 접근 제한자는 무조건 public
	// public abstract void fly();
	void fly();

	// 구체화된 일반적인 메소드를 가질 수 없다.
	// ***** 추상 메소드만 가짐 *****
//	public void print() {
//		System.out.println("Hello");
//	}
}

class Animal {}

class Bird extends Animal {}

// 인터페이스 = 구현한다.
// 클래스 옆에 implements 인터페이스 이름; 적어줌 
class Eagle extends Bird implements Flyable {
	@Override 
	// 독수리는 날 수 있는 새다.
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 날아올라.");
	}
} 

class Penguin extends Bird {}


class Flyingfish extends Animal implements Flyable {

	@Override
	public void fly() {
		System.out.println("날치가 물위로 날아댕김");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 날아다님");
	}
	
}

