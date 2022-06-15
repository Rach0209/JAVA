package hi;
	// 인터페이스 라는 것을 알려주기 편하게, 
	// class 이름에 I 를 붙여준다.
public interface IGreeting {
	// 추상 메소드 생성
	void sayHi();
}

	// 인터페이스의 세분화
	// 인터페이스도 상속할 수 있다. extends 사용
	// es) 영어인사를 하는 한국인, 한국 인사하는 영국인
interface IEngGreeting extends IGreeting {
	void howoldru();
}
interface IKorGreeting extends IGreeting {
	void whodoyourfatherdo();
}

class IKorean extends Student implements IGreeting {
	// 스튜던트 상속받는 코리안 생성자
	public IKorean(String name, int age) {
		super(name, age);
	}
	// 추상 메소드를 상속받으면 바디부분을 만들어 오버라이드 해주어야 함
	@Override
	public void sayHi() {
		System.out.println("안녕");
	}
}

class IBritish extends Student implements IGreeting {
	public IBritish(String name, int age) {
		super(name, age);
	}

	@Override
	public void sayHi() {
		System.out.println("Hello");
	}
}

class American implements IGreeting {
	@Override
	public void sayHi() {
		System.out.println("Wassup~");
	}
	
}
