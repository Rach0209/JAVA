public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
		
		int[][] arr2d = new int[3][5];
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for (int j = 0; j < arr2d.length; j++) {
			for (int i = 0; i < arr2d[j].length; i++) {
				System.out.println(arr2d[j][i]);
			}
		}
		
//		int[][] arrAnother = { { 2, 4, 6 }, { 3, 6, 9 }, { 4, 8, 12 } };
//		for (int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}
	}
}
