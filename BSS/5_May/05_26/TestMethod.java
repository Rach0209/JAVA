public class TestMethod {
	public static void printRepeat() {	// 메소드 머리(head) // printRepeat() 부분은 method의 '이름'부분
		// 메소드 몸통(body) 
		for (int i = 0; i < 3; i++) {			// <<<< 메소드 만들기.
			System.out.println("반복 중");		// 프로그램의 시작은 언제나 main 메소드로 시작하기떄문.
		}										// 처음엔 인식되지 않고 넘어감.
	}

	// printHello
	public static void printHello() { // 메소드는 항상 몸통 {} 중괄호 를 포함해야한다. 비어있더라도 적어줘야함
		int number = 10;
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	} 

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		printHello();
		// System.out.println("헬로안에서 초기화한변수 값: " + number); // 위의 {} 안 지역변수로 인식 -> 컴파일 에러;
		// for (int i = 0; i < 2; i++) {
			// printRepeat();			// 메소드 호출 // 위의 printRepeat() 메소드 중괄호 까지 인식후, 다시 제자리로 돌아와서 흐름이 내려간다.
		// }
		
		System.out.println("프로그램 끝~");
	}
}