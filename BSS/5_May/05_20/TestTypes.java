// 자료형의 확장, 축소 특징;
public class TestTypes {
	public static void main(String[] args) {
		char a = (char) 65;
		System.out.println(a);

		int num = (int) a;
		System.out.println(num);
	
		// double d = 123.456;
		// int i = (int) d;
		// System.out.println(i);
		
		
		
		
		// byte b = 10;
		// // byte 와 short 는 컴파일러에서 값을 int 형식으로 처리한다// 자동으로 다른 타입으로 형변환 
		// short s = 100;
		// int i = 1000;
		// long l = 10000; //int 형이 long 타입 박스에 들어가는것 => 자료형의 확장
		
		// //------------ 항상 '축소형'은 손실의 가능성을 확인 하고 사용---------------
		// (int) '()' => 손실을 감수하고도 컴파일을 할 것이라는 의미
		// // int i = 1000L; => 컴파일러에러 ; 자료형의 축소 ; 값의 손실 가능성이 생김
		// // int i = (int) 1000L; => 에러 없음. 가능한 값이기 떄문
		// // int i = (int) 3214545461L; => 출력값이 바뀜 문제발생 손실을 감수하고 결과를 도출해낸 것이기 때문
		// int sum = b + s;
		// System.out.println(sum);
	}
}