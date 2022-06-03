import java.util.*;

public class StClass { // 학생 정보를 담고있는 Student2클래스를 참조 시키는 클래스 생성.
	Scanner scan = new Scanner(System.in);
	private Student2 student1; // 학생 정보 참조해서 불러오기
	private Student2 student2;
	private Student2 student3;

	// 학급 생성 - 구성원을 참조된 학생 3명으로 설정
	public StClass(Student2 student1, Student2 student2, Student2 student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	// 학생의 이름 호출
	public void studentName() {
		System.out.println(
				"등록한 학생들의 이름 '" + student1.getName() + "' '" + student2.getName() + "' '" + student3.getName() + "'");
	}

	// 학생들의 총 평균
	public int allStudentAverage() {
		return (student1.getAverage() + student2.getAverage() + student3.getAverage()) / 3;
	}

	// 학생들 중 1등을 구별하는 메소드 (모두 동점일 경우 학생등록 순서중 앞순서 학생이 나옴)
	public Student2 whoIsTop() {
		Student2 top; // return값을 받기위해
		if (student1.getAverage() >= student2.getAverage() && student1.getAverage() >= student3.getAverage()) {
			top = student1; // 1번 학생의 평균은 2번보다 크거나 같고, 3번보다 크거나 같다
		} else if (student2.getAverage() >= student3.getAverage()) {
			top = student2; // 그것이 아니면 2번학생이 3번학생보다 크거나 같다.
		} else {
			top = student3; // 그것도 아니면 3번학생이 젤 크거나 같을 경우. 3가지중 하나.
		}
		return top;
	}

	// 잘못 입력한 번호를 반복문으로 명령 재실행하기위한 메소드.
	boolean between(int num) {
		if (num >= 1 && num < 6 || num == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 학생 정보 호출하는 메소드. 번호를 입력 받아서 원하는 정보 출력하기.
	public void information() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"1등 학생의 정보 검색창 원하는 정보 버튼 입력 \n<1>번 : 모든 정보, <2>번 : 이름, <3>번 : 과목별 점수, <4>번 : 평균점수 , <0>번 : 알고 싶지않음! 종료할거임.(숫자 하나만 입력)\n");
		int num = scan.nextInt();
		// 반복문 사용 - 앞의 올바른 번호 입력일때만 작동하는 메소드이용.
		while (!(between(num))) {
			System.out.println("똑.바.로 입력 하십시오 휴먼.");
			num = scan.nextInt();
		}
		// 원하는 번호일때만 작동.
		if (num == 1) {
			System.out.printf("이름 : %s, 국어점수 : %s, 영어점수 : %s, 수학점수 : %s, 평균점수 : %s\n", whoIsTop().getName(),
					whoIsTop().getKor(), whoIsTop().getEng(), whoIsTop().getMath(), whoIsTop().getAverage());
		} else if (num == 2) {
			System.out.printf("이름 : %s\n", whoIsTop().getName());
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
