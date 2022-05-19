public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		// a = a + 5;
		// 복합 대입 연산자
		a += 5;
		
		
		System.out.println(a);
		// 산술연산자가 대입연산자 앞에 위치해야함!
		a -= 3;
		a *= 2;
		a /= 4;
		a %= 2;
	}
}