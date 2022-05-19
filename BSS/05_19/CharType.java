public class CharType {
	public static void main(String[] args) {
		// 문자열" "과 다르게 ' ' 홑따옴표를 씀. 문자 하나를 표현
		char a = 'a';
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		char what = 65; // 유니코드 '65'의 값은 'A' 이다.
		
		System.out.println(what);
		// 숫자취급을 해서 연산이됨.
		System.out.println(what + a);
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(ga);
		// System.out.println(num1);
	}
}