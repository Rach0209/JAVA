
public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블록 안");
			
			System.out.println("문장1");
			
			Object o = new Object();
			String s = (String) o;
			// Object 가 String 이던지; instanceof 사용해서 확인 후 다운캐스팅해야 오류가 나지 않음.
			
			System.out.println("문장2");
			
			System.out.println("문장3");
		} catch (Exception e) {
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage());
			e.printStackTrace(); // 오류 확인
		} finally { // 예외의 발생 유무에 상관없이 **무조건** 실행된다. 
			// catch에서 예외값을 잘못 넣어, 예외를 못잡더라도 finally는 실행됨
			// catch가 없이 finally만 가능
			System.out.println("finally 블록 안");
		}
		
		System.out.println("정상 종료");
	}
}
