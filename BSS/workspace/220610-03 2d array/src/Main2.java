import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32...
		// 3 9 27 81...
		// 4 16 64 256...
		// 5 25 125 725...
		int[][] arr1 = {  { 2, 4,    8,  16, 32 }
						, { 3, 9,   27,  81, 243 }
						, { 4, 16,  64, 256, 1024 }
						, { 5, 25, 125, 625, 3125 } };
	
		int[][] arr2 = new int[4][5]; // 제곱수 구하기
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for (int j = 0; j < arr2[i].length; j++) {
				n *= 2 + i;
				arr2[i][j] = n;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
		System.out.println(arr1[i][j]);
			}
		}
		// Arrays.toString은 이상한 형태로 출력. 참조값이라서
		// 다중 차원 배열은 deepToString으로 출력 가능.
		System.out.println(Arrays.deepToString(arr1)); 
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(arr1 == arr2); // => 인스턴스가 같은지 물어보는 것 // 원소값이 같아도, 참조 값이라 다르다고 판단.
		System.out.println(Arrays.equals(arr1, arr2)); // 똑같이 다른 참조 값이라 판단해서 false // 1차원 일 때 확인 가능
		System.out.println(Arrays.deepEquals(arr2, arr2));	// 다차원 일 때 확인방법

	}
}
