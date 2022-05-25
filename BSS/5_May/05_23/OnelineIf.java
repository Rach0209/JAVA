public class OnelineIf {
	public static void main(String[] args) {
		boolean con = false;
		
		// if 절이 한 문장씩일때는 중괄호{}가 생략 가능하다.
		// if (con) 
			// System.out.println("참일 경우 실행할 문장");
		// else 
			// System.out.println("거짓일 경우 실행할 문장1"); // 줄바꿈없을 때도 마찬가지로, 한문장일 경우 가능;
			// System.out.println("거짓일 경우 실행할 문장2"); // {}중괄호의 바깥 영역이다; => 일반 문장임. 중괄호를 써주는 편이 인식하기 쉬움
		
		// '?' 삼항연산자
		String result = (con) ? "참" : "거짓";
		
		// int result = (con) ? 100 : -100;
		// if절로 쓰면 길어짐.
		// int r;
		// if (con) {
			// r = 100;
		// } else {
			// r = -100;
		// }
		
		// (con) ? System.out.println("참 출력") : System.out.println("거짓 출력"); // 문장 실행 => if else 사용
		System.out.println(result);

		System.out.println("프로그램 종료");
	}
}