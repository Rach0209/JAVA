// 학생
// 이름
// 나이
// 점수

// 이름 알려주기
// 점수 알려주기

	// 사람 => 학생, 작가, 회사원, 개발자 등등의 공통사항 - 이름, 나이
	// 동일 특성을 가진 상하계층 관계의 상태가 존재.
	// 동일한 코드가 각각의 클래스에 매번 존재하게 되는 문제 발생 => 중복;
	// 객체 지향에서;상위 계층인 사람 이라는 특성을 미리 정해놓고 아래의 클래스에 그대로 적용시키는 기법
	// => '상속' 구조 ; 중복성을 낮춘다.	

// 작가
// 이름		// field
// 나이		// field
// 작품 목록	// field

// 이름 알려주기		// method
// 작품 목록 알려주기	// method

public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
//		p.getScore(); // 호출 불가능  : 사람의 특징 ㄴ //
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
		
	}

}
