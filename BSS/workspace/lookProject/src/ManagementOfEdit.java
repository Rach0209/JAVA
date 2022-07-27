import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ManagementOfEdit extends JFrame {
	private JTextField tfSize;
	private JTextField tfName;
	private JTextField tfColor;
	private JTextField tfCategory;
	private JTextField tfImage;
	private JTextField tfSeason;

	ManagementOfEdit() {
		super("관리자용 데이터 수정");
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
		pnlLoadBtn.setBounds(183, 637, 230, 35);
		pnlMain.add(pnlLoadBtn);

		JButton btLoad = new JButton("이미지 불러오기");
		pnlLoadBtn.add(btLoad);

		JPanel pnlImage = new JPanel();
		pnlImage.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlImage.setBounds(12, 60, 401, 567);
		pnlMain.add(pnlImage);
		pnlImage.setLayout(new BorderLayout(0, 0));

		JLabel lblImageDisplay = new JLabel("");
		lblImageDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		pnlImage.add(lblImageDisplay, BorderLayout.NORTH);

		JPanel pnlRegiEditArea = new JPanel();
		pnlRegiEditArea.setBounds(425, 356, 397, 271);
		pnlMain.add(pnlRegiEditArea);

		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfName = new JTextField();

		JLabel lblSize = new JLabel("Size");
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfSize = new JTextField();

		JLabel lblColor = new JLabel("Color");
		lblColor.setHorizontalAlignment(SwingConstants.CENTER);
		lblColor.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfColor = new JTextField();

		JLabel lblCategory = new JLabel("Category");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfCategory = new JTextField();

		JLabel lblImage = new JLabel("Image");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfImage = new JTextField();

		JLabel lblSeason = new JLabel("Season");
		lblSeason.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeason.setFont(new Font("궁서체", Font.ITALIC, 24));

		tfSeason = new JTextField();

		JButton btnRegist = new JButton("Regist");
		btnRegist.setFont(new Font("궁서체", Font.ITALIC, 20));
		pnlRegiEditArea.setLayout(new GridLayout(0, 2, 0, 3));
		pnlRegiEditArea.add(lblName);
		pnlRegiEditArea.add(tfName);
		pnlRegiEditArea.add(lblSize);
		pnlRegiEditArea.add(tfSize);
		pnlRegiEditArea.add(lblColor);
		pnlRegiEditArea.add(tfColor);
		pnlRegiEditArea.add(lblCategory);
		pnlRegiEditArea.add(tfCategory);
		pnlRegiEditArea.add(lblImage);
		pnlRegiEditArea.add(tfImage);
		pnlRegiEditArea.add(lblSeason);
		pnlRegiEditArea.add(tfSeason);
		// 공백 라벨
		JLabel lblBlank = new JLabel("");
		pnlRegiEditArea.add(lblBlank);
		pnlRegiEditArea.add(btnRegist);

		JPanel pnlHelp = new JPanel();
		pnlHelp.setBounds(425, 60, 397, 286);
		pnlMain.add(pnlHelp);
		pnlHelp.setLayout(new GridLayout(7, 0, 0, 0));

		JLabel lblHelp = new JLabel("사용 설명서");
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelp);

		JLabel lblHelpName = new JLabel("Name : 상품명");
		lblHelpName.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpName);

		JLabel lblHelpSize = new JLabel("Size : 상품 사이즈");
		lblHelpSize.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpSize);

		JLabel lblHelpColor = new JLabel("Color : 상품 색상");
		lblHelpColor.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpColor);

		JLabel lblHelpCategory = new JLabel("Category : 상품 카테고리");
		lblHelpCategory.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpCategory);

		JLabel lblHelpImage = new JLabel("Image : 상품 이미지경로");
		lblHelpImage.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpImage);

		JLabel lblHelpSeason = new JLabel("Season : 상품 시즌");
		lblHelpSeason.setHorizontalAlignment(SwingConstants.CENTER);
		pnlHelp.add(lblHelpSeason);
		setSize(850, 780);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

//////////////////////////////////////////////////////////////////////////////////
		// 처음 창이 열리면 기본 정보가 자동으로 입력되게 만들기. windowListener를 사용할 듯함.
		
		// 사진 수정하려면 불러와야됨.
		JFileChooser chooser = new JFileChooser();

		btLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showOpenDialog(pnlMain);

				if (result == JFileChooser.APPROVE_OPTION) {
					String path = chooser.getSelectedFile().getAbsolutePath();
					ImageIcon image = new ImageIcon(path);
					lblImageDisplay.setIcon(scaleImage(image));
					tfImage.setText(path);
				}
			}
		});
		
		// Regist버튼 => 수정값으로 DB의 데이터 바꾸기.
		btnRegist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	// 사진 사이즈 조절
	public ImageIcon scaleImage(ImageIcon icon) {
		return new ImageIcon(
				icon.getImage().getScaledInstance((int) (401 / 1.2), (int) (567 / 1.2), Image.SCALE_DEFAULT));
	}
}
