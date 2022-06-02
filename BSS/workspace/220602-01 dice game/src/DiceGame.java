// p.182
import java.util.Random;
import java.util.Scanner;
public class DiceGame {
	int diceFace;
	int userGuess;
	
	private void rollDice() {
		Random random = new Random();
//		diceFace = (int) (Math.random() * 6) + 1;
		diceFace = random.nextInt(6) + 1;
	}
	
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
				return s.nextInt();
	}
	
	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다");
			return true;
		} else {
			System.out.println("틀렸습니다");
			return false;
		}
	}
	
	// 반복문 >> 맞으면 종료, 틀리면 반복시키기.
	// 접근 제한자를 통해 불필요한 부분을 감춘다.
	// 안에서만 이루어지는 경우 private하게 감추기, 외부에서 호출하는 것들은 public으로 공개시키기.
	public void startPlaying() {
		while (true) {
			userGuess = getUserInput("예상값을 입력하시오: ");
			rollDice();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}
