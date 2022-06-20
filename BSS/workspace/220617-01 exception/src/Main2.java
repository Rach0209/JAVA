
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";

			int[] arr = new int[0];
			arr[0] = 10;
			arr[1] = 10;

			int div = 10 / 0;

			s.equals("asdf");

			System.out.println("실행 되나? ㅋ 안됨ㅋ 날 건너띄고 가라고");
		} catch (NullPointerException e) {
//			System.out.println(local); // 지역 변수 접근 불가
			System.out.println("널 포인트 익셉션 처리");
		} catch (ArithmeticException e) {
			System.out.println("산수 익셉션 처리 - 0으로 나눌 순 없지");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) {
			System.out.println("모든 예외는 여기서 잡힙니다.");
		}
//		System.out.println(local); // 블록{}바깥 ; 당연히 불가
		// 상단에 Exception 클래스 - 상속 구조 -
		// NullPointerException 같은것들은 서브 클래스(자식)임.
		// catch 의 순서에 유의하기
		// 슈퍼 클래스인 Exception을 catch문의 위에 적으면, 밑에 있는 예외들은 자식이기 때문에
		// 도달할 수 없게 되어 컴파일에러가 발생한다.
		
//		try catch를 적지 않아도 보이는 예외들은 un-checked 라고 부른다.
		System.out.println("정상 종료");
	}
}
