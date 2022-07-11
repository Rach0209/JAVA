import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		// '버퍼'공간을 가짐
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
//			// readLine() : 한 줄의 문자열을 읽을 수 있음.
//			br.readLine(); 
			
			String line; // 끝이 null값으로 반환됨으로 null이 아닐때까지 반복
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
