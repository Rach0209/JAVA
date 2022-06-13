// page 264
// 4번
// 5번
// 6번
// 7번

// 7번문제

package question7;

public class Main {
	public static void main(String[] args) {
		UnderGraduate underGraduate = new UnderGraduate("백돌이", 22001234, "음악학과", 1, 19, "아싸휴게소");
		System.out.println(underGraduate.toString());
		System.out.println();
		
		Graduate graduate = new Graduate("이노예", 14001234, "신재생 에너지과", 2, 8, "연구 조교", 0.65);
		System.out.println(graduate.toString());
	}
}
