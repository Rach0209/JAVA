import java.util.Scanner;

public class Student2 {
	
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
	
	Scanner scan = new Scanner(System.in);
	public void makeStudent2() {
		setName();
		setKor();
		setEng();
		setMath();
	}
	
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
	public int getSum() {
		return (kor + eng + math);
	}
	public int getAverage() {
		return (getSum() / 3);
	}
	
	public void printState() {
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("평균 점수 : " + getAverage());
	}
	
}
