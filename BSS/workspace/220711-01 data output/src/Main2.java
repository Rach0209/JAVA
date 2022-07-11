import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 자바는 원시형 타입을 그대로 기록하고 읽어오는 Stream 존재
		DataOutputStream dos = null; // byte단위 출력
		
		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\filetest\\mydata.dat"));
			
			dos.writeInt(50); // 정수를 정수형태로
			dos.writeDouble(123.123);
			dos.writeUTF("문자열");
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		DataInputStream dis = null;
		try { // 읽는 방식이 다양함 => 파일의 끝을 알려주는 약속이 존재하기 힘듦.
			// 파일의 끝을 알려줄 때 => '예외'로 알려줌 ====> EndOfException == EOFException
			dis = new DataInputStream(new FileInputStream("d:\\filetest\\mydata.dat"));
			
			int valueInt = dis.readInt();
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF();
			
			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // IOException의 자식. // 파일의 '끝'을 알려주는 예외.
			System.out.println("파일의 끝까지 다 읽음.");
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
		
		
		
		
		
	}
}
