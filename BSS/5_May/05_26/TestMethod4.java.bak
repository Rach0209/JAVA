import java.util.*;

public class TestMethod4 {
	// 정수 하나를 전달받아 1 ~ 100 사이의 수이면 true을 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성.
	public static boolean between(int num) {
		if (num >= 1 && num <= 100) {
			return true;
		} else {
			return false;
		}
	}

	// 사용자가 점수 입력을 국어, 영어, 수학 하는데 (점수는 무조건 1 ~ 100사이여야함)
	// 입력한 점수와, 점수 합을 출력해보세요~~~
	public static int point(int a, int b, int c) { 	// 점수의 합계
		int sum = a + b + c;
		return sum;
	}
	public static int doaverage(int a, int b, int c) {	// 점수의 평균
		int arg = (a + b + c) / 3;
		return arg;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = scan.nextInt();					// 스캐너 선언 초기화
		while (!(between(kor))) {				// 입력받은 값 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력.
			System.out.println("다시 입력하세요.");	
			kor = scan.nextInt();
		}
		System.out.println("영어 점수를 입력하세요");
		int eng = scan.nextInt();
		while ( !(between(eng)) ) {				// boolean return 메소드를 사용.  
			System.out.println("다시 입력하세요.");	
			eng = scan.nextInt();
		}
		System.out.println("수학 점수를 입력하세요");
		int math = scan.nextInt();
		while ( !(between(math)) ) {
			System.out.println("다시 입력하세요.");	
			math = scan.nextInt();
		}
		
		int totalsum = point(kor, eng, math);
		int arg = doaverage(kor, eng, math);
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점\n", kor, eng, math);
		System.out.printf("각 점수의 합 : %d점\n", totalsum);
		System.out.printf("3개 과목의 평균점수 : %d점\n", arg);
		
		// Scanner scan = new Scanner(System.in);
		// System.out.print("1 ~ 100 사이 정수 입력 t/f 확인: ");
		// int usernum = scan.nextInt();
		// System.out.println(between(usernum));
	}
}