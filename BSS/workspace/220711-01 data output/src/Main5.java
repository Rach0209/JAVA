import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main5 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\s1.ser")));
			// 객체 자체를 넣을 수 있다. / 기록하고자 하는 객체 넣어줌
			oos.writeObject(new Student("학생1", 33, 3.0));
			oos.flush();
			// NotSerializableException 예외 발생 => 직렬화가 불가능하다!
			// 직렬화 => 1차원적인 하나의 정보로 쭈욱 나열해주는 것.
			// Student 클래스에 implements Serializable 로 인터페이스화 시켜줌
			// transient는 직렬화 대상에서 제외시키는 키워드. (Main.java) Student의 double항목인 score에 적용시켜놓음.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("출력 완료");
		
		
	}
}
