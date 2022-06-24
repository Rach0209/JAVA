import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// 배치 관리자 LayoutManager
public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel();
		// ****************** FlowLayout *********************
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);// (); 빈 생성자 파라미터 => 기본 center 설정되어있음
//		pnl.setLayout(flow); // 결과는 기본과 동일. => JPanel 기본 값이 flow임.
		
		// ****************** BorderLayout *************************
//		BorderLayout border = new BorderLayout(); // component의 위치와 크기를 설정해준다.
//		pnl.setLayout(border);
		// add를 쓰면 자기의 영역에 component를 가득 채운다. => ComponentPane()의 기본값
		// BorderLayout은 기본 5개의 위치가 있음. 동 서 남 북 중앙. 위치를 불러주어야 설정가능
		// ** 화면 영역을 나누어서 쓸 때 - BorderLayout을 사용할 수 있음 **
		// 특징 : 가로로 배치해놓으면 -> 세로는 무조건 가득채움. 반대도 똑같음 세로 배치 -> 가로 가득 채움
		// ===>>> 영역을 모두 채움

		// ******* BorderLayout 설정 *******
		// add를 쓰면 자기의 영역에 component를 가득 채운다. => ComponentPane()의 기본값
//		pnl.add(btn1, "West"); // 위치를 정해줌 (동 서 남 북 중앙 5가지)
//		pnl.add(btn2); // 문자열, 상수값 둘다 가능. center는 생략가능.
//		pnl.add(btn3, BorderLayout.EAST);
//		pnl.add(btn3, "South");// 같은 버튼을 입력 할 때, 원래 있던 자리에서 새로운 자리로 옮긴다.
		// Component 객체를 여러개를 만들면, 여러 곳에 넣을 수 있다.

		
		// ****************** BoxLayout ********************
		// 박스를 쌓듯이 일정한 방향으로 나열해줌 방향은 axis로 설정가능. x축, y축 등등
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box);
		
		
		// ****************** GridLayout ********************
		// 생성자에 설정 한 행 열 값으로 균등하게 나누어 준다.
		GridLayout grid = new GridLayout(2, 2);
		pnl.setLayout(grid);
		pnl.setLayout(null); // 레이아웃을 없애버림; 버튼이 보이지 않음. => 버튼의 위치를 잡아주면 보임.
		
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		// 버튼 크기 설정 // Dimension 객체로 크기 받기
		// BorderLayout 일때, 위치 정해진 곳에 따라서 세로나 가로크기가 무시되고 영역을 꽉 채움
		btn1.setPreferredSize(new Dimension(300, 300));
		// 최소, 최대값 사이즈
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		
		// 시작 지점은 좌상단.
		btn1.setLocation(10, 30); // 가로 10, 세로 30 띄어진 자리에서 시작
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 90, 40); // 절대적인 좌표와 크기를 사용하는 방법. (x, y, width, height)
		
		pnl.add(btn1);
		pnl.add(btn2); 
		pnl.add(btn3);
//		pnl.add(btn3, "South");
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}

}
