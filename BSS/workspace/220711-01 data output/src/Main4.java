import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		List<Student> list = new ArrayList<>();

		try {// 장점 : 모든 타입을 불러올수 있다. 자바 안에서 읽고 쓰는 것이 용이.
			 // 단점 : 데이터를 사람이 눈으로 볼 수 없다. 자바에서 사용하는 원시형 타입으로 기록한 기록물, 자바 시스템 안에서만 읽고 쓸 수 있음.
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\student.dat")));
			
			while (true) {
				String name = dis.readUTF();
				int age = dis.readInt();
				double score = dis.readDouble();

				Student s = new Student(name, age, score);
				list.add(s);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // IOException의 자식, checked Exception임.
			System.out.println("학생 정보를 끝까지 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);
	}
}
