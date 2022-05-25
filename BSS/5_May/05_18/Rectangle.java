// 사용자의 직사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력

// 정수 입력은 Scanner 객체의 nextInt

// 둘레는 (밑변 + 높이) * 2
// 넓이는 (밑변 * 높이)


import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args){
		System.out.println("사각형의 둘레와 넓이 구하기!");
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		int mul;
		
		System.out.print("밑변의 길이를 입력하시오: ");
		x = input.nextInt();
		
		System.out.print("높이의 길이를 입력하시오: ");
		y = input.nextInt();
		
		sum = (x + y) * 2;
		mul = x * y;
		
		System.out.println("둘레: " + sum);
		System.out.println("넓이: " + mul);
		
	}
}