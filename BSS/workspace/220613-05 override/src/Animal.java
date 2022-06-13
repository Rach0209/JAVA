public class Animal {
	public void sound() {
		System.out.println("동물들은 제각각의 소리를 냅니다.");
	}
}
//		클래스 다이어그램으로 이해하기
class Dog extends Animal {
	@Override // annotation 어노태이션  an notation? 
	// 오버라이드 할때 컴파일 시에 부모클래스에 똑같은 메소드가 있는지 미리 확인.
	// 오타가 있거나 하면 표시해줌.
	public void sound() {// *** method override (메소드 오버라이드) *** 덮어쓰기 느낌
		// 헤더부분을 완전히 똑같이 적어야 함.
		// 부모 클래스의 메소드 헤더 부분을 그대로 적어서 자식 클래스에 맞게끔 변경
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() { // *** method override (메소드 오버라이드) *** 덮어쓰기 느낌
		// 부모 클래스의 메소드 헤더 부분을 그대로 적어서 자식 클래스에 맞게끔 변경
		System.out.println("냐~옹");
	}
}
