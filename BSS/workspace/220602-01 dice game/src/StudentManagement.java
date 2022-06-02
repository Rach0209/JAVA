import java.util.*;
// 학생(이름, 국영수) 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보도 볼 수 있는 프로그램.
// 자유롭게
// 주석달아서 설명 달기 (다음에 달게요)

public class StudentManagement {
	public static void main(String[] args) {
		System.out.println("--------------------------");
		Student2 student1 = new Student2();
		student1.makeStudent2();
		
		System.out.println("--------------------------");
		Student2 student2 = new Student2();
		student2.makeStudent2();
		
		System.out.println("--------------------------");
		Student2 student3 = new Student2();
		student3.makeStudent2();
		
		System.out.println("--------입력 확인쩜~-------");
		student1.printState();
		System.out.println("--------------------------");
		student2.printState();
		System.out.println("--------------------------");
		student3.printState();
		System.out.println("--------------------------");
		
		StClass Class = new StClass(student1, student2, student3);
		Class.whoIsTop();
		Class.information();
	}
}
