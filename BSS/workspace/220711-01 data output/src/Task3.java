//사용자로부터 번호,이름 전화번호, 이메일 주소 등을 입력받아 파일로 저장한다. 
//입력이 끝나면 번호를 입력받아 그 번호에 해당하는 전화번호를 출력하는 프로그램을 작성해

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//클래스 
class GoHome implements Serializable{
	private int number;
	private String name;
	private String phoneNum;
	private String email;
	public GoHome(int number, String name, String phoneNum, String email) {
		super();
		this.number = number;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "[number=" + number + ", name=" + name + ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}
}
/////////////



public class Task3 {
	public static void main(String[] args) {
		//번호를 입력받은걸 키로 써야 하니까 map써본다 일단.... 
		Map<Integer,GoHome> task3 = new HashMap<Integer,GoHome>();
		Scanner scan = new Scanner(System.in);
		
		//사용자의 입력 받기. 
		System.out.println("몇 개를 입력하시겠습니까?");
		int how = scan.nextInt();

		for(int i =0; i< how; i++){
			System.out.println("번호를 입력하세요");
			int number = scan.nextInt();
			scan.nextLine();
			System.out.println("이름을 입력하세요");
			String name = scan.nextLine();
			System.out.println("전화번호를 입력하세요");
			String phoneNum = scan.nextLine();
			System.out.println("이메일을 입력하세요");
			String email = scan.nextLine();
			
			task3.put(number,new GoHome(number,name,phoneNum,email));
		}
		
		//파일 객체 생성 (클래스를 내용으로 함으로 ser파일로 만들기)
		File file =new File("d:\\filetest\\who.ser");
		
		//who라는 파일 안에 입력 받은 내용을 넣는다. 
		ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(new FileOutputStream(file));
			
			for(int i =0; i< task3.size();i++) {
				os.writeObject(task3.get(i+1));
			}
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("알고 싶은 번호를 입력하세요");
		int whois = scan.nextInt();
		
		
		//파일을 읽어온다. 
		ObjectInputStream oi = null;
		
		try {
			oi = new ObjectInputStream(new FileInputStream(file));
			while(true) {
				GoHome gh = (GoHome)oi.readObject();
				if(gh.getNumber()==whois) {
					System.out.println("핸드폰 번호는:"+gh.getPhoneNum());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("끝!");
		}
		catch (ClassCastException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			System.out.println("뭐고");
		}
		finally {
			if(oi!=null) {
				try {
					oi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}

}
