// 1 ~ 10000까지 출력하세요.
public class Loop1 {
	public static void main(String[] args) {
		// boolean con = true; // 처음부터 값이 false면 while문은 실행되지 않음
		
		int i = 0; // 원하는 갯수만큼 반복 시키기
		// 모양 자체는 if문과 비슷
		while (i < 5) { // i값 5보다 작을 때 출력. 0 ~ 4 5문장
			System.out.println("반복됩니다.");
			i++;
		} // 중괄호 끝을 만나면 다시 조건식으로 검사하러 돌아옴; 루프됨;
		  // false가 되는 순간 중지.
		
		// Hello World 10번 출력하기
		int j = 0;
		while (j < 10) { // false가 되는 순간 중괄호내용을 수행을 하지 않음.
			System.out.println("Hello World");
			System.out.println("j의 값 : " + j);
			j++;
		}
		
		int k = 1;
		while (k <= 10) {
		System.out.println(k);
		k++;
		}
	}
}