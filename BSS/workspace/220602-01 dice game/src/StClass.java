import java.util.*;

public class StClass { // 학생 정보를 담고있는 Student2클래스를 참조 시키는 클래스 생성.
	Scanner scan = new Scanner(System.in);
	private Student2 student1; // 학생 정보 참조해서 불러오기
	private Student2 student2;
	private Student2 student3;
	
	// 기본 생성자; 학생 3명의 참조값이 없을 때를 대비 - 초기화값을 만들어놓기.
	// *******학급에 학생이없어도 학급을 호출할 수 있게.*********
	public StClass() {} 
	
	// 학급 생성 - 구성원을 참조된 학생 3명으로 설정
	public StClass(Student2 student1, Student2 student2, Student2 student3) {
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

	
	// getter/setter : 학생 자체를 참조시킬 수 있게.
	public Student2 getStudent1() {
		return student1;
	}

	public void setStudent1(Student2 student1) {
		this.student1 = student1;
	}

	public Student2 getStudent2() {
		return student2;
	}

	public void setStudent2(Student2 student2) {
		this.student2 = student2;
	}

	public Student2 getStudent3() {
		return student3;
	}

	public void setStudent3(Student2 student3) {
		this.student3 = student3;
	}

	// 학생의 이름 호출
	public void studentNames() {
		System.out.println(
				"등록한 학생들의 이름 '" + student1.getName() + "' '" + student2.getName() + "' '" + student3.getName() + "'");
	}

	// 학생들의 총 평균
	public int allStudentAverage() {
		return (student1.getAverage() + student2.getAverage() + student3.getAverage()) / 3;
	}

	// 학생들 중 1등을 구별하는 메소드 (모두 동점일 경우 학생등록 순서중 앞순서 학생이 나옴)
//	private int max;
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
		
		
		// 1등 구하기 여러가지 방법.
		
		// max 사용한 삼항연산자로 구하는 방법 대충적어놓은것;
//		max = student1.getAverage() >= student2.getAverage() ? student1.getAverage() : student2.getAverage();
//		max = max >= student3.getAverage() ? max : student3.getAverage();
//		if (max == student1.getAverage()) {
//			return student1;
//		}
	
	// **********  선생님의 사용법1  ************
//	public Student2 getTop() {
//		return max(max(student1, student2), student3);
//	}
//	
	
	// **********  선생님의 사용법2  ************
//	public Student2 max(Student2 left, Student2 right) {
//		if (left.getAverage() >= right.getAverage()) {
//			return left;
//		} else {
//			return right;
//		}
//	}

	// **********  선생님의 사용법3  ************
	// Student2 클래스에서 메소드 추가.
//	public Student2 getTop() {
//		if (student1.compare(student2) && student1.compare(student3)) {
//			return student;
//		} else if (student2.compare(student1) && student2.compare(student3)) {
//			return student2;
//	} else if (student3.compare(student1) && student3.compare(student3)) {
//			return student3;
//	}
	
	
	
	
	// 잘못 입력한 번호를 반복문으로 명령 재실행하기위한 메소드.
	boolean between(int num) {
		if (num >= 1 && num < 5 || num == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 학생 정보 호출하는 메소드. 번호를 입력 받아서 원하는 정보 출력하기.
	public void information() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"------1등 학생의 정보 검색창------\n--원하는 정보를 보려면 버튼 입력--\n<1>번 : 모든 정보, <2>번 : 이름, <3>번 : 과목별 점수, <4>번 : 평균점수 , <0>번 : 알고 싶지않음! 종료할거임.(숫자 하나만 입력)");
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
