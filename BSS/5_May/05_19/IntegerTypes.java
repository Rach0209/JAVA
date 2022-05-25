public class IntegerTypes {
	public static void main(String[] args) {
			byte b = 100;
			short s = 30000;
			int i = 10_000_000; // , 로 자릿수를 표현하면 compile 에러 ---> 대신 _ 사용.
			long l = 123456789L; // L <= compiler에게 L왼쪽 숫자가 long 값이라는 표현. 소문자도 가능하지만 구분이 힘들어서 대문자를 주로쓴다.

			int bs = b + s;
			System.out.println(bs);
			// 연산은 큰 범위를 따라감.
			long sum = 100 + 100L; // 큰 범위를 따라가기 때문에 박스도 큰 것이 필요 int는 불가, long은 가능.
			
			// byte b2 = 100;
			
			// byte sum = b + b2;
			// System.out.println(sum); // 공간이 부족하여 error 발생. 넉넉한 값을 넣어주어야 함.
	}
}