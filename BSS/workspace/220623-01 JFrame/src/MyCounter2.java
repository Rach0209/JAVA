import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {
	private int number = 0;
	// 필드로 선언 해주면서, 지역변수를 참조로 사용할 수 있게함
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;
	
	public MyCounter2() {
		super("카운터");

		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");
		
		// 생략하고 상속으로 쓰기가능
//		// 액션 리스너 ===> 참조로 알려준다. aListener
//		ActionListener aListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 하나의 메소드로 여러개 버튼의 이벤트를 처리.
//				// 참조 비교해서 처리 (참조를 알려줌) // 증가버튼인지 감소버튼인지
//				JButton btn = (JButton) e.getSource();
//				// 버튼의 속성(버튼 글자)으로 비교하기
////				if (btn.getText().equals("증가")) {
////					number++;	
////				} else {
////					number--;
////				}
//				
//				
//				if (e.getSource() == btn) {
//					number++;
//				} else {
//					number--;
//				}
//				
//				lbl.setText(String.valueOf(number));
//			}
//		};
		
		// 두 버튼 모두 같은 리스너, 참조로 알려줌
//		btn.addActionListener(aListener);
//		btn2.addActionListener(aListener);
		
		// 버튼의 참조를 알려줌 = 자기자신의 참조이므로 this
		btn.addActionListener(this);
		btn2.addActionListener(this);
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// implement 오버라이드 ActionListener 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		// btn을 필드로 만들어서 참조가능하게 함
		if (e.getSource() == btn) {
			number++;
		} else {
			number--;
		}
		lbl.setText(String.valueOf(number));
	}

	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}

}
