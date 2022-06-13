public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	// 파라미터의 타입, 순서가 다르면 - 다른 메소드로 인식한다.
	// 다양한 타입에 대응하기 위함.
	// 메소드 오버로딩을 위한 메소드. 원래sum(10.0, 40.0); 은 실수라서 밑의 메소드가 있기 전에는 동작 불가능.
	// 헤더부분에서 파라미터부분만 변경. 파라미터의 타입, 갯수, 순서 동일한지 확인  // return타입도 바뀔 수 있다.
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("asdf");
		
		// Method Overloading 메소드 오버로딩 => 다양한 타입에 대응할 수 있게끔 동작. 대표적인System.out.println();
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123.123");
		sum(50, 20);
		sum(10.0, 40.0); // 기존에 메소드 sum(int a, int b)만 있었을 때는 실수에는 동작 X 컴파일 에러, 타입 차이
	}

}
