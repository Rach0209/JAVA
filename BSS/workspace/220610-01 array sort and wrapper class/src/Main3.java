// boxing 에 대해 설명

public class Main3 {

	public static void main(String[] args) {
		int number1 = 10; // 원시형 타입 => 메소드 존재 하지 않음. 자체 값만 가짐.
//		number1. // 메소드 나오지 않음.

		// number1 과 refNubmer는 같은 값을 가진 것 같지만, 엄밀히는 다르다.
		Integer refNumber = Integer.valueOf(10); // 참조는 하나라서 refNumber 값으로 하나만 받을 수 있다.
//		refNumber. // 메소드 나옴; 행동이 나옴 => 객체임.
		System.out.println(refNumber.compareTo(20)); // 비교 결과값 같으면 0, 다르면 -1 출력;
		
	}
}
