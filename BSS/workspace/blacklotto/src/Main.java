import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

class LottoLayout extends JFrame {
	// private static final ActionListener ActionListener = null;
	private HashMap<Integer, ArrayList<Integer>> map_selectedNum = new HashMap<Integer, ArrayList<Integer>>();
	// 초기화시에 전체 center panel에 접근하기 위한 전역 변수.
	private ArrayList<ArrayList<JCheckBox>> allCheckBoxList = new ArrayList<ArrayList<JCheckBox>>();
	private ArrayList<ButtonGroup> allButtonGroup = new ArrayList<ButtonGroup>();
	private int times;

	int chkCount = 0; // 체크박스 체크 된 갯수 count
	int price = 5000; // 구매금액 5000원부터 시작해서 1000원씩 감소
	int no = 0; // 선택안함 버튼 누른 갯수
	JLabel lblPrice = new JLabel();

	public LottoLayout() {
		super("나눔로또");

		JPanel pnlLotto = new JPanel(new BorderLayout());
		JPanel pnlNorth = new JPanel(); // 이미지 들어갈 곳
		JPanel pnlCenter = new JPanel(new FlowLayout()); // 중앙
		JPanel pnlSouth = new JPanel(); // 버튼들

		ButtonGroup btnGroup = new ButtonGroup();
		JButton btnResultConfirm = new JButton("결과 확인");
		JButton btnReset = new JButton("초기화");
		btnResultConfirm.setBounds(150, 150, 100, 100);
		btnReset.setBounds(150, 150, 100, 100);

		getContentPane().setLayout(new FlowLayout());
		btnResultConfirm.setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout());
		btnReset.setBackground(Color.LIGHT_GRAY);

		getContentPane().setLayout(new FlowLayout());

		lblPrice.setBackground(Color.LIGHT_GRAY);

		btnGroup.add(btnResultConfirm);
		btnGroup.add(btnReset);

		pnlSouth.add(btnResultConfirm);
		pnlSouth.add(btnReset);

		pnlSouth.add(lblPrice);

		btnResultConfirm.addActionListener(btnResultConfirm_onClick(btnResultConfirm, this));
		btnReset.addActionListener(btnReset_onClick(btnReset));

		add(pnlSouth);

		for (int i = 0; i < 5; i++) {
			pnlCenter.add(getLottoPnl());
		}
		pnlLotto.add(pnlCenter, "Center");
		pnlLotto.add(pnlNorth, "North");
		pnlLotto.add(pnlSouth, "South");

		pnlLotto.setBackground(Color.white);
		pnlCenter.setOpaque(false);
		pnlNorth.setOpaque(false);
		pnlSouth.setOpaque(false);

		setContentPane(pnlLotto);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image imgage = toolkit.getImage("lotto.png");
		Image scaled = imgage.getScaledInstance(580, 158, Image.SCALE_DEFAULT);

		JLabel lblImage = new JLabel(new ImageIcon(scaled));
		add(lblImage, "North");

		pack();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 로또용지 메소드 시작
	private JPanel getLottoPnl() {
		int keyNum = map_selectedNum.size();
		ArrayList<Integer> arr_selectedNum = new ArrayList<Integer>();

		if (map_selectedNum.containsKey(keyNum)) {
			map_selectedNum.replace(keyNum, arr_selectedNum);
		} else {
			map_selectedNum.put(keyNum, arr_selectedNum);
		}

		// 버튼 생성
		JPanel pnl = new JPanel(new BorderLayout());
		pnl.setBorder(new LineBorder(Color.BLACK));

		JPanel pnlButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JRadioButton rBtnAuto = new JRadioButton("자동");
		JRadioButton rBtnManual = new JRadioButton("수동");
		JRadioButton rBtnNo = new JRadioButton("선택안함");

		// 선택안함일때 count되는 ItemListener
		rBtnNo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					no++;
				} else if (state == ItemEvent.DESELECTED) {
					no--;
				}
			}
		});

		JRadioButton rBtnHalf = new JRadioButton("반자동");
		rBtnHalf.setToolTipText("45개의 번호 중 1개 또는 6개 미만의 번호를 선택한 후 누르면 내가 선택하지 않은 나머지 번호는 임의의 번호로 자동 선택합니다.");
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rBtnAuto);
		bGroup.add(rBtnManual);
		bGroup.add(rBtnNo);
		bGroup.add(rBtnHalf);

		// 초기화 클릭이벤트에서 default로 수동을 선택하게 하기위해 접근가능한 List에 담아두기
		allButtonGroup.add(bGroup);

		rBtnNo.addItemListener(lottox());

		pnlButton.add(rBtnAuto);
		pnlButton.add(rBtnManual);
		pnlButton.add(rBtnHalf);
		pnlButton.add(rBtnNo);
		rBtnHalf.setEnabled(false);
		pnl.add(pnlButton, "North"); // 북쪽에 번호

		// 선택안함을 default로
		rBtnNo.setSelected(true);

		// 결제 금액
		pnlButton.add(rBtnNo);

		add(pnl);

		// 번호 체크박스 생성
		JPanel pnlNumber = new JPanel(new GridLayout(0, 5));
		ArrayList<JCheckBox> listChkBox = new ArrayList<JCheckBox>();
		JLabel lblCount = new JLabel();
		for (int i = 1; i <= 45; i++) {
			JCheckBox chkBox = new JCheckBox(String.valueOf(i));
			chkBox.setFont(new Font("PLAIN", Font.CENTER_BASELINE, 15));
			chkBox.addActionListener(checkboxOnClick(chkBox, arr_selectedNum, rBtnHalf));
			chkBox.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					int state = e.getStateChange();
					int selectedNum = Integer.parseInt(chkBox.getText()) - 1; // 배열은 0부터 시작, getText는 1부터 시작하기때문에 -1
					if (state == ItemEvent.SELECTED) {
						if (arr_selectedNum.size() <= 6) {
							arr_selectedNum.add(selectedNum + 1);
							chkCount = arr_selectedNum.size();
						}
//                  chkBox.setForeground(Color.red);
						chkBox.setBackground(Color.orange);
//                  chkBox.setForeground(Color.MAGENTA);
					} else if (state == ItemEvent.DESELECTED) {

						// 배열의 값이 int형이라 값으로 삭제가 불가능하여 이를 하나씩 비교하여 인덱스로 삭제
						for (int i = 0; i < arr_selectedNum.size(); i++) {
							if (selectedNum + 1 == arr_selectedNum.get(i)) {
								arr_selectedNum.remove(i);
								chkCount = arr_selectedNum.size();
							}
						}
//                  chkBox.setForeground(Color.black);
						Color c = UIManager.getColor("CheckBox.background");

						chkBox.setBackground(c);
						chkBox.setForeground(Color.black);
					}

					Collections.sort(arr_selectedNum);
					lblCount.setText("선택 개수 : " + String.valueOf(chkCount));
					if (chkCount < 6) {
						lblCount.setForeground(Color.red);
					} else {
						lblCount.setForeground(Color.black);
					}
				}

			});
			lblCount.setText("선택 개수 : " + String.valueOf(chkCount));
			if (chkCount < 6) {
				lblCount.setForeground(Color.red);
			} else {
				lblCount.setForeground(Color.black);
			}

			pnlNumber.add(chkBox);
			listChkBox.add(chkBox);
			pnl.add(lblCount, "South");
			allCheckBoxList.add(listChkBox);
			chkBox.setEnabled(false);
		}

		// 자동버튼
		pnl.add(pnlNumber, "Center");
		ActionListener actionClick = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rBtnAuto.equals(e.getSource())) {
					for (int i = 0; i < listChkBox.size(); i++) {
						listChkBox.get(i).setSelected(false);
					}
					arr_selectedNum.clear();
					while (true) {
						if (arr_selectedNum.size() == 6) {
							for (JCheckBox lottoNum : listChkBox) {
//                        lottoNum.setEnabled(lottoNum.isSelected());
							}
							break;
						} else {
							int lottoNum = (int) (Math.random() * 45);
							JCheckBox chkBox = listChkBox.get(lottoNum);
							chkBox.setSelected(true);
						}
					}
				}
				Collections.sort(arr_selectedNum);
			}

		};

		rBtnAuto.addActionListener(actionClick);
		rBtnManual.addItemListener(lottoManual(listChkBox, arr_selectedNum, rBtnHalf));
		rBtnHalf.addItemListener(lottoHalf(listChkBox, arr_selectedNum));
		rBtnNo.addItemListener(lottoNo(listChkBox, arr_selectedNum));

		return pnl;
	}

	// 반자동 버튼
	private ItemListener lottoHalf(ArrayList<JCheckBox> listChkBox, ArrayList<Integer> arr_selectedNum) {
		return new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					while (true) {
						if (arr_selectedNum.size() == 6) {
							break;
						} else {
							int lottoNum = (int) (Math.random() * 45);
							JCheckBox chkBox = listChkBox.get(lottoNum);
							chkBox.setSelected(true);
						}
					}
					// 체크박스 비활성화
					for (int i = 0; i < listChkBox.size(); i++) {
						listChkBox.get(i).setEnabled(true);
					}

				}
				Collections.sort(arr_selectedNum);
			}

		};
	}

	// 수동 버튼
	private ItemListener lottoManual(ArrayList<JCheckBox> listChkBox, ArrayList<Integer> arr_selectedNum,
			JRadioButton rBtnHalf) {
		return new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					for (JCheckBox chkBox : listChkBox) {
						chkBox.setEnabled(true);
						chkBox.setSelected(false);
					}
				} else if (state == ItemEvent.DESELECTED) {
					for (JCheckBox chkBox : listChkBox) {
						chkBox.setEnabled(false);
						rBtnHalf.setEnabled(false);

					}
				}

			}
		};

	}

	// 선택 안 함
	private ItemListener lottoNo(ArrayList<JCheckBox> listChkBox, ArrayList<Integer> arr_selectedNum) {
		return new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					for (JCheckBox chkBox : listChkBox) {
						chkBox.setEnabled(false);
						chkBox.setSelected(false);
					}
				}
				arr_selectedNum.clear();
			}
		};
	}

	// 각 번호별 checkbox click event
	private ActionListener checkboxOnClick(JCheckBox chkBox, ArrayList<Integer> arr_selectedNum,
			JRadioButton rBtnHalf) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 6개 이상 선택시 발생
				if (arr_selectedNum.size() > 6) {
					chkBox.setSelected(false);
					JOptionPane.showMessageDialog(null, "6개 선택 가능");
				} else if (arr_selectedNum.size() == 7) {
					arr_selectedNum.remove(7);
				}
				// 반자동 버튼은 체크박스가 1~5개일때만 활성화
				rBtnHalf.setEnabled((arr_selectedNum.size() < 6 && arr_selectedNum.size() > 0));

			}
		};
	}

	// 결과확인 버튼 클릭 이벤트
	private ActionListener btnResultConfirm_onClick(JButton btnResultConfirm, LottoLayout lotto) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean isComplete = true;
				System.out.println(map_selectedNum.size());
				for (int i = 0; i < map_selectedNum.size(); i++) {
					ArrayList<Integer> list_selectedNum = map_selectedNum.get(i);
					ArrayList<AbstractButton> list = Collections.list(allButtonGroup.get(i).getElements());
					// 배열상 0번째는 자동, 1번째는 수동, 2번째는 선택안함 3번째는 반자동으로 들어가 있음.
					if (list_selectedNum.size() < 6 && !list.get(2).isSelected()) {
						JOptionPane.showMessageDialog(null, "6개를 입력해주세요.");
						isComplete = false;
						break;
					}
					if (no == 5) {
						JOptionPane.showMessageDialog(null, "한 장은 사야지....?");
						isComplete = false;
						break;
					}
				}
				if (isComplete) {
					new frame(lotto);
				}

			}

		};

	};

	// 초기화 버튼 클릭 이벤트
	private ActionListener btnReset_onClick(JButton btnReset) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < allButtonGroup.size(); i++) {
					ArrayList<AbstractButton> list = Collections.list(allButtonGroup.get(i).getElements());
					// 배열상 0번째는 자동, 1번째는 수동, 2번째는 선택안함 으로 들어가 있음.
					list.get(2).setSelected(true);
				}
				// 전체 checkbox에서 선택된 대상을 unselect 처리한다.
				for (int i = 0; i < allCheckBoxList.size(); i++) {
					for (int j = 0; j < allCheckBoxList.get(i).size(); j++) {
						if (allCheckBoxList.get(i).get(j).isSelected()) {
							allCheckBoxList.get(i).get(j).setSelected(false);
						}
					}
				}
			}
		};
	}

	// 가격계산
	private ItemListener lottox() {
		return new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					price -= 1000;
				} else if (state == ItemEvent.DESELECTED) {
					price += 1000;
				}
				lblPrice.setText(String.valueOf(("총 가격 " + price) + "원"));

			}
		};

	}

	public ArrayList<ButtonGroup> getAllButtonGroup() {
		return allButtonGroup;
	}

	public int getMapSize() {
		return this.times;
	}

	public ArrayList<Integer> getList(int mapIdx) {
		try {
			return map_selectedNum.get(mapIdx);
		} catch (Exception e) {
			return null;
		}
	}

}

public class Main {
	public static void main(String[] args) {
		new LottoLayout().setVisible(true);

	}
}