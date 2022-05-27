public class StaticVariableAndConst2 {
	public static void printTest(int param) { // 새롭게 변수가 만들어 짐. parameters 안에 final int 를 넣으면 컴파일 에러;
		param++;							// final int 는 변화 불가 
		System.out.println(param);
		// System.out.println(TEST_SCOPE); // 메소드에 값을 전달하지 않으면 마찬가지로 컴파일 오류, 메소드 범위 벗어남
	}
	public static void main(String[] arsg) {
		int inner = 10;
		// System.out.println(TEST_SCOPE); // 지역변수와 마찬가지로 범위가 있음
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		

		{
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;
			final int BLOCK = 100; // 지역변수
		}
		// System.out.println(BLOCK); // 지역변수 범위 벗어남 => 컴파일 에러
	}
}