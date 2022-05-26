// 7.  2 ~ 100 사이의 모든 소수 출력하기

// 나머지가 2개인 수 를 count에 담기.
// count에 담긴 수는 소수 ; 
// 소수면 출력
// 카운터 초기화 후, 다시 반복문으로


public class PrimeNum {
	public static void main(String[] args) {
		int count = 0;							// 나머지가 1과 자신 뿐인 수 담을 박스
		for (int i = 2; i <= 100; i++) {		// 2부터 100까지의 수 반복문
			for (int j = 2; j <= i; j++) {		// 첫 반복문을 2부터 100으로 나누기를 반복
				if (i % j == 0) {				// 첫 반복문의 값을 두번째 반복문으로 나눈 나머지가 0 일 때, 그 수는 소수
					count++;					// 소수이므로 count 박스에 ++로 담기.
				}
			}
			if (count == 1) {					// count에 1개이상 담기면 그 수는 소수
				System.out.print(i + " ");		// 담긴 소수인 i 의 값을 출력.
			}
			count = 0;							// 박스를 다시 비워주고 상위 반복문이동 - 반복 - 출력결과 도출
		}
	}
}