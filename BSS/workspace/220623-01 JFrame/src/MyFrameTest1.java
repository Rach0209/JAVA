import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		// 버튼 생성 클래스 - JButton (button component)
		JButton button = new JButton("버튼1"); // 버튼에 들어갈 내용을 넣어줌
		JButton button2 = new JButton("버튼2");
		
		
//		getContentPane().setLayout(new FlowLayout()); // FlowLayout() component를 중앙정렬해서 일렬로 나열
//		getContentPane().add(button); // ContentPane의 기본 동작 : 내용을 가득 채움. -> border layout
		
		// getContentPane(). 생략가능
		setLayout(new FlowLayout());
		add(button);
		// 버튼에 대한 참조 추가
		add(button2);
		
		setVisible(true);
	}
}
public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
