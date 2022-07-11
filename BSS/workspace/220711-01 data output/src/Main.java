import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
// 직렬화 시켜줌 Serializable 인터페이스 구현/// ObjectOutputStream을 위해
class Student implements Serializable {
	private String name;
	private int age;
	private transient double score; // transient는 직렬화 대상에서 제외시키는 키워드.

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		// 학생
		// 이름: 문자열
		// 나이: 정수
		// 학점: 실수

		// 파싱 parsing

		BufferedReader br = null;
		List<Student> list = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\students.txt")));

			while (true) {
				String name = br.readLine();
				int age = Integer.valueOf(br.readLine());
				double score = Double.valueOf(br.readLine());

				Student s = new Student(name, age, score);
				list.add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(list);

//		List<Student> list = new ArrayList<>(
//				Arrays.asList(new Student("홍길동", 22, 2.5), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4)));
//		// 자바 객체를 파일로 나타낼 때.
//		// 데이터 서식을 생각해주어야함. (데이터 포맷)
//		// 하나하나의 모습이 동일한 모습을 가져야함.
//		// => 학생을 하나의 문자열로 표현 => 구분자(CSV)가 필요함. ('공백', ',' 등등)
//		
//		PrintWriter pw = null;
//		
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\students.txt"));
//			
//			for (int i = 0; i < list.size(); i++) {
//				Student s = list.get(i);
//				
//				pw.println(s.getName());
//				pw.println(s.getAge());
//				pw.println(s.getScore());
//			}
//			pw.flush(); // 버퍼의 내용을 확인상 모두 출력하고자 호출해줌 // PrintWriter는 버퍼공간을 가지고있기 때문 (버퍼공간이 언제 가득찰지 모름 => flush로 비워줌)
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}

	}
}
