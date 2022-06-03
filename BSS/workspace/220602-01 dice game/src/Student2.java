import java.util.Scanner;

public class Student2 {
	// 학생 기본 정보 입력 변수 설정
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student2() {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 사용자에게 입력 받아서 기본정보 입력하기
	// 한번에 정보를 입력받는 메소드 생성 (setter 모으기)
	Scanner scan = new Scanner(System.in);
	public void makeStudent2() {
		setName();
		setKor();
		setEng();
		setMath();
	}
	// getter/setter 생성
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("----학생 이름 입력----");
		name = scan.nextLine();
	}
	public int getKor() {
		return kor;
	}
	public void setKor() {
		System.out.println("----국어 점수 입력----");
		kor = scan.nextInt();
	}
	public int getEng() {
		return eng;
	}
	public void setEng() {
		System.out.println("----영어 점수 입력----");
		eng = scan.nextInt();
	}
	public int getMath() {
		return math;
	}
	public void setMath() {
		System.out.println("----수학 점수 입력----");
		math = scan.nextInt();
	}
	// 합계 구하는 메소드
	public int getSum() {
		return (kor + eng + math);
	}
	// 평균 구하는 메소드
	public int getAverage() {
		return (getSum() / 3);
	}
	// 입력 받은 기본정보 상태 출력 메소드 - 이름, 점수, 평균
	public void printState() {
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("평균 점수 : " + getAverage());
	}
	
	
	// 선생님 사용
	// 불련으로 비교해보기
//	public boolean compare(Student2 other) {
//		return this.getAverage() >= other.getAverage();
//	}
	
}
