// page 264
// 4번
// 5번
// 6번
// 7번

// 7번문제
// JAVA 에서는 0부터 시작하는 숫자는 8진수로 이해. ; ex) 학번 091010이면 이상한 수로 출력. -> 문자열로 표기
package question7;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("샌액이", 22010101, "경제학과", 1, 17);
		System.out.println(s.toString());
		System.out.println();
		
		UnderGraduate underGraduate = new UnderGraduate("백돌이", 22001234, "음악학과", 3, 19, "아싸휴게소");
		System.out.println(underGraduate.toString());
		System.out.println();
		
		Graduate graduate = new Graduate("이노예", 14001234, "신재생 에너지과", 2, 8, "연구 조교", 0.65);
		System.out.println(graduate.toString());
	}
}
