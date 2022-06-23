import javax.swing.JFrame;
// 나만의 창 만들기 - 상속
class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		// 내 프레임의 특징으로 크기 변경시키기.
		setSize(500, 500); // this.없애도 됨 상속받앗음
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame. 생략;
	}
}

public class Main3 {
	public static void main(String[] args) {
		// 앞의 MyFrame = JFrame으로도 가능 (상속) JFrame으로 만들고 기능들을 추가한다는 개념
		MyFrame frame = new MyFrame("나만의 프레임"); 
		frame.setVisible(true);
	}
}
