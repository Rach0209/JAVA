import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
		String longLine2 = "apple,banana.carrot/donut";
		
		// " " 공백 기준; 공백기준으로 배열 생성.
		// split은 Tokenizer처럼 기준이 여러개가 되지 않음 ",./ " 이면 ",./ "이 하나의 기준이라 인덱스가 0이됨.
		String[] split = longLine.split(" ");
		String[] split2 = longLine2.split(",./ ");
		// index 번째 출력
		System.out.println(split[3]);
		System.out.println(split2[0]);
		
		
		// 만들어져 있는 클래스 사용
		// (longLine, " ") => " " 공백이 있으면 값을 가져옴 / 값이 있든 없든 무조건 가져온다.
		// 값이 더이상 없을 때, 값을 가져오려하면 에러; => 예외적 상황발생;
//		StringTokenizer st = new StringTokenizer(longLine, " ");
//		int i = 0;
//		while (st.hasMoreTokens()) { // hasMoreTokens()로 값이 있는지 미리 확인해준다.
									 // 반복문 사용해서 있으면 가져온다. 눈에 익혀두기
//			i++;
//			String result = st.nextToken();
//			if (i == 3) {
//				System.out.println(result);
//			}
//		}
		
//		// hasMoreTokens() => StringTokenizer(string, "기준"); string 값 안에 입력한 기준값이 있냐 없냐 => boolean 값으로 리턴;
		
//		StringTokenizer st2 = new StringTokenizer(longLine2, "./,");
//		while (st2.hasMoreTokens()) {
//			String local = st2.nextToken();
//			System.out.println(local);
//		}
		
//		StringTokenizer st = new StringTokenizer(longLine, " ");
//		while (st.hasMoreTokens()) {
//			String local = st.nextToken();
//			System.out.println(local);
//			System.out.println(local.equals("carrot"));
//		}

		
		
//		for (int i = 13; i <= 18; i++) {
//			System.out.print(longLine.charAt(i));
//		}

		
		
//		String[] arr = new String[4];
//		StringBuilder sb = new StringBuilder(longLine);
//		for (int i = 0; i < 3; i++) {
//			int spaceIndex = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0,  spaceIndex + 1, "");
//		}
//		System.out.println(arr[2]);

	}
}
