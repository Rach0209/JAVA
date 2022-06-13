import java.util.Arrays;
import java.util.Random;

public class Main3 {
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
		System.out.println(Arrays.deepToString(randomArray));
		// 각 행의 합[0][0] + [0][1] + [0][2]///
		// 각 열의 합[0][0] + [1][0] + [2][0]///
		// 숫자 7의 개수 구하기
		
		// 배열이 [5][5] 이기 떄문에 밑에 메소드 먹힘; 행열의 값이 바뀌면 에러남 220610-03 teacher 프로젝트 폴더 main3에 정리되있음.
		int row = 0;
		int colum = 0;
		int count = 0;
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				row += randomArray[i][j];
				colum += randomArray[j][i];
				if (randomArray[i][j] == 7) { // 배열이 int 값이기 때문에 ==으로 조건
					count++;
				}
			}
			System.out.println("각 행의 합: " + row); // 각 행의 합.
			System.out.println("각 열의 합: " + colum); // 각 열의 합.
			System.out.println();
		}
		System.out.println("7의 개수: " + count);

		
	}
}
