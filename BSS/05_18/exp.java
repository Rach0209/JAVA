// 사용자에게 정수 하나를 입력받아서
// 제곱 값을 출력하는 프로그램

import java.util.Scanner;

public class Involution {
	public static void main(String[] args){
		
		Scanner number = new Scanner(System.in);
		int x;
		int inv;
		
		
		System.out.print("제곱할 정수값을 입력하세요: ");
		x = number.nextInt();
		
		invol = x * x;
		
		System.out.println("제곱값은 '" + invol + "'입니다");
		
	}
}