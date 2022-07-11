import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");

			int c;
			// read()는 문자하나를 읽어오는데, int형으로 반환해준다. char 형식은 단위가 모자람. 
			// byte보다 큰, 문자 단위로 읽음.
			while ((c = inputStream.read()) != -1) {
				System.out.println("읽은 문자 확인 : " + (char) c);

				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try { // 여기서도 마찬가지로 close()호출 필수
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
