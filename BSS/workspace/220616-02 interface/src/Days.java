// interface는 기본적으로 추상 메소드가 옴.
// 상수를 정해놓고 쓰는데에 인터페이스를 사용 할 수 있음
// 인터페이스는 필드, 생성자가 없음 // 추상 클래스는 필드가 있음.
public interface Days {
//	public static final int NUM = 10;// int num = 10;
	public static final int MONDAY = 1; // int MONDAY = 1;만 적어도 상관없음.
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
}
// JAVA 8 버전 부터 interface에 미리 동작을 구현 해놓는 방식이 생김.
// **** default 메소드 **** 추상 메소드의 기본 구현 값
// 특별히 오버라이드 하지 않을 때 기본 동작을 만들어줌.
// 접근이 쉽게끔 형태를 미리 만들어준다.
interface MyInterFace {
	default void printHello() {
		System.out.println("Hello");
	}
	
	// static한 메소드.
	// 객체를 나타내는 행동이 아니기 때문.
	// 그저 정적인 기능이기 때문에 어디든 들어갈 수 있다. - 관련있는 클래스나 인터페이스
	public static void myStaticVersionMethod() {
		
	}
	
	// private한 메소드는 불가능.
	// JAVA 9 버전부터는 private 가능;
	static int sum(int a, int b) {
		return a + b;
	}
}
