import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d:\filetest\한글이름.txt
		
		File fileKor = new File("d:\\filetest\\한글이름.txt");
//		try {
//			System.out.println("생성됨? " + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 윈도우 파일이나, 내 문서 등 높은 권한이 필요하다면, 실행되지 않을 수 있다.
		// window os자체에서 허락을 맡고 실행하기 때문.
		
		// 한글 파일이름 변경시키기
		// renameTo(파일객체) 파일객체 경로 새로넣어주면됨
		// renameTo는 런타임예외라서 무조건 try catch 할 필요 없음.
		fileKor.renameTo(new File("d:\\filetest\\newname.txt"));
		
		// 파일 지우기 / 복구하는 것은 없다
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete();
		
		
		
		
	}
}
