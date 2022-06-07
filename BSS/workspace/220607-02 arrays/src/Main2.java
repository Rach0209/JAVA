public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수(int)형 배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해보세요.
		int[] aBox = new int[5];
		// 0부터 시작, aBox[5]를 만들면 컴파일 에러는 나지않음, 실행 시 오류
		
		// 배열과 반복문은 짝이다.! 기억하기
		for (int i = 0; i < aBox.length; i++) {
			aBox[i] = 100;
		}
		
//		int idx = 0;
//		aBox[idx] = 100; 
//		idx++;
//		aBox[idx] = 100;
//		idx++;
//		aBox[idx] = 100;
//		idx++;
//		aBox[idx] = 100;
//		idx++;
//		aBox[idx] = 100;
		
		for (int i = 0; i < aBox.length; i++) {
			System.out.println(i + "번째 index의 원소값: " + aBox[i]);
		}
		
		System.out.println("프로그램 종료.");
	}
}
