import java.util.*;

public class StClass {
	Scanner scan = new Scanner(System.in);
	private Student2 student1;
	private Student2 student2;
	private Student2 student3;

	public StClass(Student2 student1, Student2 student2, Student2 student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	public void studentName() {
		System.out.println(
				"등록한 학생들의 이름'" + student1.getName() + "' '" + student2.getName() + "' '" + student3.getName() + "'");
	}

	public int allStudentAverage() {
		return (student1.getSum() + student2.getSum() + student3.getSum()) / 3;
	}

	public Student2 whoIsTop() {
		Student2 top;
		if (student1.getAverage() >= student2.getAverage() && student1.getAverage() >= student3.getAverage()) {
			top = student1;
		} else if (student2.getAverage() >= student3.getAverage()) {
			top = student2;
		} else {
			top = student3;
		}
		return top;
	}

	boolean between(int num) {
		if (num >= 1 && num < 6 || num == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void information() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"1등 학생의 정보 검색창 원하는 정보 버튼 입력 \n 1번 : 모든 정보, 2번 : 이름, 3번 : 과목별 점수, 4번 : 평균점수 , 0번 : 알고 싶지않음! 종료할거임.(숫자 하나만 입력)\n");
		int num = scan.nextInt();
		while (!(between(num))) {
				System.out.println("똑.바.로 입력 하십시오 휴먼.");
				num = scan.nextInt();
		}
		if (num == 1) {
			System.out.printf("이름 : %s, 국어점수 : %s, 영어점수 : %s, 수학점수 : %s, 평균점수 : %s\n", whoIsTop().getName(),
					whoIsTop().getKor(), whoIsTop().getEng(), whoIsTop().getMath(), whoIsTop().getAverage());
		} else if (num == 2) {
			System.out.printf("이름 : %s", whoIsTop().getName());
		} else if (num == 3) {
			System.out.printf("국어점수 : %s, 영어점수 : %s, 수학점수 : %s\n", whoIsTop().getKor(), whoIsTop().getEng(),
					whoIsTop().getMath());
		} else if (num == 4) {
			System.out.printf("평균점수: %s\n", whoIsTop().getAverage());
		} else if (num == 0) {
			System.out.println("그렇구나 종료한다.");
		}
	}
}
