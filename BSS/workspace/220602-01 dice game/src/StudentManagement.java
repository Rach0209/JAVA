import java.util.*;
// 학생(이름, 국영수) 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보도 볼 수 있는 프로그램.
// 자유롭게
// 주석달아서 설명 달기 (다음에 달게요)

public class StudentManagement { // 메인 class 생성
	public static void main(String[] args) {
		System.out.println("--------------------------");
		Student2 student1 = new Student2(); // 학생 1 생성
		student1.makeStudent2(); // 학생 생성 - 정보 입력하는 메소드 호출
		
		System.out.println("--------------------------");
		Student2 student2 = new Student2(); // 학생 2 생성
		student2.makeStudent2(); // 학생 생성 - 정보 입력하는 메소드 호출
		
		System.out.println("--------------------------");
		Student2 student3 = new Student2(); // 학생 3 생성
		student3.makeStudent2(); // 학생 생성 - 정보 입력하는 메소드 호출
		
		System.out.println("--------입력 확인쩜~-------");
		student1.printState(); // 입력한 정보 확인하는 메소드 호출
		System.out.println("--------------------------");
		student2.printState(); // 입력한 정보 확인하는 메소드 호출
		System.out.println("--------------------------");
		student3.printState(); // 입력한 정보 확인하는 메소드 호출
		System.out.println("--------------------------");
		
		StClass Class = new StClass(student1, student2, student3);
		Class.studentNames(); // 등록된 학생들의 이름
		
		// 학생자체 참조하여 학생이름 불러오기.
//		System.out.println(Class.getStudent1().getName());
//		System.out.println(Class.getStudent2().getName());
//		System.out.println(Class.getStudent3().getName());
		
		System.out.println("--------------------------");
		System.out.println("학생들의 총 평균(반 평균) : " + Class.allStudentAverage() + "점"); // 학생들의 총 평균
		System.out.println("--------------------------");
		Class.whoIsTop(); // 1등 판별 메소드 호출
		System.out.println();
		Class.information(); // 1등 학생에 대한 정보창 호출
		
		
	}
}
