// p.73 3번 (구 부피)

import java.util.Scanner;

public class CircleVol {
	public static void main(String[] args) {
		
		Scanner radius = new Scanner(System.in);
		
		System.out.print("반지름의 값을 입력하세요: ");
		double r = radius.nextDouble();
		double r3 = 4 * (r * r * r) / 3;
		
		System.out.print("구의 부피는 '" + r3 +"'입니다.");
		
	}
}