// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;

public class SumAvrg {
	public static void main(String[] args){
		
		Scanner point = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		System.out.print("국어 점수를 정수로 입력하세요 : ");
		kor = point.nextInt();

		System.out.print("영어 점수를 정수로 입력하세요 : ");
		eng = point.nextInt();

		System.out.print("수학 점수를 정수로 입력하세요 : ");
		math = point.nextInt();
		
		int sum = kor + eng + math;
		int avrg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avrg);
	}
}