public class AutoInc {
	public static void main(String[] args) {
		int a = 10;
		// 증감연산자는 변수의 앞뒤에 붙을 수 있다
		// ++a = 11, a++ = 10 으로 나옴
		System.out.println(a++);
		// 위치에 따라 수행 순서가 다름
		// 앞에 붙으면 ++ 연산이 먼저 수행, 뒤에 붙으면 후에 수행
		System.out.println(a); // 11
		
		// 만약 시작부터 1을 더해야 한다면
		// a++; 을 출력보다 먼저 입력하면 a 의 값이 11로 나옴
		
		
		// 복합 대입 연산자 += -= // 좀 더 큰 값으로 바꿀 때.
		// a += 1; // 11
		// a -= 1; // 10
		
		// -----증감연산자
		// a++; 대부분은 ++a 보다 a++을 주로 쓴다고한다.
		// a++;
		// a++;
		
		// a--;
		// System.out.println(a);
	}
}