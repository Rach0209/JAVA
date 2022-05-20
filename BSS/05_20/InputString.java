// 문자열 입력 받기
import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		// 문자열을 입력 받는 nextLine(); 한줄을 입력 받을 수 있다
		System.out.println("한 줄을 입력하세요");
		scan.nextLine(); // 호출 해줘서 int 입력 후 enter공간을 새로 입력할 수 있게 바꿔줌
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}