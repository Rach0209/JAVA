// 중첩된 반복문
// 안쪽 반복문 : innerLoop // 바깥쪽 반복문 : outerLoop
public class Loop2D {
	public static void main(String[] args) {
		
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}