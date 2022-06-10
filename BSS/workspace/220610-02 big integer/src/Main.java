import java.math.BigDecimal;
import java.math.BigInteger;

// 숫자 범위 벗어났을 때 큰 수 표현 하기.
public class Main {
	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		
//		BigInteger value1 = BigInteger.valueOf(Long.MAX_VALUE + Long.MAX_VALUE); // long 타입 두개를 더한 것이라 값이 이상하게 나옴.
		BigInteger value1 = new BigInteger("9223372036854775808"); // 큰 숫자를 문자열로 올 수 있게끔 생성.
//		System.out.println(value1 + 5); // 산술 연산자 사용 불가.
		System.out.println(value1.add(new BigInteger("10"))); // add 타입 = BigInteger 타입. // 하나의 객체임. 큰 수를 표현하기위한 클래스.
		System.out.println(value1); // value1 값은 바뀌지 않음 - 상태값의 변화가 없다. // 새로운 BigInteger 값을 만들어 낸다.
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1); // double형인 값 자체가 부정확한 값이라서 다른 값이 나옴.
		System.out.println(d);
	}
}
