// 소수 목록 구하기

public class PrimeNumbers {
	public static boolean isPrime(int i) {		// 소수인지 확인해서 t/f 나오는 메소드
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {				
				count++;
			}
		}
		if (count == 2) {
			return true;		// 소수면 true, 아니면 false; true, false 표현을 위해 boolean값 넣음.
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) { // 2 ~ 10000
			boolean result = isPrime(i); // 소수인지 알아본다. 참, 거짓
			if (result) { // '참'이면
				System.out.println(i);	// 출력
			}
		}
	}
}