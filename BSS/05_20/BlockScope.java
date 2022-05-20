public class BlockScope {
	public static void main(String[] args) {
		int a = 10; // <<<=== '지역 변수'; 중괄호 안에서만 사용가능
		{
			int b = 20; // <<<<=== '지역 변수'; a와 범위만 다를 뿐
			
			// int a = 99; // 상위에 있는 a가 정의 되어 있어서 에러
			System.out.println("가능한가?");
			System.out.println(a);
			System.out.println(b);
		}
		int b = 35;
		System.out.println(b); // 안쪽의 지역변수인 b = 20;는 밖에서 사용불가, 바깥쪽의 b = 35;결과값 출력
		// 범위 안의 변수는 범위 안에서만 존재; 큰 범위로 나갈 수 없음
		// 하위 범위는 상위의 것들을 상속 받지만, 하위에서 상위는 상속받지 않음
		// 프로그램이 종료되면 사라지는 값들
		// System.out.println(b);
	}
}