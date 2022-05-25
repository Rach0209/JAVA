// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx - 1xxxxxx
// 한줄 통째로 입력

import java.util.*;

public class RegiNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		System.out.println("ex) 6자리-7자리");
		String regi = scan.nextLine();
		// int length = regi.length();
		char gender = regi.charAt(7);
		// System.out.print(gender);
		// System.out.print(length);// 6번자리 '-' // 7번자리 '1~4';
		String result;	// result 변수선언해서 하기
		
		if (regi.length() == 14) {
			switch (gender) {
				case '1': 	case '3':
					result = "남성"; // System.out.println("남성");
					break;
				case '2': 	case '4':
					result = "여성"; // System.out.println("여성");
					break;
				default:		// default 값이 없으면 result 값을 초기화 시키지 못하는 경우가 생길 수 있어서, 컴파일러 에러 발생.
					result = "잘못 입력"; // System.out.println("잘못 입력하셨습니다.");
					break;
			}
		} else {
			 result = "잘못 입력";  //System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(result);

		// if 문으로만 만들기
		// if (regi.length() == 14) {
			// if (gender == '1' || gender == '3') {
				// System.out.println("남");
			// } else if (gender == '2' || gender == '4') {
				// System.out.println("여");
			// } else {
				// System.out.println("잘못 입력하셨습니다.");
			// }
		// }
	}
}