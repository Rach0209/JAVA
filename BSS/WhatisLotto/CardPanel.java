import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CardPanel extends JPanel {
	JPanel[] pnlResultBoxs;
	JLabel[] lblResults;
	JPanel[] pnlResultBtns;
	JButton[] btnResultInsts;
	JButton[] btnResultDels;
	JButton[] btnResultCopies;
	JPanel[] lblResultNums;
	private JLabel[][] iconlbls;

	public JPanel[] getPnlResultBoxs() {
		return pnlResultBoxs;
	}

	public JLabel[] getLblResults() {
		return lblResults;
	}

	public JPanel[] getPnlResultBtns() {
		return pnlResultBtns;
	}

	public JButton[] getBtnResultInsts() {
		return btnResultInsts;
	}

	public JButton[] getBtnResultDels() {
		return btnResultDels;
	}

	public JButton[] getBtnResultCopies() {
		return btnResultCopies;
	}

	public JPanel[] getLblResultNums() {
		return lblResultNums;
	}

	public void setPnlResultBoxs(JPanel[] pnlResultBoxs) {
		this.pnlResultBoxs = pnlResultBoxs;
	}

	public void setLblResults(JLabel[] lblResults) {
		this.lblResults = lblResults;
	}

	public void setPnlResultBtns(JPanel[] pnlResultBtns) {
		this.pnlResultBtns = pnlResultBtns;
	}

	public void setBtnResultInsts(JButton[] btnResultInsts) {
		this.btnResultInsts = btnResultInsts;
	}

	public void setBtnResultDels(JButton[] btnResultDels) {
		this.btnResultDels = btnResultDels;
	}

	public void setBtnResultCopies(JButton[] btnResultCopies) {
		this.btnResultCopies = btnResultCopies;
	}

	public void setLblResultNums(JPanel[] lblResultNums) {
		this.lblResultNums = lblResultNums;
	}

	CardPanel(String lottoType, List<JCheckBox> listOfChkBox, 
			List<List<Integer>> chBoxAll,JRadioButton rdbManual,
			JLabel lblNewLabel, JLabel lblWon) {
		
		
		BoxLayout boxResult = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(boxResult);

		// ???????????? ?????? ??????
		pnlResultBoxs = new JPanel[5];
		for (int i = 0; i < pnlResultBoxs.length; i++) {
			pnlResultBoxs[i] = new JPanel();
		}

		lblResults = new JLabel[5];
		for (int i = 0; i < lblResults.length; i++) {
			lblResults[i] = new JLabel((i + 1) + ". " + lottoType);
		}

		// ????????? ?????? ????????? ??????, ?????? , ?????? ?????? ????????? ????????? ?????? ??????
		pnlResultBtns = new JPanel[5];
		for (int i = 0; i < lblResults.length; i++) {
			pnlResultBtns[i] = new JPanel();
		}
		// ????????? ?????? ????????? ??????, ?????? , ?????? ?????? ??????
		btnResultInsts = new JButton[5];
		for (int i = 0; i < lblResults.length; i++) {
			btnResultInsts[i] = new JButton("??????");
		}
		btnResultDels = new JButton[5];
		for (int i = 0; i < lblResults.length; i++) {
			btnResultDels[i] = new JButton("??????");
		}
		btnResultCopies = new JButton[5];
		for (int i = 0; i < lblResults.length; i++) {
			btnResultCopies[i] = new JButton("?????? ??????");
		}

		// ????????? ????????? ???????????? ?????? ?????? ??????
		lblResultNums = new JPanel[5];
		setIconlbls(new JLabel[5][6]);
		for (int i = 0; i < getIconlbls().length; i++) {
			lblResultNums[i] = new JPanel();
			for (int j = 0; j < getIconlbls()[i].length; j++) {
				getIconlbls()[i][j] = new JLabel();
				lblResultNums[i].add(getIconlbls()[i][j]);
			}
		}

		for (int i = 0; i < pnlResultBoxs.length; i++) {
			add(pnlResultBoxs[i]);
			pnlResultBoxs[i].setLayout(new BorderLayout(0, 0));
			pnlResultBoxs[i].add(lblResults[i], BorderLayout.WEST);
			pnlResultBoxs[i].add(lblResultNums[i], BorderLayout.CENTER);
			pnlResultBtns[i].add(btnResultInsts[i]);
			pnlResultBtns[i].add(btnResultDels[i]);
			pnlResultBtns[i].add(btnResultCopies[i]);
			pnlResultBoxs[i].add(pnlResultBtns[i], BorderLayout.SOUTH);
		}

		// ?????? ?????? , ?????? ?????? , ???????????? ?????? ??????????????? ?????? ???????????? ?????????
		for (int i = 0; i < btnResultInsts.length; i++) {
			btnResultInsts[i].setEnabled(false);
			btnResultDels[i].setEnabled(false);
			btnResultCopies[i].setEnabled(false);
		}

		// '??????'??????

		for (int i = 0; i < btnResultInsts.length; i++) {
			// i??? ???????????? ????????????;;
			int index = i;

			btnResultInsts[index].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JCheckBox checkBox : listOfChkBox) {
						checkBox.setSelected(false);
					}
					for (int j = 0; j < chBoxAll.get(index).size(); j++) {
						List<Integer> list = chBoxAll.get(index);
						JCheckBox chkBox = listOfChkBox.get(list.get(j) - 1);
						chkBox.setSelected(true);
						// ????????????
						iconlbls[index][j].setIcon(null);
					}

					// ???????????????
					chBoxAll.set(index, new ArrayList<Integer>());

					// ????????? ?????? ?????? ??????(??????????????????)
					rdbManual.setSelected(true);

					// ????????? ???????????? ????????? ????????????
					for (int i = 0; i < btnResultInsts.length; i++) {
						if (chBoxAll.get(i).size() < 2) {
							btnResultInsts[i].setEnabled(false);
							btnResultDels[i].setEnabled(false);
							btnResultCopies[i].setEnabled(false);
						}
						if (!btnResultInsts[i].isSelected()) {
							btnResultInsts[i].setEnabled(false);
						}
					}
					Lotto.buyGameCount--;
					lblNewLabel.setText("?????? ?????? " + Lotto.buyGameCount);
					Lotto.gameMoney -= 1000;
					lblWon.setText(String.valueOf(Lotto.gameMoney) + "???");
					lblResults[index].setText((index + 1) + ". ?????????");
				}
			});
		}

		// '??????'??????
		for (int i = 0; i < btnResultDels.length; i++) {
			// i??? ???????????? ????????????;;
			int index = i;

			btnResultDels[index].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// ?????? ??????
					for (int j = 0; j < chBoxAll.get(index).size(); j++) {
						iconlbls[index][j].setIcon(null);
					}

					// ???????????????
					chBoxAll.set(index, new ArrayList<Integer>());

					// ????????? ???????????? ????????? ????????????
					for (int i = 0; i < btnResultInsts.length; i++) {
						if (chBoxAll.get(i).size() < 2) {
							btnResultInsts[i].setEnabled(false);
							btnResultDels[i].setEnabled(false);
							btnResultCopies[i].setEnabled(false);
						}
					}
					Lotto.buyGameCount--;
					lblNewLabel.setText("?????? ?????? " + Lotto.buyGameCount);
					Lotto.gameMoney -= 1000;
					lblWon.setText(String.valueOf(Lotto.gameMoney) + "???");
					lblResults[index].setText((index + 1) + ". ?????????");
				}
			});
		}

		// '????????????'??????
		for (int i = 0; i < btnResultCopies.length; i++) {
			// i??? ???????????? ????????????;;
			int index = i;

			btnResultCopies[index].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (JCheckBox checkBox : listOfChkBox) {
						checkBox.setSelected(false);
					}
					for (int j = 0; j < chBoxAll.get(index).size(); j++) {
						List<Integer> list = chBoxAll.get(index);
						JCheckBox chkBox = listOfChkBox.get(list.get(j) - 1);
						chkBox.setSelected(true);
					}
					rdbManual.setSelected(true);
				}
			});
		}
	}

	public JLabel[][] getIconlbls() {
		return iconlbls;
	}

	public void setIconlbls(JLabel[][] iconlbls) {
		this.iconlbls = iconlbls;
	}
}
