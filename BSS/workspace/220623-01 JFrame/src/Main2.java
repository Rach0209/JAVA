import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main2 {
	public static void main(String[] args) {
		// CLI : 코드로만 작성
		
		// GUI : Graphical User Interface
		// AWT / SWING swing 배움 AWT의 확장 버전 > SWING : 순수 JAVA언어로 제작가능.
		// JavaFX - 가장 최신
		// Android (google)
		
		// 기본 윈도우 창 만들기 파라미터 내용 => 윈도우 창의 title
		// title 이라는 필드 존재함. => setter로 설정 가능
		JFrame frame = new JFrame();
		frame.setTitle("제목입니다");
		
		// 창은 객체를 가지고 있다. contentPane()
		// JLabel import
		frame.getContentPane().add(new JLabel("Hello World"));
		
		// 이상한 특징 - 창을 꺼도 콘솔창에서 여전히 실행중임. >>> 창 종료 시 종료시키기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // public static final int로 구성
//		frame.setDefaultCloseOperation(3);
		
		// 크기 설정
		frame.setSize(500, 500);
		
		// 보여주기. boolean값으로 입력.
		frame.setVisible(true);
		
		System.out.println("asdf");
	}
}
