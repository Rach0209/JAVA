public class StaticVariableAndConst3 {
	public static final int NUMBER = 100; // 전역 변수
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// NUMBER++;
		System.out.println("메인메소드에서 : " + NUMBER);
		
		test();
		
		System.out.println(Math.PI); // 자바 개발자들이 만들어 놓은 파이 값. -- 파이 값은 변하지 않음.
		// Math.PI++; // 에러발생
		
		// double a = Math.abs(-372); // 절대값 static한 메소드 Math.abs; 기능을 바로 제공해줌.
		// System.out.println(a);
		
		double r = Math.random(); // 0 ~ 1 사이의 실수를 랜덤하게 만들어 실수 형태로 출력
		r = (int) (r * 10); // 곱셈 활용해서 범위 가지는 정수 형태 숫자 만듦.
		System.out.println(r);
	}
}