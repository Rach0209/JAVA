// 사용자가 입력한 영단어(latin문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요.

// 6번

import java.util.Scanner;

public class UserQ6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영단어 입력 ㄱ : ");
		String str = scan.nextLine();
		int length = str.length();
		// System.out.println(length); // 글자 총 길이 계산 // index = 0 ~ (length-1)
		int count = 0;
		for (int i = 0; i < length; i++) {
			char a = str.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				count++;
			}
		}
		System.out.print("모음 개수 : " + count);
		
	}
}