public class CharType {
	public static void main(String[] args) {
		// 문자열" "과 다르게 ' ' 홑따옴표를 씀. 문자 하나를 표현
		char a = 'a';
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		char what = 65; // 유니코드 '65'의 값은 'A' 이다.
		
		// System.out.println(what);
		// // 숫자취급을 해서 산술 연산이됨.
		System.out.println(what + a);
		
		// char => '\n'을 하나의 문자로 취급함. '\n'은 줄바꿈.
		char linefeed = '\n';
		// '\t'는 들여쓰기 할 때, 일정한 공백을 가질 때 사용
		char tab = '\t';
		System.out.print("qwer" + linefeed);
		System.out.print("q\nw\ne\nr\n");
		System.out.print(tab + "다음줄인가?\n");
		
		// ', ", \ 같은 기호를 문자로 표현 하려면 \ 백슬러시를 앞에 써줌으로 나타낼 수 있다.
		System.out.println('\'');
		System.out.println("\"");
		System.out.println("\\");
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(ga);
		// System.out.println(num1);
	}
}