public class TestMethod2 {
	// 메소드의 이름 == 영소문자; 여러 단어가 있으면 다음 단어의 첫번째 글자 -> 대문자 / 동사로 많이 작성
	// 이름을 다르게 해도 컴파일은 되나, 통용되는 방법은 위의 방법으로 이름 작성
	// 메소드 이름과 변수 이름이 같아도 되긴함 -> 메소드에는 () 가 항상 붙어있기 때문.... but 읽을 때 헷갈릴 수 있음.
	public static int sum() { // return type : void (없음, 공허); return type 이 void 다 = 없는 것을 반환한다 = 반환이 없다.
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum; // 값을 반환(뱉어냄) 해줌. 여기서 sum 값은 30; 30이라는 값을 가지고 main메소드의 sum(); 으로 이동.
					// return sum; 은 변수 이름.
	}
	
	// pi 메소드 { 3.14 실수값을 반환하는 메소드}
	public static double pi() { // return 하고자 한다면 -> void는 절대 X. 아주 엄격함.
		return 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum(); // result에 초기화. 메소드인 sum() 에 int 값을 주어서 int 값인 정수하나를 가지고 온 것.
		System.out.println(result);
		double pi = pi();
		System.out.println(pi);
		
		System.out.println("끝");
	}
}