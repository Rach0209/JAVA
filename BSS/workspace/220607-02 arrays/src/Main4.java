import java.util.Arrays;

public class Main4 {
	static void printArray(char[] target) {
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrayToString(char[] target) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정 문자의 인덱스를 찾아 반환하는 메소드.
	static int whereIs(char[] target, char c) {
		for (int i = 0; i <target.length; i++) {
			if(target[i] == c) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		char[] hello = { 'H', 'e', 'l', 'l', 'o' }; // 문자의 배열; 
//		printArray(hello);
//		String result = arrayToString(hello);
//		System.out.println(result);
		
		// java.util.에 있는 메소드. 문자열로 반환해주는 메소드
		String result = Arrays.toString(hello); 
		System.out.println(result);
		
		System.out.println(whereIs(hello, 'o'));

		
		
		
		
		
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
//		System.out.println();
//		// 위의 문자 배열에 o 문자에 해당하는 인덱스를 찾아보세요~
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("index값 : " + i);
//			}	// 클래스로 메소드를 만들어보기. void printArray();
//		}
	}
}
