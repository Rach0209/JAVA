public class MulDiv {
  public static void main(String[] args) {
		System.out.println(123 - 12);
	  
        // System.out.println("ABC" / 5);
        // System.out.println(50 / 0); 0으로 나눌 수 없어서 에러 => 밑의 결과값마저 나오지 않음. 프로그램의 흐름이 종료.

        System.out.println("10 곱하기 5는 " + (10 * 5));
        System.out.println("22 나누기 4는 " + (22 / 4)); //기본적으로 정수값만 나옴.
        System.out.println("22 나누기 4는 " + (22.0 / 4.0));

        System.out.println("프로그램 정상 종료");
    }
}