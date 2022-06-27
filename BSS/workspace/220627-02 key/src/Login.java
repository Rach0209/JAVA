import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.USER_EXCEPTION;

// 회원 등록 프로그램
// 1. 비밀번호와 확인 일치
// ---------------------
// 2. 아이디와 비밀번호 입력 길이 = 4자 이상 12자 이하.
// 3. 이미 등록 아이디 -> X
class Member {
	private String id;
	private String password;

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class Login extends JFrame {
	Map<String, Member> user = new HashMap<>();

	void addUser(String id, String password) {
		Member newMember = new Member(id, password);
		user.put(id, newMember);
	}

	public Login() {
		// 존재 아이디 만들기
		Member member = new Member("qwer123", "q1w2e31");
		user.put("qwer123", member);

		CardLayout layout = new CardLayout();
		JPanel main = new JPanel(layout);

		// 첫번째 창. 로그인 화면
		JPanel pnl1 = makePanel("Please Login");
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);
		JButton btnLogin = new JButton("Login");
		JButton btnSignUp = new JButton("Sign Up");
		pnl1.add(tf);
		pnl1.add(pf);
		pnl1.add(btnLogin);
		pnl1.add(btnSignUp);

		// 두번째 창. 가입 화면
		JPanel pnl2 = makePanel("회원가입");
		JLabel lbl1 = new JLabel("아이디를 입력하세요.");
		JLabel lbl2 = new JLabel("비밀번호를 입력하세요.");
		JLabel lbl3 = new JLabel("확인을 위해 비밀번호를 다시 입력하세요.");
		JTextField makeId = new JTextField(10);
		JPasswordField makePf = new JPasswordField(10);
		JPasswordField checkPf = new JPasswordField(10);
		JButton btnSign = new JButton("가입하기");
		pnl2.add(lbl1);
		pnl2.add(makeId);
		pnl2.add(lbl2);
		pnl2.add(makePf);
		pnl2.add(lbl3);
		pnl2.add(checkPf);
		pnl2.add(btnSign);

		main.add(pnl1, "main");
		main.add(pnl2, "sign Up");

		ActionListener aListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 확인하기
				// 아이디 비밀번호 확인 검사후 성공 실패 메시지출력하기
				if (e.getActionCommand().equals("Login")) {
					if (user.containsKey(tf.getText())) {
						
						JOptionPane.showMessageDialog(Login.this, "로그인 성공");
					}
					JOptionPane.showMessageDialog(Login.this, "아이디 비밀번호를 확인하세요.");
				}
				// 회원가입 창으로 넘어가기
				if (e.getActionCommand().equals("Sign Up")) {
					layout.next(main);
				}
				if (e.getActionCommand().equals("가입하기")) {
					if (makeId.getText().length() >= 4 && makeId.getText().length() <= 12
							&& makePf.getText().length() >= 4 && makePf.getText().length() <= 12) {
						if (!makeId.getText().equals(member.getId()) && makePf.getText().equals(checkPf.getText()) && !makeId.getText().isEmpty() && !makePf.getText().isEmpty()) {
							addUser(makeId.getText(), makePf.getText());
							JOptionPane.showMessageDialog(Login.this, "가입 성공");
							layout.previous(main);
						} else if (makeId.getText().equals(member.getId())) {
							makeId.setText("");
							JOptionPane.showMessageDialog(Login.this, "중복된 아이디입니다.");
						} else if (!makePf.getText().equals(checkPf.getText())) {
							checkPf.setText("");
							JOptionPane.showMessageDialog(Login.this, "비밀번호 확인이 다릅니다.");
						} else if (makeId.getText().contains(null)) {
							JOptionPane.showMessageDialog(Login.this, "아이디를 입력하세요.");
						}
					} else {
						JOptionPane.showMessageDialog(Login.this, "아이디와 비밀번호는 4자리 이상 12자리 이하로 설정해주세요.");
					}
				}
			}
		};
		btnLogin.addActionListener(aListener);
		btnSignUp.addActionListener(aListener);
		btnSign.addActionListener(aListener);

		getContentPane().add(main);

		pack();
//		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.PAGE_AXIS));
		pnl.add(new JLabel(text));
		return pnl;

	}

	public static void main(String[] args) {
		new Login().setVisible(true);

	}

}
