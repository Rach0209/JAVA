// 1.					4.
// *					     *  
// **					    ***
// ***					   *****
// ****				      *******
// *****				 *********

// 2.					5.
// *****				 *********
// ****				      *******
// ***					   *****
// **						***
// *					     *

// 3.					6. 사용자 입력
    // *				7. 2 ~ 100 사이의 모든 소수 출력하기
   // **
  // ***
 // ****
// *****				/// 콘솔창 폰트 차이 때문에 공백은 두칸으로 설정함

public class Star3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // 줄 반복
			// System.out.print("줄반복");
			for (int j = 5; j >= i; j--) { // 공백 반복 줄어들기
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) { // 별 반복 늘어나기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
