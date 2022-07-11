import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Human implements Serializable {
	private int num;
	private String name;
	private String call;
	private String email;

	public Human(int num, String name, String call, String email) {
		super();
		this.num = num;
		this.name = name;
		this.call = call;
		this.email = email;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Human [num=" + num + ", name=" + name + ", call=" + call + ", email=" + email + "]";
	}

}

public class Test03 {
	public static void main(String[] args) {
		List<Human> list = new ArrayList<>();
		Human human = new Human(1, "홍길동", "011-111-1111", "hong@hanmail.net");
		Human human2 = new Human(2, "김유신", "010-222-2222", "kim@hanmail.net");
		list.add(human);
		list.add(human2);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 사용자 정보 입력 2. 전화번호 찾기");
			int number = sc.nextInt();
			switch (number) {
			case 1:
				System.out.println("회원 번호 입력");
				int num = sc.nextInt();
				sc.nextLine();
				System.out.println("이름 입력");
				String name = sc.nextLine();
				System.out.println("전화번호 입력 (xxx-xxx-xxxx형식)");
				String call = sc.nextLine();
				System.out.println("이메일 입력");
				String email = sc.nextLine();
				list.add(new Human(num, name, call, email));

				// 작성하기
				ObjectOutputStream oos = null;

				try {
					oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\test03_01.ser")));
					for (int i = 0; i < list.size(); i++) {
						oos.writeObject(list.get(i));
					}
					oos.flush();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (oos != null) {
						try {
							oos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				continue;
			case 2:
				// 불러오기
				ObjectInputStream ois = null;

				List<Human> list2 = new ArrayList<>();
				Scanner scan = new Scanner(System.in);
				System.out.println("회원번호 입력하면 그 분 전화번호 찾아드림~");
				int input = scan.nextInt();

				try {
					int i = 0;
					ois = new ObjectInputStream(new FileInputStream(new File("d:\\filetest\\test03_01.ser")));
					while (true) {
						Human h = (Human) ois.readObject();
						list2.add(h);
						if (list2.get(i).getNum() == input) {
							System.out.println(list2.get(i).getCall());
						}
						i++;
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (EOFException e) {
					System.out.println("입니다.");
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
				continue;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}

	}
}
