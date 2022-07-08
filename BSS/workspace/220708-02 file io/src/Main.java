import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// 내용이 있는 파일
public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
//		System.out.println(diaryFile.exists()); 

		// 파일을 불러올 때, 빨대같은것이 필요한데 스캐너로 가능하다.
		// 빨대가 필요한 근본적 이유 - 물리적으로 멀리 떨어져 있음. 기계장치가 다름, 둘다 이진데이터이지만 파일 방식이 다름
		// 위의 역할들을 연결해 줄 수 있는 익숙한 객체는 scanner라서 처음 사용 한 것
		Scanner scanner = null;
		// 파일 객체를 받는생성자는 checked exception을 던짐. 파일이 없을 때 예외처리
		try { // try문 안에서 파일을 읽는 동작을 하면된다.
			scanner = new Scanner(diaryFile);
			// 파일을 찾지 못하면 scanner는 null을 참조한다.
			
//			// 파일안의 한 줄을 뽑아온다.
//			scanner.nextLine(); 

			// 여러 줄이 있을 때, 다음줄이 있는지 물어보고 가져오기를 while문으로 처리
			while (scanner.hasNext()) { // iterator의 hasNext()와 같음. 있으면 true, 없으면 false
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) { // FileNotFoundException 대신 IOException 사용 가능하나 덜 구체적임.
			System.out.println("파일을 찾지 못했습니다.");
		} finally { // 자원의 해제를 위해 finally에서 언제나 close()를 호출해줌.
			if (scanner != null) { // 널포인트익셉션 방지를 위해 널체크 먼저함
				scanner.close();
			}
		}
		
	}
}
