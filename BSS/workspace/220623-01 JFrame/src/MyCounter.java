import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0;

	public MyCounter() {
		super("카운터");

		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		JButton btn2 = new JButton("감소");
		// 증가버튼 액션 리스너
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// setText() 글자 바꾸는 메소드
				number++;
				// number가 10이 증가할 때마다 배경색 바꾸기
				if (number % 10 == 0) {
					pnl.setBackground(Color.CYAN);
				} else {
					pnl.setBackground(null);
				}
				// 보여주는 역할의 JLabel의 상태값을 변화. int값을 받지 않아서 String으로 변환
				lbl.setText(String.valueOf(number));
				// 버튼값 30 되면 시스템 종료하기
				if (number == 30) {
					System.exit(0);
				}
			}
		});
		// 감소버튼 액션 리스너
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
			}
		});

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
}
