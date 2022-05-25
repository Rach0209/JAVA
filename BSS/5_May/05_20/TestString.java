// 문자열 (String) 1
public class TestString {
	public static void main(String[] args) {
		String str;
		// 참조형이든 기초형이든 변수의 초기화가 없으면 컴파일 에러로 사용 불가
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2);
		
		String concat = str + (1 + 2) + "\n" + true + s2 + 3.0;
		System.out.println(concat);
	}
}