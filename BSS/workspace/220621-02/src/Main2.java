import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생입니다)

// 홍길동 15
// 둘리 222
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요.

// 학생 클래스 만들기
class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int score;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 15, 90);
		Student s2 = new Student("둘리", 222, 80); 
		Student s3 = new Student("도우너", 33, 95); 
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		// 이름 나이가 같으면 동일인물이라 equals를 재정의 해놓아서 찾을 수 있음
		int index = list.indexOf(new Student("도우너", 33, 0));
		System.out.println("도우너의 index number : " + index);
		
		// 정렬 ?
		// 내가 만든 list => 학생이 기준. 대소비교 기준이 없기 때문에 불가능하다.
		// 기준을 잡아주면 가능~ 점수를 기준.
		Collections.sort(list);
		// 기본은 오름차순. => 내림차순으로 (점수 high -> low) 정렬
		Collections.reverse(list);
		System.out.println(list);
		
		// 다른 기준인 나이로 정렬하고 싶다!
		// 파라미터에 바로 넣기 = 일회용 사용
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
		
		// 익명 클래스이며 지역으로 존재, Comparator로 정렬 나이순
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		// 나이 오름차순 정렬
		Collections.sort(list, comparator);
		System.out.println(list);
	}

}
