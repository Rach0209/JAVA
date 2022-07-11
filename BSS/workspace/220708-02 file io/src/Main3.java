import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // 파일객체의 용량인 길이값을 long값으로 알려줌. // 여기선 int로 하향형변함.
			byte[] buf = new byte[length]; // 배열 생성. 바이트 길이만큼 
			
			// read는 한 바이트씩 읽는다.
			// end of file 파일이 끝날 때까지 읽어줌. -1을 반환
			fis = new FileInputStream(file);
			fis.read(buf);
			
			String result = new String(buf); // 문자열 생성자에 바이트 배열을 가지고 만들어주는 생성자가 이미 존재함.
			
			System.out.println(result);
			System.out.println(Arrays.toString(buf));
			for (byte b : buf) {
				System.out.println((char) b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
