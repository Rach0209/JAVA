import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ToolTipManager;

public class Management extends JFrame {
	private ManagementDaoImpl dao = new ManagementDaoImpl();

	// 등록창과 수정창 생성자. 만일을 대비해 두 개를 따로 생성. 오류방지목적으로 동시 실행불가 처리해놓음.
	ManagementOfRegist registWindow = new ManagementOfRegist();
	ManagementOfEdit editWindow = new ManagementOfEdit();
	List<JLabel> lblDataList = new ArrayList<>();
	List<Integer> checkedList = new ArrayList<>();
	List<Item> itemList = new ArrayList<>();
	
	 public ImageIcon scaleImage(ImageIcon icon, int w, int h) {
	        int nw = icon.getIconWidth();
	        int nh = icon.getIconHeight();

	        if(icon.getIconWidth() > w)
	        {
	          nw = w;
	          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
	        }

	        if(nh > h)
	        {
	          nh = h;
	          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
	        }

	        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
	    }
	 
	 
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

		JPanel pnlBtnManage = new JPanel();
		panel.add(pnlBtnManage);
		pnlBtnManage.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnAllCheck = new JButton("전체 선택");
		btnAllCheck.setMargin(new Insets(2, 4, 2, 4));
		btnAllCheck.setFont(new Font("굴림", Font.PLAIN, 12));
		pnlBtnManage.add(btnAllCheck);

		JButton btnAllUnCheck = new JButton("전체 해제");
		btnAllUnCheck.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnAllUnCheck.setMargin(new Insets(2, 4, 2, 4));
		pnlBtnManage.add(btnAllUnCheck);
		JButton btConfirm = new JButton("등록");
		btConfirm.setMargin(new Insets(12, 22, 12, 22));
		pnlBtnManage.add(btConfirm);
		JButton btEdit = new JButton("수정");
		btEdit.setEnabled(false);
		btEdit.setMargin(new Insets(12, 22, 12, 22));
		pnlBtnManage.add(btEdit);
		JButton btDelete = new JButton("삭제");
		btDelete.setMargin(new Insets(12, 22, 12, 22));
		pnlBtnManage.add(btDelete);

		// ----------------------------- 기능 구현 라인 -------------------------------
		// dao 불러오기 성공;
		// Item(all_product) 가져오기 성공.
		
//		try {
//			for (int i = 0; i < dao.read().size(); i++) {
//				itemList.add(dao.read().get(i));
//				System.out.println(dao.read().get(i).toString());
//			}
////			System.out.println(itemList);
//			
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
		// ------------------------------------------------------

		// 데이터 길이 만큼 레이블 생성 넣기
//		JLabel[] lblData = new JLabel[여기에 데이터 length];
		String query = "";
		try {
			for (int i = 0; i < dao.read().size(); i++) {
				query = dao.read().get(i).toString();
				JLabel[] lblDataLine;
				ImageIcon imageIcon = new ImageIcon("D:\\BSS\\workspace\\lookProject\\resource\\가방\\가방2.jpg");
				// 이건 되는데 resource꺼는 왜안됨?
//				ImageIcon imageIcon = new ImageIcon("D:\\BSS\\스쉐프젝\\룩\\룩3\\가방3.jpg");
				JCheckBox ckBox = new JCheckBox((i + 1) + ". ", imageIcon);
				lblDataLine = new JLabel[dao.read().size()];
				lblDataLine[i] = new JLabel(query);	
				pnlData.add(ckBox);
				pnlData.add(lblDataLine[i]);
				ckBox.setMargin(new Insets(7, 2, 7, 2));
				lblDataList.add(lblDataLine[i]);

				// 체크박스 전체 선택, 해제
				btnAllCheck.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						ckBox.setSelected(true);
					}
				});
				btnAllUnCheck.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						ckBox.setSelected(false);
					}
				});

				// 수정 버튼은 체크박스가 여러개 체크되있을 경우, 비활성화 시킨다.
				int index = i;
				ckBox.addItemListener(new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						int selectNum = index;
						if (e.getStateChange() == ItemEvent.SELECTED) {
							checkedList.add(selectNum);
						} else if (e.getStateChange() == ItemEvent.DESELECTED) {
							checkedList.remove(checkedList.indexOf(selectNum));
						}
						if (checkedList.size() > 1) {
							btEdit.setEnabled(false);
							btEdit.setToolTipText("수정할 데이터는 1개만 선택 해주세요");
							ToolTipManager m = ToolTipManager.sharedInstance();
							m.setInitialDelay(0);
						} else {
							btEdit.setEnabled(true);
						}
					}
				});
			}
			// -------------------------------------
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

//		// lblData 데이터정보 호출테스트.
//		for (JLabel c : lblDataList) {
//			System.out.println(c.getText());
//		}
//		// testing-------------------------

		pnlMain.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		pnlMain.add(pnlData);
		pnlData.setLayout(new BoxLayout(pnlData, BoxLayout.Y_AXIS));
		pnlBtn.setLayout(new GridLayout(0, 3, 0, 0));
		JScrollPane scrollPnl = new JScrollPane(pnlMain);

		getContentPane().add(scrollPnl);

		setSize(850, 850);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		////////////////////////// 창 열고 닫을 때, 버튼 활성<->비활성 체크
		////////////////////////// //////////////////////////////

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

		// 삭제 버튼 수정필수 *************************************
		ActionListener deleteAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에 삭제 쿼리문
			}
		};
		btDelete.addActionListener(deleteAction);
		// ------------------------------------------------

		scrollPnl.getVerticalScrollBar().setUnitIncrement(20);

		 
	}

}
