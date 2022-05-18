// p.73 3번 (구 부피)

import java.util.Scanner;

public class CircleVol {
	public static void main(String[] args) {
		
		Scanner radius = new Scanner(System.in);
		
		System.out.print("반지름의 값을 입력하세요: ");
		
		
		double r = radius.nextDouble();
		double r3 = 4 * (r * r * r) / 3;
		
		double result = Math.pow(r, 3); // 함수식으로 계산하기 거듭제곱 계산 법. Math.power(double, double)
		
		
		System.out.println("구의 부피는 '" + r3 +"'입니다.");
		System.out.println("구의 부피는 '" + (4 * result / 3) +"'입니다.");
	}
}