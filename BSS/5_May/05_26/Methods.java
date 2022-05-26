public class Methods {
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	public static boolean isEven(int number) {	// 짝수면 참, 홀수면 거짓
		return number % 2 == 0;
	}
	// int isEven(int)
	
	// char isEven(int)
	
	// public static void isEven(int num) {
		// return;			// 결과를 알려주는 값을 return하고싶을 땐 void 는 불가능.
	// }					// 결과 자체를 받아 볼 수 없고, void 는 타입이 없다.
	

	public static int increase(int a) {
		a++;
		return a;
	}
	
	// method는 return값을 1개만 가진다. 참조형 변수에서는 달라짐
	// public static int,int createTwoNumber() {
		// return 10,20;
	// } // 컴파일 에러
	
	// public static boolean test() {
		// return 10;
	// }
	
	public static void main(String[] args) {
		boolean result = isEven(122);
		System.out.println(result);
		// int a = 10;
		// a = increase(a); // Call By Value
		
		// System.out.println(a);
		
	}
}