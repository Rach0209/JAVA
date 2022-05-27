// 1. 원의 반지름(실수형)을 실수형으로 전달받아 원 넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인하기.

// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드. (return type : void)

// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

// 4. 키(실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수)구해 반환하는 메소드.
// BMI = (몸무게) / (키)^2

// 3번.
import java.util.*;

public class Q3length {
	public static int lengthOfLetters(int a, int b) {
		int sum = a + b;
		return sum;
	}
	// 복습 만든것
	public static int getTotalLength(String str1, String str2) {
		return str1.length() + str2.length();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 알고 싶은 문자열을 입력하쇼(1/2)");
		String user1 = scan.nextLine();
		int length1 = user1.length();
		
		System.out.println("길이를 알고 싶은 문자열을 입력하쇼(2/2)");
		String user2 = scan.nextLine();
		int length2 = user2.length();
		
		int sum = 0;
		sum = lengthOfLetters(length1, length2);
		
		
		System.out.println(sum);
		// getTotalLength 결과값
		int length3 = getTotalLength("abcde", "가나다라");
		System.out.println(length3);
		
		// getTotalLength 사용해서 입력받은 문자 길이 출력하기
		int length4 = getTotalLength(user1, user2);
		System.out.println(length4);
	}
}