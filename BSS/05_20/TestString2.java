// 문자열 (String) 2
public class TestString2 {
	public static void main(String[] args) {
		// "Hello" 하나하나가 char이며 순서가 있다; 순서는 0부터 시작; Hello = 01234 순서;
		String hello = "Hello";
		// 숫자를 넣고 싶으면 " " 안에 집어넣어야함 => int값으로 처리되서 연산;
		// (string) 넣는 형변환도 먹히지 않는다; 
		
		char h = hello.charAt(0);
		System.out.println(h);
		// System.out.println(hello.charAt(-1)); // 음수나 오버된 숫자가 들어오면 컴파일 에러;
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		// 마지막 글자 index값은 (글자 수의 갯수 - 1) 을 해주면 된다; 공백도 하나의 개수로 취급;
		
		// length 메소드를 호출해서, 문자열이 몇 글자로 이루어져 있는지 int 형태로 결과값을 출력함;
		int length = hello.length();
		System.out.println(length);
	}
}