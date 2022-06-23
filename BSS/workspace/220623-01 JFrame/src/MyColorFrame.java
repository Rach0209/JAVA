import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 인터페이스로 구현 ActionListener; 
//class MyActionListener implements ActionListener {
//	@Override // 추상메도스 오버라이드 필수
//	public void actionPerformed(ActionEvent e) {
//		// 클릭했을 때 동작 만들기.
//		System.out.println("사용자가 버튼을 클릭 했넹~"); // 클래스이기 때문에 바로 동작 x 불러와야 동작
//	}
//	
//}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");

		JPanel pnl = new JPanel(); // contentPane(). 기본동작이 적용되서 빨간색으로 채워짐.
		pnl.setBackground(Color.RED);

//		pnl.add(new JButton("컨테이너안의 버튼"));
		JButton btn = new JButton("컨테이너안의 버튼"); // 지역변수로 변경
//		MyActionListener listener = new MyActionListener();

		// 익명클래스로 생성하기
		// 클릭 했을 때, 이벤트를 전달해주면 밑의 문장이 실행 됨.
		btn.addActionListener(new ActionListener() {
			// 버튼 클릭하면 배경 색깔 바꾸기 
			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.BLUE);
				// 반복문을 쓰면 흐름이 흘러갈 수 있도록 만어야함.
				// 그렇지 않으면 프로그램이 갇혀서 무한 반복, 그래픽깨짐 등 여러 현상 생김
//				while (true) {
//					System.out.println("asdf");
//				}
			}
			// 버튼 클릭하면 콘솔에 문장 출력
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("익명클래스 구현");
//			}
		});

		// 버튼을 클릭을 할때마다 click event가 발생한다.
		// 인터페이스로 클릭 동작 만들고, addActionListener로 불러오기
//		btn.addActionListener(listener);

		// 버튼 추가
		pnl.add(btn);
		// 프레임에 패널 추가
		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}
