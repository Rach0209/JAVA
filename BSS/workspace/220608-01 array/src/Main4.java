import java.util.Arrays;

public class Main4 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	public static void justPlusArrays(int[] arr1, int[] arr2) {
		int totalLength = arr1.length + arr2.length;
		int[] plus = new int[totalLength];
		for (int i = 0; i < arr1.length; i++) {
			plus[i] = arr1[i];
		}
		int j = totalLength - arr2.length;
		for (int i = 0; i < arr2.length; i++) {
			plus[j] = arr2[i];
			j++;
		}
		System.out.println(Arrays.toString(plus));
	}

	
	// 쌤.
	public static int[] concatArray(int[] left, int[] right) {
		int[] newArray = copy(left, right.length);
		
		for (int i = left.length; i < newArray.length; i++) {
			newArray[i] += right[i - left.length];
		}
		return newArray;
	}
	
	
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [ 11, 13, 15, 13, 14]
	public static int[] sumArray(int[] left, int[] right) {
//			if (left.length > right.length ) {
//				int[] copy = copy(left, 0);
//				for (int i = 0; i < right.length; i++) {
//					copy[i] += right[i];
//				}
//				return copy;
//			} else {
//				int[] copy = copy(right, 0);
//				for (int i = 0; i <left.length; i++) {
//					copy[i] += left[i];
//				}
//				return copy;
//			}
			
			int[] copy;
			int[] target;
		
//		copy = left.length > right.length ? copy(left, 0) : copy(right, 0);
		
			if (left.length > right.length) {
				copy = copy(left, 0);
				target = right;
			} else {
				copy = copy(right, 0);
				target = left;
			}
				
			for (int i = 0; i < target.length; i++) {
				copy[i] += target[i];
			}
			return copy;
		}
	
	// 샘 ; copy 메소드 하나 만듬 먼저.
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
	}
	// 쌤거.
	
	


	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr2 = { 10, 11, 12, 13, 14 };

//		justPlusArrays(arr, arr2);
		// concatArray = 썜, justPlusArrays = 나; 
		System.out.println(Arrays.toString(concatArray(arr, arr2)));
		System.out.println(Arrays.toString(sumArray(arr, arr2)));

//		int[] larger = new int[arr.length + 2];
//		for (int i = 0; i < arr.length; i++) {
//			larger[i] = arr[i];
//		}
//		
//		System.out.println(Arrays.toString(larger));

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	}
}
