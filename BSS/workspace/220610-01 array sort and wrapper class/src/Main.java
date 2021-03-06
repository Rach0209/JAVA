import java.util.Arrays;

// Arrays.sort 배열 정렬;
public class Main {
	public static void insertionSort(int[] arr) {	// 삽입 정렬 ; 왼쪽부터 중간중간에 값을 집어넣어서 정렬
		for (int index = 1; index < arr.length; index++) {
			int temp = arr[index];
			int aux = index - 1;

			while ((aux >= 0) && (arr[aux] > temp)) {

				arr[aux + 1] = arr[aux];
				aux--;
			}
			arr[aux + 1] = temp;
		}
	}

	public static void main(String[] args) {
//
//		Book[] book = new Book[3];
//		book[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
//		book[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
//		book[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
//		
//		Arrays.sort(book); // 값 5개중 어떤 것으로 정렬할지 정렬의 기준이 없기때문에 실행 중 에러발생.
//		
		
		
//		정렬 - 필요한 자료의 순서대로 알고리즘을 사용하여 정렬해줄 수 있음
		// 검색을 쉽게 해줄 수 있게 해준다.
		int[] arr = { 50, 30, 20, 60, 10 };
//		insertionSort(arr);
		Arrays.sort(arr); // => quick sort
		// 이진 검색법  - 절반씩 나누어 원하는 값 요소를 찾아 간다. // 배열의 원소값이 고유해야한다 = 겹치는 값이 없어야 함.
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("20의 인덱스 : " + index); // index는 0부터 시작이기 때문에 두번째인 20은 index값이 1.
		
		System.out.println(Arrays.toString(arr));
//
		
	
	}
}
