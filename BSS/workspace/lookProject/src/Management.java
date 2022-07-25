import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Management extends JFrame {
	// 등록창과 수정창 생성자. 만일을 대비해 두 개를 따로 생성. 오류방지목적으로 동시 실행불가 처리해놓음.
	ManagementOfRegist registWindow = new ManagementOfRegist();
	ManagementOfRegist editWindow = new ManagementOfRegist();

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

		////////////////////////// 창 열고 닫을 때, 버튼 활성<->비활성 체크 //////////////////////////////

		// 등록, 수정 버튼 클릭시, 등록 수정 창 띄우기
		ActionListener regiAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				registWindow.setVisible(true);
				if (registWindow.isVisible()) {
					btConfirm.setEnabled(false);
					btEdit.setEnabled(false);
				}
			}
		};
		ActionListener editAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				editWindow.setVisible(true);
				if (editWindow.isVisible()) {
					btEdit.setEnabled(false);
					btConfirm.setEnabled(false);
				}
			}
		};
		// ---------------------------------
		// 창을 닫을 때, 다시 버튼이 활성화 된다.
		WindowListener toggleBtn = new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				btConfirm.setEnabled(true);
				btEdit.setEnabled(true);
			}
		};
		// 등록창과 수정창은 각각 따로 생성했다.
		btConfirm.addActionListener(regiAction);
		btEdit.addActionListener(editAction);
		registWindow.addWindowListener(toggleBtn);
		editWindow.addWindowListener(toggleBtn);
		//////////////////////////////////
		
		
	}
}
