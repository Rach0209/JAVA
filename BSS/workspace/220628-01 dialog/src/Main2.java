import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// 종료 버튼 누르면 => 값 반환 받아서 => 부모 창 종료시키기
class ExitDialog extends JDialog {
	private boolean exit;

	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);

		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");

		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				dispose();
			}
		};

		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);

		pnl.add(btnYes);
		pnl.add(btnNo);

		add(pnl);
		setSize(250, 250);
		setLocationRelativeTo(null);
	}

	// t/f 로 종료버튼 - t, 취소버튼 - f
	public boolean showDialog() {
		setVisible(true);

		return exit;
	}
}

public class Main2 extends JFrame {
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.showDialog();

				// 예/아니오/취소 버튼이 있는 dialog 생성해줌.
				// JOptionPane.에 상수로 YES_NO_OPTION이 정의되어있음. int값 반환해줌
				int result = JOptionPane.showConfirmDialog(Main2.this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				// 텍스트입력창이 있는 dialog 생성해줌.
//				JOptionPane.showInputDialog(Main2.this, "입력창");

				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
				
//				if (result) {
//					setDefaultCloseOperation(EXIT_ON_CLOSE);
//				}
//				System.out.println("닫을려하냐?");
			}
		});
//			// WindowListener 기본 7개
//			@Override // 열렸을 때.
//			public void windowOpened(WindowEvent e) {
//				
//			}
//			@Override // 최소화 되었을 때
//			public void windowIconified(WindowEvent e) {
//				
//			}
//			@Override // 최소화 벗어났을 때
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//			@Override // 활성, 비활성화; 포커스와 비슷
//			public void windowDeactivated(WindowEvent e) {
//				
//			}
//			@Override // 닫으려 할 때.
//			public void windowClosing(WindowEvent e) {
//				
//			}
//			@Override // 닫혔을 때.
//			public void windowClosed(WindowEvent e) {
//				
//			}
//			@Override // 활성, 비활성화;
//			public void windowActivated(WindowEvent e) {
//				
//			}

		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
