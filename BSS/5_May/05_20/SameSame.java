// 사용자 나이와 이름을 입력받아서 자기랑 같으면 true 출력하기



import java.util.Scanner;

public class SameSame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 방법 1 
		System.out.print("나이와 이름을 입력하세요 : ");
		String line = scan.nextLine();
		
		String my = "28세 백승석";
		// 나이 옆에 글자 "세" 도 넣어야 T가됨.
		System.out.println(line.equals(my));
		// 방법 2 ; 나이 , 이름 따로 T/F;
		System.out.print("나이를 입력하세요 : ");
		String age = scan.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		String myage = "" + 28;
		String myname = "백승석";
		
		System.out.println("나이 " + age.equals(myage) + " 이름 " + name.equals(myname));
		
		// 방법 3 나이 이름 따로 입력, 둘다 맞음 T 아님 F
		System.out.print("나이를 입력하세요 : ");
		int ag = scan.nextInt();
		System.out.print("이름을 입력하세요 : ");
		scan.nextLine(); // 이걸 입력 하지 않으면 숫자 부분입력 뒤에 \n 가 남아있음;
						 // nextLine()은 엔터를 입력(구분자)으로 보기때문에 빈 문자열로 인식해 바로 결과값이 출력
		String nam = scan.nextLine();
		
		System.out.println((ag == 28) && nam.equals("백승석"));
	}
}