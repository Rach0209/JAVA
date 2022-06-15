// 손자 클래스
// MyClass를 상속하는 MySubClass를 상속하는 클래스

// 종단 클래스로 만들고 싶을 때 => final 클래스; 더 이상 상속할 수 없게, 확장 불가능
//class Test extends MyImpleClass {} // 컴파일 에러

public final class MyImpleClass extends MySubClass {
	// 메소드 1번은 MySubClass에서 Override 되어있어서, Override 할 필요가 없다.
	// 만약 그렇지 않다면 => 모두 Override 해야함
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
	}
	
	// 새롭게 재정의
	@Override
	public void myMethod() {
		System.out.println("새롭게 재정의를 하였습니다.");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
//		m.myMethod2(); // MyClass 에는 myMethod2 기능이 없다! 실행불가
		
		MySubClass sub = (MySubClass) m;
		sub.myMethod();
		
		sub.myMethod2();
	}
}
