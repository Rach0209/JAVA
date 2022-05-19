public class TestRange {
	public static void main(String[] args) {
		// 0 ~ 100 사이??
		
		// 숫자가 0이상 '이고' 100이하 인가?
		int number = 33;

		// 한번에 하나씩만 가능하다 - 왼쪽이 먼저 계산
		// System.out.println(0 <= number);
		// System.out.println(number <= 100);
		// 두번 물어봐야 함 대신 값이 두개
		
		System.out.println(0 <= number && number<= 100);
	}
}