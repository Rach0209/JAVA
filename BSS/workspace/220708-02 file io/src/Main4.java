import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		// '버퍼'라는 공간을 가지고 있음
		PrintWriter pw = null;
			// 문자 단위로 접근
			try {
				pw = new PrintWriter(new FileWriter(file)); //wrapping해줌
				// printwirter는 기본적으로 임시공간을 가지고 있다.
				pw.println("문자열 한줄을 출력합니다.");
				pw.println(10);
				pw.println(15.15);
				pw.flush(); // flush는 버퍼라는 임시공간을 가지고 있다. 
				// 임시 공간이 가득찰 때까지 파일이 쌓인다 => flush를 호출해주면 임시공간의 파일들을 호출하라고 명령해줌
				// => 출력하면 => 임시공간이 비워짐
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (pw != null) {
					pw.close();
				}
			}
			
	}

}
