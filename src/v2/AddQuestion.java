package v2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import v2.TrueFalseEditor;

public class AddQuestion extends JFrame {
	String[] types = {"True/False", "Multiple Choice", "Match", "Essay"};
	
	private JPanel contentPane;
	TrueFalseEditor tfe1;

	public AddQuestion() {
		setResizable(false);
		setTitle("Add A Question");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 370, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblChooseQuestionType = new JLabel("Choose Question Type:");
		contentPane.add(lblChooseQuestionType, "cell 0 1,alignx trailing");
		
		final JComboBox<?> comboBox = new JComboBox<Object>(types);
		contentPane.add(comboBox, "cell 1 1,growx");
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		JButton btnCreateQuestion = new JButton("Create Question");
		btnCreateQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(comboBox.getSelectedItem() == "True/False") {
					tfe1 = new TrueFalseEditor();
					tfe1.setVisible(true);
					dispose();
				}
				else if(comboBox.getSelectedItem() == "Multiple Choice") {
					//tfe1 = new TrueFalseEditor();
					//tfe1.setVisible(true);
					dispose();
				}
				else if(comboBox.getSelectedItem() == "Match") {
					//tfe1 = new TrueFalseEditor();
					//tfe1.setVisible(true);
					dispose();
				}
				else if(comboBox.getSelectedItem() == "Essay") {
					//tfe1 = new TrueFalseEditor();
					//tfe1.setVisible(true);
					dispose();
				}
			}
		});
		contentPane.add(btnCreateQuestion, "flowx,cell 1 3,alignx right");
		contentPane.add(btnCancel, "cell 1 3,alignx right");
	}

}
