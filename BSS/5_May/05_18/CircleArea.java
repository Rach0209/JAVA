import java.util.Scanner; // 프로그램은 스캐너 클래스를 사용한다.

public class CircleArea {
	public static void main(String[] args){
		
		double radius; // 원의 반지름 --- 똑같이 변수 선언.
		double area; // 원의 면적
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오: "); // 입력 안내 출력
		radius = input.nextDouble(); // 실수값을 입력받아서 radius에 저장한다.
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}
	
}