// 1.					4.
// *					     *  		공백 4 별 1
// **					    ***				3 	3
// ***					   *****			2	5
// ****				      *******			1	7
// *****				 *********			0	9

// 2.					5.
// *****				 *********		공백 0 별 9
// ****				      *******			1	7
// ***					   *****			2	5
// **						***				3	3
// *					     *				4	1

// 3.					6. 사용자 입력
    // *				7. 2 ~ 100 사이의 모든 소수 출력하기
   // **
  // ***
 // ****
// *****				/// 콘솔창 폰트 차이 때문에 공백은 두칸으로 설정함

// 6. 사용자 입력
// 피라미드 모양 (4번모양)
import java.util.*;

public class Star6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("높이 몇인 피라미드를 만들 것이냐");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) { // 줄 반복
			for (int j = num; j >= i; j--) { // 공백 반복 줄어들기
				System.out.print("  ");
			}
			for (int k = 1; k <= i*2-1; k++) { //별 반복 늘어나기
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈
		}
		
		System.out.println("집가서 더만들기 오늘 말고 ㅋ");
	}
}