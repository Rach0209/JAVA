package teacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	public Main() {
		JPanel pnl = new JPanel();
		box1 = new JCheckBox("짜장면 : 5000원");
		box2 = new JCheckBox("짬뽕 : 6000원");
		box3 = new JCheckBox("탕수육 : 12000원");
		JLabel lblPrice = new JLabel("가격 표시");
		JButton btnAll = new JButton("전체선택");
		JButton btnCancel = new JButton("취소");
		
		pnl.add(box1);
		pnl.add(box2);
		pnl.add(box3);
		pnl.add(btnAll);
		pnl.add(btnCancel);
		pnl.add(lblPrice);

		add(pnl);

		ActionListener btnListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean all = e.getSource() == btnAll;
				box1.setSelected(all);
				box2.setSelected(all);
				box3.setSelected(all);
			}
		};
		
		btnAll.addActionListener(btnListener);
		btnCancel.addActionListener(btnListener);
		
		// ****** ActionListener / ItemListener ******
		// 액션 이벤트는 버튼 형식을 가진 것들은 모두 발생한다.
		// 체크박스를 누를 때 => 액션 이벤트의 발생이 생긴다.
		// 전체선택, 취소 등으로 **체크박스의 상태값**만 변경시키면 액션 이벤트는 발생하지 않는다.
		// 아이템 리스너는 체크박스 상태의 변화에 집중해서 상태값이 변경하면 이벤트가 발생한다.
		
		// 액션리스너로 만들기 => 체크박스를 직접 눌렀을 때만 작동
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = sum();
				lblPrice.setText(String.valueOf(sum));
			}
		};
		
		// 아이템리스너로 만들기 => 전체 선택, 취소를 눌렀을 때도 적용이된다.
		// 체크박스 상태의 변화에 집중하기 때문. ( 체크 O 체크 X )
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// getSource() 참조를 가져온다.
				int sum = sum();
				lblPrice.setText(String.valueOf(sum));
			}
		};

//		box1.addActionListener(actionListener);
//		box2.addActionListener(actionListener);
//		box3.addActionListener(actionListener);
		
		// 체크박스의 단축키 설정도 가능. 나중에 배움
		
		box1.addItemListener(itemListener);
		box2.addItemListener(itemListener);
		box3.addItemListener(itemListener);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// 가격 계산 메소드
	private int sum() {
		int sum = 0;
		sum += box1.isSelected() ? 5000 : 0;
		sum += box2.isSelected() ? 6000 : 0;
		sum += box3.isSelected() ? 12000 : 0;
		return sum;

	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
