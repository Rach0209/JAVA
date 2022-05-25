// 제어문 ... 흐름 (flow) ...
// 일반적으로 위에서 아래로 흐름

public class TestIf {
	public static void main(String[] args) {
		// 조건식은 boolean형 타입 값 true / false ;
		boolean condition = true;
		if (condition) { // if - then 절이라 부름 // 맞으면 ~해라;
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");
		
		// false이기 때문에, 문자열 "조건문 블록 안입니다."를 출력하지않고 프로그램 종료.
		boolean condition2 = false;
		if (condition2) {
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");
	}
}