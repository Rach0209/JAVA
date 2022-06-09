import java.util.Scanner;

public class Main3 {
	private static String stars(int x, int y, int[] array) {
		String count = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= x && array[i] <= y) {
				count += "*";
			}
		}
		return count;
	}
//	private boolean isOk(int number) {
//		return number > 100 || number < 1;
//	}
//	
//	private int inputNumber() {
//		Scanner scan = new Scanner(System.in);
//		int number = 0;
//		do {
//			number = scan.nextInt();
//		} while (isOk(number)); {
//			return number;
//		}
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		System.out.println("1 ~ 100 사이 숫자 10번 입력.");
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(((i * 10) + 1) + " - " + ((i + 1) * 10) + " : ");
			System.out.println(stars(((i * 10) + 1), ((i + 1) * 10), input));
		}
	}	
}
