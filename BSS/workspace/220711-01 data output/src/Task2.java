import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//시저암호 구현하기
//시저 암호 방식을 이용하여 파일을 암호화하고 복호화하는 프로그램을 작성하라. 
class Encryption{
	
	//암호화하기
	public  String what(String s) {
		char[] arr= new char[s.length()];
		String what = "" ;
		arr= s.toCharArray();
		for(int i =0; i<s.length();i++) {
			if(arr[i]=='x'||arr[i]=='y'||arr[i]=='z') {
				arr[i] -=23;
			}else{
				arr[i] +=3;
			}
			what = new String(arr);
		}
		return what;
	}
	
	//복호화하기
	public String what2(String s) {
		char[] arr= new char[s.length()];
		String what = "" ;
		arr= s.toCharArray();
		for(int i =0; i<s.length();i++) {
			if(arr[i]=='x'||arr[i]=='y'||arr[i]=='z') {
				arr[i] +=23;
			}else if(arr[i]==' '){
				arr[i]=arr[i];
			}else{
				arr[i] -=3;
			}
			what = new String(arr);
		}
		return what;
	}
	
}


public class Task2 {
	public static void main(String[] args) {
//		확인용
//		String str = "Hello World";
		Encryption et = new Encryption();
//		String encryption = et.what(str);
//		System.out.println("암호화:"+encryption);
//		System.out.println("복호화:"+et.what2(encryption));
		
		//파일을 읽어서 암호화 한다. 
		BufferedReader bf= null;
		PrintWriter pw2 =null;
		List<String> etLine = new ArrayList<>();
		
		try {
			bf = new BufferedReader(new FileReader(new File("d:\\filetest\\task2.txt")));
			pw2 = new PrintWriter(new File("d:\\filetest\\task2one.txt"));
			
			while(true) {
				String whatLine = String.valueOf(et.what(bf.readLine()));
				etLine.add(whatLine);
				pw2.println(whatLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("파일 끝!");
		}catch(NullPointerException e) {
			System.out.println("뭐?");
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw2.close();
			if(bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
//		System.out.println(etLine);

		//암호화된 내용을 읽어 복호화한다. 
		
		PrintWriter pw=null;
		
		try {
			pw = new PrintWriter(new File("d:\\filetest\\task2two.txt"));
			
			for (int j = 0; j < etLine.size(); j++) {
				String plz = et.what2(etLine.get(j));
				pw.println(plz);
			}
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
		
		
	}
}
