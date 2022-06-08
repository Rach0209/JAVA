import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };

		
		
		// 같은 원소값으로 변경하는 메소드;
		Arrays.fill(arr, 100);
		
		System.out.println(Arrays.toString(arr));
		
//		int[] temp = { 40, 50, 60 };
//		int[] copy = Arrays.copyOf(arr,  arr.length);
//		
//		// 범위 지정 하는 메소드 (시작점 설정 가능). ---- (x, y, z) x:배열이름, y:시작점, z:가져올개수
//		int[] another = Arrays.copyOfRange(temp, 2, temp.length);
//		System.out.println(Arrays.toString(another));
//		
		
//		System.out.println(Arrays.toString(copy));
//		// 길이와 원소값을 비교, t/f 결과 equals.
//		System.out.println(Arrays.equals(arr, new int[] {33, 44, 55})); 
	}
}
