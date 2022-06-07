public class Main {
	public static void main(String[] args) {
		// 배열; 하나의 이름으로 여러개를 사용 가능.
		int[] aBox; // 정수형 배열 변수 선언. 
//		aBox = 10; //정수를 여러개 담는 타입, 정수 하나가 아님
		aBox = new int[4]; // 길이가 4인 배열 초기화
		
		System.out.println("배열의 길이값: " + aBox.length);
//		aBox.length = 10; // final 형태의 상수로 되어있어서 값의 변경이 불가능하다.
		
		aBox[0] = 56;
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}
}
