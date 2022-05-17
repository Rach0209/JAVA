public class Add {
    public static void main(String args[]) {
        // 변수이름
        // 영소문자로 시작 (대소문자 구별)
        // 숫자도 올 수 있음
        // abc12345
        // 공백 x

        // booktitle => bookTitle
        // 특수문자 x 굳이 사용 => -, _ 두가지 가능
        // 의미가 있는 키워드는 사용 불가, 중복 불가

        // int : 정수형 data type (자료형)
        int x; // 변수 선언 (variable declare)
        int y;
        int sum;

        // 초기화 (initialize)
        x = 100; // 대입연산자 (assignment)
        y = 200;
        sum = x + y;

        System.out.println(sum);

        System.out.println(x - y);
        
        int minus;
        minus = x - y;
        System.out.println(minus);
   }
}