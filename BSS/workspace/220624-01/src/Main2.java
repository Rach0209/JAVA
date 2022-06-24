import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 사용자가 메뉴를 선택하면 가격이 나오는 프로그램
public class Main2 extends JFrame {
	int x = 2500;
	int y = 4000;
	int z = 10000;
	int sum = 0;
	int result;

	public Main2() {
		JPanel pnlMain = new JPanel();
		JPanel pnlLeft = new JPanel();
		JPanel pnlRight = new JPanel();
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JLabel calc = new JLabel("메뉴값 계산 박스");
		JLabel calcResult = new JLabel();

		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
		BoxLayout calcBox = new BoxLayout(pnlRight, BoxLayout.Y_AXIS);
		pnlRight.setLayout(calcBox);
		pnlMain.add(pnlTop);
		pnlMain.add(pnlBottom);
		JButton btn1 = new JButton("전체 선택");
		pnlTop.add(btn1);
		JButton btn2 = new JButton("전체 취소");
		pnlTop.add(btn2);
		pnlBottom.add(pnlLeft);
		pnlBottom.add(pnlRight);
		pnlRight.add(calc);
		pnlRight.add(calcResult);

		JCheckBox check1 = new JCheckBox("짜장면 2500");
		JCheckBox check2 = new JCheckBox("짬뽕 4000");
		JCheckBox check3 = new JCheckBox("탕수육 10000");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(true);
				check2.setSelected(true);
				check3.setSelected(true);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(false);
				check2.setSelected(false);
				check3.setSelected(false);
			}
		});
		
		result = 0;
		sum = 0;
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				result = e.getStateChange();
				if (result == 1) {
					sum += x;
				} else {
					sum -= x;
				}
				calcResult.setText(String.valueOf(sum));
			}
		});
		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				result = e.getStateChange();
				if (result == 1) {
					sum += y;
				} else {
					sum -= y;
				}
				calcResult.setText(String.valueOf(sum));
			}
		});
		check3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				result = e.getStateChange();
				if (result == 1) {
					sum += z;
				} else {
					sum -= z;
				}
				calcResult.setText(String.valueOf(sum));
			}
		});
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));

		pnlLeft.add(check1);
		pnlLeft.add(check2);
		pnlLeft.add(check3);

		getContentPane().add(pnlMain);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
