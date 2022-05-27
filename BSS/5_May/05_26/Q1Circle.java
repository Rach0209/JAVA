// 1. 원의 반지름(실수형)을 실수형으로 전달받아 원 넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인하기.

// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드. (return type : void)

// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

// 4. 키(실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수)구해 반환하는 메소드.
// BMI = (몸무게) / (키)^2

// 1번.
import java.util.*;

public class Q1Circle {
	public static double circleArea(double r) {
		return 3.14 * (r * r);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름의 길이를 입력");
		double radius = scan.nextDouble();
		double result = circleArea(radius);
		System.out.println(result);
	}
}