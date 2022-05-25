public class FloatTypes {
	public static void main(String[] args) {
		float f = 123.456F; // java compiler 는 기본적으로 실수표현을 double로 인식하기 때문에 f를 붙임.
		double d = 7777.88888;
		
		// double sum = f + d; // float  사용 => 에러. ---- double => 사용가능
		
		// int i = 10000;
		// // 정수와 실수의 연산에서는 실수를 따라가려함. int 사용불가, float사용.
		// float sum = i + f;
		
		float one = 0.1F;
		System.out.printf("%.15f\n", one * 22); // 근삿값. 2진수에서는 오차발생해서 정확한 값이 나오지 않는다.
		// double도 오차는 생기지만 오차의 범위가 다름.
		// %.15f 는 소숫점 15자리 까지 나타낼수 있다는 표현
		System.out.printf("%10d\n", 10); // 10자리 출력 =>        10 으로 값이나옴
		System.out.printf("%010d", 10);  // 10자리 중 빈자리는 0으로 채움 => 0000000010
		// %f 는 실수, %d는 정수
	}
}