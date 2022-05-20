// 컵 사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large
// 100이상 ~ 200미만 medium
// 100미만 small

import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사이즈 머임? ");
		int cup = scan.nextInt();
		
		String size;
		if (cup >= 200) {
			size = "large";
		} else if (cup >= 100 ) {
			size = "medium";
		} else {
			size = "small";
		}
		
		System.out.println(size);
	}
}
					// 조건식 구조 else 절이 필요없다면, 굳이 적지 않아도 된다
					// 대신 if 와 else if 절이 모두 거짓이면, 실행되지 않음
			// 		if (조건식) {
				
				// 	} else if (다른 조건식) {
					
				// 	} else if (다른 조건식) {
					
				// 	} ... {
					
				// 	} else {
					
				// 	}