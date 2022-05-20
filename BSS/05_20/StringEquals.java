// 문자열의 동등함 비교 -----equals()-----\ 관계 연산자로는 동등함 비교 불가능
public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		// String 은 참조형이기 때문에 값의 확인이 아닌
		// 참조의 대상이 같은지 확인한다;
		System.out.println(a == b);
		
		// 참조의 대상이 다르기 때문에 false 출력
		System.out.println(a == ("He" + llo));
		
		// method 사용
		// 비교대상.equals()
		System.out.println("------- 문자열 값 동등 확인 --------");
		// 여러개 한번에 x, 비교할 대상 하나만 가능
		// 값이 완벽하게 같을 때 true / 나머지는 false
		System.out.println(a.equals("He" + llo));
	}
}