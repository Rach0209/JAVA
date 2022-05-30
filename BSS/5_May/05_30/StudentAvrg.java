import java.util.*;

public class StudentAvrg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		System.out.println("이름 머?");
		String name = scan.nextLine();
		System.out.println("국어 점수?");
		int kor = scan.nextInt();
		System.out.println("영어 점수?");
		int eng = scan.nextInt();
		System.out.println("수학 점수?");
		int math = scan.nextInt();
		
		st.setName(name);
		st.setKor(kor);
		st.setEng(eng);
		st.setMath(math);
		st.printAll();
		
		
		// System.out.println(st.kor);
		// System.out.println(st.eng);
		// System.out.println(st.math);
		// System.out.println(st.sum);
		// System.out.println(st.avrg);
		
	}
}