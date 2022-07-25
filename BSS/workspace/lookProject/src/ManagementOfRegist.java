import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ManagementOfRegist extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	ManagementOfRegist() {
		super("관리자용");
		JPanel pnlMain = new JPanel();

		getContentPane().add(pnlMain);
		pnlMain.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(290, 10, 230, 40);
		pnlMain.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblRegiEdit = new JLabel("의상 등록 & 수정");
		panel.add(lblRegiEdit, BorderLayout.CENTER);
		lblRegiEdit.setFont(new Font("휴먼편지체", Font.PLAIN, 30));
		lblRegiEdit.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel pnlLoadBtn = new JPanel();
		pnlLoadBtn.setBounds(183, 766, 230, 35);
		pnlMain.add(pnlLoadBtn);

		JButton btLoad = new JButton("불러오기");
		pnlLoadBtn.add(btLoad);

		JPanel pnlTab = new JPanel();
		pnlTab.setBounds(12, 60, 401, 696);
		pnlMain.add(pnlTab);
		pnlTab.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("굴림", Font.PLAIN, 15));
		tabbedPane.setBackground(Color.WHITE);
		pnlTab.add(tabbedPane);

		JPanel pnlTabTop = new JPanel();
		tabbedPane.addTab("상의", null, pnlTabTop, null);

		JPanel pnlTabBottom = new JPanel();
		tabbedPane.addTab("하의", null, pnlTabBottom, null);

		JPanel pnlTabBag = new JPanel();
		tabbedPane.addTab("가방", null, pnlTabBag, null);

		JPanel pnlTabShoes = new JPanel();
		tabbedPane.addTab("신발", null, pnlTabShoes, null);

		JPanel pnlTabAcc = new JPanel();
		tabbedPane.addTab("악세", null, pnlTabAcc, null);
		
		JPanel pnlRegiEditArea = new JPanel();
		pnlRegiEditArea.setBounds(425, 406, 397, 350);
		pnlMain.add(pnlRegiEditArea);

		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField_1 = new JTextField();

		JLabel lblSize = new JLabel("Size");
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField = new JTextField();

		JLabel lblColor = new JLabel("Color");
		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField_2 = new JTextField();

		JLabel lblCategory = new JLabel("Category");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField_3 = new JTextField();

		JLabel lblImage = new JLabel("Image");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField_4 = new JTextField();

		JLabel lblSeason = new JLabel("Season");
		lblSeason.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeason.setFont(new Font("궁서체", Font.ITALIC, 24));

		textField_5 = new JTextField();

		JButton btnRegist = new JButton("Regist");
		btnRegist.setFont(new Font("궁서체", Font.ITALIC, 20));
		pnlRegiEditArea.setLayout(new GridLayout(0, 2, 0, 0));
		pnlRegiEditArea.add(lblName);
		pnlRegiEditArea.add(textField_1);
		pnlRegiEditArea.add(lblSize);
		pnlRegiEditArea.add(textField);
		pnlRegiEditArea.add(lblColor);
		pnlRegiEditArea.add(textField_2);
		pnlRegiEditArea.add(lblCategory);
		pnlRegiEditArea.add(textField_3);
		pnlRegiEditArea.add(lblImage);
		pnlRegiEditArea.add(textField_4);
		pnlRegiEditArea.add(lblSeason);
		pnlRegiEditArea.add(textField_5);
		// 공백 라벨
		JLabel label_14 = new JLabel("");
		pnlRegiEditArea.add(label_14);
		pnlRegiEditArea.add(btnRegist);
		// 공백 라벨
		JLabel label_13 = new JLabel("");
		pnlRegiEditArea.add(label_13);

		JPanel pnlHelp = new JPanel();
		pnlHelp.setBounds(425, 60, 397, 335);
		pnlMain.add(pnlHelp);
		pnlHelp.setLayout(new BoxLayout(pnlHelp, BoxLayout.Y_AXIS));

		JLabel lblHelp = new JLabel("사용 설명서");
		pnlHelp.add(lblHelp);

		JLabel lblHelpName = new JLabel("Name : 상품명");
		pnlHelp.add(lblHelpName);

		JLabel lblHelpSize = new JLabel("Size : 상품 사이즈");
		pnlHelp.add(lblHelpSize);

		JLabel lblHelpColor = new JLabel("Color : 상품 색상");
		pnlHelp.add(lblHelpColor);

		JLabel lblHelpCategory = new JLabel("Category : 상품 카테고리");
		pnlHelp.add(lblHelpCategory);

		JLabel lblHelpImage = new JLabel("Image : 상품 이미지경로");
		pnlHelp.add(lblHelpImage);

		JLabel lblHelpSeason = new JLabel("Season : 상품 시즌");
		pnlHelp.add(lblHelpSeason);
		setSize(850, 850);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
