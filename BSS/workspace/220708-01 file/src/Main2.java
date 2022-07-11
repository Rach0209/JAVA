import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 상대적 경로, 이클립스는 기본적으로 프로젝트 폴더 설정
		File file = new File(".\\");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		// 실제 경로(절대경로)를 알아보기 위한 메소드
		System.out.println(file.getAbsolutePath());
		try {
			// 상대적 경로 표현법이 있을 때, 실제 경로명으로 변경해줌.
			// 무조건 예외처리. IOException을 상속하는 checkedException을 무조건적으로 가짐
			System.out.println(file.getCanonicalPath()); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 상대경로를 통해, 상위 폴더를 표현하기
		File fileParent = new File("..\\"); 
		
		System.out.println(fileParent.getAbsolutePath()); // D:\BSS\workspace\220708-01 file\..
		try {
			System.out.println(fileParent.getCanonicalPath()); // D:\BSS\workspace
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}













