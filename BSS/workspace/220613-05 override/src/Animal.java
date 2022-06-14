public class Animal {
	public void sound() {
		System.out.println("동물들은 제각각의 소리를 냅니다.");
	}
}
//		클래스 다이어그램으로 이해하기
class Dog extends Animal {
	@Override // annotation
	// 오버라이드 할때 컴파일 시에 부모클래스에 똑같은 메소드가 있는지 미리 확인.
	// 오타가 있거나 하면 표시해줌. 오버라이드 실수 방지.
	public void sound() {// *** method override (메소드 오버라이드) *** 덮어쓰기 느낌
		// 헤더부분을 완전히 똑같이 적어야 함.
		// 부모 클래스의 메소드 헤더 부분을 그대로 적어서 자식 클래스에 더 구체적인 내용으로 변경
		// 부모 클래스 행동말고, 자식 클래스의 행동이 언제나 호출됨.
		System.out.println("멍멍");
	}
	
	@Override // 명시하지 않지만, 기본Object의 toString()을 오버라이드 한것임.
	public String toString() {
		return "강아지입니다";
	}
}

class Poodle extends Dog {
	@Override
	public void sound() {
		System.out.println("얼얼얼");
	}
}

class Cat extends Animal {
	public void sound() { // *** method override (메소드 오버라이드) *** 덮어쓰기 느낌
		// 부모 클래스의 메소드 헤더 부분을 그대로 적어서 자식 클래스에 더 구체적인 내용으로 변경
		System.out.println("냐~옹");
	}
}
