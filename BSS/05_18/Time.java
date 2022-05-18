// 사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환을 하는 프로그램

// 입력예) 3666
// 출력예) 1시간 1분 6초

// 1분 = 60초 1시간 3600초

import java.util.Scanner;

public class Time {
	public static void main(String[] args){
		
		Scanner second = new Scanner(System.in);
		
		System.out.print("몇 초인지 입력하세요 : ");
		int a = second.nextInt();
		
		
		int x = a / 3600;
		int y = (a % 3600) / 60;
		int z = a % 60;
		
		System.out.print((x + "시간") + (y + "분") + (z + "초"));
	}
}