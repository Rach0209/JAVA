import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드~
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	// boolean 값으로 배열 자체를 비교하면 참조대상이 다르기 때문에 항상 false값이 return된다.
	public static boolean sameArray(int[] origin, int[] compare) {
		if (origin.length != compare.length) {
			return false;
		}
		
		for (int i = 0; i < origin.length; i++) {
			if (origin[i] != compare[i]) {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[] args) {
		int[] test = { 50, 70, 90, 110 };
//		int[] c = copyArray(test);
//		System.out.println(Arrays.toString(c)); // 자바 기본 유틸 임포트; 문자열로 반환해주는것
		
		int[] test2 = { 50, 70, 90, 10 };
		boolean result = sameArray(test,test2);
		if (result == true) {
			System.out.println("두 배열이 같음.");
			System.out.println("원소 값 : " + Arrays.toString(test));
			System.out.println("길이 : " + test.length);
		} else {
			System.out.println("두 배열이 다름.");
			System.out.println("기본 값의 원소 : " + Arrays.toString(test));
			System.out.println("비교 값의 원소 : " + Arrays.toString(test2));
			System.out.println("기본 값의 길이 : " + test.length);
			System.out.println("비교 값의 길이 : " + test2.length);
		}

		
	}
}
