public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// Wrapper class
		//		Byte b;
		//		Short
		//		Integer
		//		Long
		//		Float
		//		Double
		//		Character
		//		Boolean
		// Integer 는 JAVA 8 버전에서는 기본구성, 9버전 부터는 deprecated -> 더 이상 사용하지 않음. 빠른 시일내에 수정해라;
		// 9버전 : deprecated -> valueOf(int) 로 변경되었음.
		// 숫자 10의 필드를 가진 객체생성. i 라는 참조로 참조중.
		// i , i2 는 값을 가지고 있는 것이 아니라. 10, 500 이라는 값을 참조 중임.
		Integer i = new Integer(10);  // deprecated
		Integer i2 = Integer.valueOf(500); // boxing 포장한다~ 감싼다~
		// primitiveInt는 참조된 500 이라는 값가지고 와서 값을 가지고 있음!!
		int primitiveInt = i2.intValue(); // unboxing 포장한 것을 알려줘~
		
//		System.out.println(primitiveInt);	
		Integer auto = 100; // auto-boxing 자동으로 박스 포장함. 
		int un = auto; // 반대로 원시형태로 다시 자동으로 포장을 풀게함.
		System.out.println(un); // 위의 과정과 차이점 없음 // 한 가지 경우 다른점 존재.
		
		Integer value = Integer.valueOf("5959"); // valueOf(String); => 문자열을 숫자로 반환해준다!
		int result = Integer.valueOf("1234"); // 박싱 -> 이 값은 Integer의 참조값. // 자동으로 포장을 품
		System.out.println(result); // 언박싱 
		
		Integer.parseInt("90"); // -> 이 값은 int형 값  valueOf와 다름.
	}
}
