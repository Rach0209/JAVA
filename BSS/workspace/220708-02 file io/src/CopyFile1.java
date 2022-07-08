import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			// FileOutputStream => 파일이 없으면, 파일자체도 만들어준다.
			out = new FileOutputStream("output.txt");
			int c;

			// in.read() => 하나의 바이트를 들고와서 읽어준다.
			// int형으로 들고옴 => c로 대입연산
			// 파일의 끝을 가져올 때, end of file이라해서 -1의 값을 가져온다.
			while ((c = in.read()) != -1) { // 처음부터 하나씩 가져오는데, 끝은 -1 ==> 처음부터 끝까지 들고온다.
				out.write(c); // output.txt인 out에 in.read()로 가져온 c를 써준다. input파일내용이 output파일 내용에 복사됨 = 처음부터끝까지 들고왔기 때문에.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
