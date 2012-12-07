package v2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class TrueFalseEditor extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField_2;
	
	String text = "";
	String title = "";
	String question = "";
	String answer = "";

	public TrueFalseEditor() {
		setTitle("True/False Question Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][grow][][]"));
		
		JLabel lblEditingQ = new JLabel("Editing Question:");
		contentPane.add(lblEditingQ, "cell 0 0,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		contentPane.add(textField_2, "cell 1 0,growx");
		textField_2.setColumns(10);
		
		JLabel lblQuestionType_1 = new JLabel("Question Type:");
		contentPane.add(lblQuestionType_1, "cell 0 1,alignx trailing");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		contentPane.add(textField_1, "cell 1 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblQuestionTitleoptional = new JLabel("Question Title (Optional):");
		contentPane.add(lblQuestionTitleoptional, "cell 0 2,alignx right");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 2,growx");
		textField.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Question:");
		contentPane.add(lblQuestion, "cell 0 3,alignx right,aligny top");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane, "cell 1 3,grow");
		
		final JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JLabel lblQuestionType = new JLabel("Answer:");
		contentPane.add(lblQuestionType, "cell 0 4,alignx right,aligny center");
		
		final JRadioButton rdbtnTrue = new JRadioButton("True");
		buttonGroup.add(rdbtnTrue);
		contentPane.add(rdbtnTrue, "flowx,cell 1 4");
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		buttonGroup.add(rdbtnFalse);
		contentPane.add(rdbtnFalse, "cell 1 4");
		
		JButton btnSaveQuestion = new JButton("Save Question");
		btnSaveQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				title = textField.getText();
				question = textArea.getText();
				if(rdbtnTrue.isSelected()) {
					answer = "{T}";
				}
				else {
					answer = "{F}";
				}
				
				//v1.GIFTQuizEditor.GIFTQuizEditor.textArea.append(title + question + answer));
				//parent textArea.setText(answer);
				text = "::" + title + ":: " + question + " " + answer;
				v2.MoodleGIFTQuiz.setText(text);
				v2.Main.refreshFrame();
				dispose();
			}
			
		});
		contentPane.add(btnSaveQuestion, "flowx,cell 1 5,alignx right");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 1 5,alignx right");
		
	}

}
