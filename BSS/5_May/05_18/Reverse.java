// 사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램
// 12345 => 54321
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("5자리의 정수를 입력하세요 : ");
		int num = number.nextInt();
		
		int len1 = (num % 100000) / 10000; // 다른분 수식 : (num / 100) % 10; 이런식도 된다.
		int len2 = (num % 10000) / 1000;
		int len3 = (num % 1000) / 100;
		int len4 = (num % 100) / 10;
		int len5 = num % 10;
		
		System.out.println("입력한 수의 역순은 '" + len5 + len4 + len3 + len2 + len1 + "' 입니다.");
		System.out.println("입력한 수의 각 자릿수 합은 '" + (len5 + len4 + len3 + len2 + len1) + "' 입니다.");
	}
}