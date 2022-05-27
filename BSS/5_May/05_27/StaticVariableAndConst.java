public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		i++;
		
		final int ASDF;
		ASDF = 10;  // 변하는 것 같아 보이지만, 최초의 대입연산인 초기화.
		// ASDF = 15;// 초기화 부분은 컴파일 에러가 나지 않음. 그 이후는 에러
		
		
		
		final int MY_NUMBER = 22; // 상수 선언은 똑같음.. but 변할 수 없는 수.
		// MY_NUMBER++; // 값 변화 => 컴파일 에러. // 변해서는 안되는 수를 표현 할 때.
		
		final double PI = 3.14; // 하나의 약속으로 만들어버림.
		System.out.println(5 * 5 * PI);
	}
}