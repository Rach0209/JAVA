import java.util.Arrays;

public class Main {	// 2차원 배열. => 배열을 참조하는 배열!
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 }; 
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
										// ------배열들은 같은 길이값(ex;[5])을 가지고 있어야한다!-------
		int[][] arr2d = new int[3][];//([5])// [3]은 배열의 길이. -> arr2d의 index 값 
		arr2d[0] = arr1;				// [5]는 원소 하나하나가 가지는 길이값. -> 각 index가 가지는 원소의 길이 값 // 표처럼 생김
		arr2d[1] = arr2;				// 숫자 하나하나가 배열이다.
		arr2d[2] = arr3;				// 열의 갯수는 [] 빈칸으로 해놓아도 상관없음.
		// 3행을 가진 배열이 생성됨.
		
				
		// 표, 좌표느낌. [행], [열]
//		System.out.println(arr2d[0][0]);
//		System.out.println(arr2d[0][1]);
//		System.out.println(arr2d[0][2]);
		// 배열 하나의 원소 출력.
		for (int i = 0; i < arr2d[0].length; i++) {
			System.out.println(arr2d[0][i]);
		}
		
//		System.out.println();
//		int[][] arrAnother = { { 2, 4, 6 }, { 3, 6, 9 }, { 4, 8, 12 } }; // int[3][3]으로 생성
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}
		
		System.out.println();
		// 모든 원소 출력. 2중 반복문.
		for (int i = 0; i < arr2d.length; i++) { // arr2d.length = 3행;
			for (int j = 0; j < arr2d[i].length; j++) { // arr2d[i]의 열의 갯수 
				System.out.println(arr2d[i][j]);
			}
		}
		
		int[][] arrHello = new int [3][5]; // 길이값을 바꾸는 것은 불가능.
		arrHello[0] = new int[] { 1, 2, 3 }; // 참조값만 바뀜
		System.out.println(Arrays.toString(arrHello[0]));
	}
}
