import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main6 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\s1.ser"));
			
			// 기본적으로 Object의 형태로 알려주기때문에, 다운캐스팅 필요
			Student s = (Student) ois.readObject();
			
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
