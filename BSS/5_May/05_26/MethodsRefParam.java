// 참조형 타입의 메소드
// 값의 복사
public class MethodsRefParam {
	public static String concat(String left, String right) {
		return left + right;
	}
	// String left 는 String h의 Hello를 참조, String right 는 String w의 World를 참조.
	public static void main(String[] args) {
		String h = "Hello";
		String w = "World";
		String result = concat(h, w);
		
		System.out.println(result);
	}
}