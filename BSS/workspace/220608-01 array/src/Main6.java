public class Main6 {
	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
	}
}
	
//	public static void someMethod(double d, int... arr) { // 가변길이 파라미터; ... ; 점3개 // 하나의 이름으로 값을 여러개 전달 받고자 할 때, (0개든 여러개든 가능) 
//									// 가변길이 파라미터는 마지막에 적기.
//									// double d 추가했을 때, 40은 double d의 값으로, 나머지는 int... arr배열(가변길이)로 들어감.
//		for (int number : arr) {
//			System.out.println(number);
//		}
//	}
	
//	public static void someMethod(int[] arr) {
//		for (int number : arr) {
//			System.out.println(number);
//		}
//	}
	
	
	
	
//	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
//		
//		// 가변길이 파라미터를 사용하면, 컴파일 에러없이 실행 가능.
//		someMethod(40, 50, 60, 70, 80); // 쉼표 구분하여 여러개를 전달 -> 자동으로 배열을 생성.
		
//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 }); // 1회용
//		System.out.println("---");
//		someMethod({ 11, 22, 33}); // 불가; 배열의 선언과 초기화 할때 가능한 표현임
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");
		
		
		
		// index에 대한 고민 해결; - 배열 말고 다른 곳에서도 활용 가능~ 
		// index없이 순환 (for each문); ----  ; 세미콜론 이 아닌 --- : 콜론사용
		// 배열의 길이 만큼 하나씩 int값을 가져오는 것의 반복출력.
		// 처음부터 끝까지 값을 확인하는데에 유용.
//		for (int number : arr) {
////			arr[0] = 50;
////			arr[1] = 50;
////			arr[2] = 50;
////			arr[3] = 50;// 값을 수정하는 용도로는 쓰지 않음. 확인 하는 용도로만
//			System.out.println(number);
//		}
//	}
//}
