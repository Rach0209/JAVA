import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // 지역변수에서 밖으로 빼줌으로 파이널리에서 사용가능, 초기화도 시켜줌
		String line = "Hello";
		try {
			 fos = new FileOutputStream(new File("d:\\filetest\\practice.txt"));
			 
			 // wirte 는 스트링값(문자열)을 받을 수 없다. byte형식으로 받을 수 있음. byte배열 형태 가능(여러 문자)
			 fos.write(line.getBytes()); // 배열로된 byte형식으로 바꿔줌.
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
