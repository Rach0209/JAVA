import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		// 파라미터 안에 , 합칠 때 구분하는 문자 입력해줌/ (구분, 시작부분, 끝부분);
		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.add("1");
		sj.add("2"); // 입력 값 사이사이에만 , 가 붙는다.
		sj.add("3");
		
		
		System.out.println(sj.toString());
		System.out.println(sj + "Asdf");
		
		
	}
}
