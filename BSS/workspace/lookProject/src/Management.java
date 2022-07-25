import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
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
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.FlowLayout;

public class Management extends JFrame {
	Management() {
		super("관리자용");
		// 의상관리 타이틀 ---
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pnlTop = new JPanel();
		panel.add(pnlTop);

		JLabel lblTitle = new JLabel("의상관리");
		lblTitle.setFont(new Font("휴먼편지체", Font.PLAIN, 40));
		pnlTop.add(lblTitle);
		// -------------

		// 데이터 목록 보이는 패널
		JPanel pnlMain = new JPanel();
		JPanel pnlData = new JPanel();
		pnlData.setAlignmentX(Component.LEFT_ALIGNMENT);

		// 체크박스 일단 100개 생성; 나중에 데이터 길이만큼 불러옴.
		JPanel pnlBtn = new JPanel();
		pnlBtn.setBounds(250, 250, 250, 250);
		String query = "query문 변경이 적용되는가,,?";

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btConfirm = new JButton("등록");
		btConfirm.setMargin(new Insets(12, 30, 12, 30));
		panel_1.add(btConfirm);
		JButton btEdit = new JButton("수정");
		btEdit.setMargin(new Insets(12, 30, 12, 30));
		panel_1.add(btEdit);
		JButton btDelete = new JButton("삭제");
		btDelete.setMargin(new Insets(12, 30, 12, 30));
		panel_1.add(btDelete);
		for (int i = 0; i < 100; i++) {
			JCheckBox ckBox = new JCheckBox((i + 1) + query + ".여기에 데이터가 들어감?? 됨?");
			pnlData.add(ckBox);
			ckBox.setMargin(new Insets(7, 2, 7, 2));
		}

		pnlMain.add(pnlData);
		pnlData.setLayout(new BoxLayout(pnlData, BoxLayout.Y_AXIS));
//		pnlMain.add(pnlBtn);
		pnlBtn.setLayout(new GridLayout(0, 3, 0, 0));
		JScrollPane scrollPnl = new JScrollPane(pnlMain);
		getContentPane().add(scrollPnl);

		setSize(850, 850);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// 등록, 수정 버튼 클릭시, 등록 수정 창 띄우기
		ActionListener regiEditAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagementOfRegist m = new ManagementOfRegist();
				m.setVisible(true);
				if (m.isVisible()) {
					btConfirm.setEnabled(false);
				}
			}
		};
//		ItemListener regiEditItem = new ItemListener() {
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				
//			}
//		};
		btConfirm.addActionListener(regiEditAction);
//		btConfirm.addItemListener(regiEditItem);
		//////////////////////////////////
	}
}
