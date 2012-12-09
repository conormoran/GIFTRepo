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
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;

public class MultipleEditor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtTruefalse;
	private JTextField textField_2;
	QuestionPanel qp;
	
	String text = "";
	String title = "";
	String question = "";
	String answer1 = "";
	String fb1 = "";
	int correct1;
	int range1;
	String answer2 = "";
	String fb2 = "";
	int correct2;
	int range2;
	String answer3 = "";
	String fb3 = "";
	int correct3;
	int range3;
	String answer4 = "";
	String fb4 = "";
	int correct4;
	int range4;
	
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	public MultipleEditor() {
		setResizable(false);
		setTitle("Multiple Choice Question Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 680, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow 60]", "[][][][grow][::100px][]"));
		
		JLabel lblEditingQ = new JLabel("Editing Question:");
		contentPane.add(lblEditingQ, "cell 0 0,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		contentPane.add(textField_2, "cell 1 0,growx");
		textField_2.setColumns(10);
		
		JLabel lblQuestionType_1 = new JLabel("Question Type:");
		contentPane.add(lblQuestionType_1, "cell 0 1,alignx trailing");
		
		txtTruefalse = new JTextField();
		txtTruefalse.setText("Multiple Choice");
		txtTruefalse.setEditable(false);
		contentPane.add(txtTruefalse, "cell 1 1,growx");
		txtTruefalse.setColumns(10);
		
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane_1, "cell 1 4,grow");
		
		JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow][::70px][grow][fill]", "[22px][][][][][][]"));
		
		JLabel lblQuestionType = new JLabel("Answer:");
		panel.add(lblQuestionType, "cell 0 0,alignx left,aligny center");
		
		JLabel lblErrorRange = new JLabel("Error Range:");
		panel.add(lblErrorRange, "cell 1 0,alignx left,aligny center");
		
		JLabel lblFeedback = new JLabel("Feedback:");
		panel.add(lblFeedback, "cell 2 0,alignx left,aligny center");
		
		JLabel lblcorrect = new JLabel("%Correct:");
		panel.add(lblcorrect, "cell 3 0,alignx left,aligny center");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 0 1,growx,aligny top");
		textField_1.setColumns(10);
		
		textField_11 = new JTextField("0");
		textField_11.setHorizontalAlignment(textField_11.RIGHT);
		panel.add(textField_11, "cell 1 1,growx");
		textField_11.setColumns(10);
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 2 1,growx,aligny top");
		textField_3.setColumns(10);
		SpinnerModel model1 = new SpinnerNumberModel(100, 0, 100, 1);
		final JSpinner spinner = new JSpinner(model1);
		panel.add(spinner, "cell 3 1,alignx left,growy");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "cell 0 2,growx,aligny top");
		textField_4.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setHorizontalAlignment(textField_12.RIGHT);
		panel.add(textField_12, "cell 1 2,growx");
		textField_12.setColumns(10);
		
		textField_5 = new JTextField();
		panel.add(textField_5, "cell 2 2,growx,aligny top");
		textField_5.setColumns(10);
		SpinnerModel model2 = new SpinnerNumberModel(0, 0, 100, 1);
		final JSpinner spinner_1 = new JSpinner(model2);
		panel.add(spinner_1, "cell 3 2,alignx left,growy");
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setHorizontalAlignment(textField_13.RIGHT);
		panel.add(textField_13, "cell 1 3,growx");
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setHorizontalAlignment(textField_14.RIGHT);
		panel.add(textField_14, "cell 1 4,growx");
		textField_14.setColumns(10);
		
		textField_9 = new JTextField();
		panel.add(textField_9, "cell 2 4,growx");
		textField_9.setColumns(10);
		
		SpinnerModel model4 = new SpinnerNumberModel(0, 0, 100, 1);
		final JSpinner spinner_3 = new JSpinner(model4);
		panel.add(spinner_3, "cell 3 4,alignx left,growy");
		
		textField_8 = new JTextField();
		panel.add(textField_8, "cell 0 3,growx");
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		panel.add(textField_6, "cell 0 4,growx");
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		panel.add(textField_7, "cell 2 3,growx");
		textField_7.setColumns(10);
		
		SpinnerModel model3 = new SpinnerNumberModel(0, 0, 100, 1);
		final JSpinner spinner_2 = new JSpinner(model3);
		panel.add(spinner_2, "cell 3 3,alignx left,growy");
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		JButton btnSaveQuestion = new JButton("Save Question");
		btnSaveQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				title = textField.getText();
				question = textArea.getText();
				answer1 = textField_1.getText();
				answer2 = textField_4.getText();
				answer3 = textField_8.getText();
				answer4 = textField_6.getText();
				fb1 = textField_3.getText();
				fb2 = textField_5.getText();
				fb3 = textField_7.getText();
				fb4 = textField_9.getText();
				correct1 = (int) spinner.getValue();
				correct2 = (int) spinner_1.getValue();
				correct3 = (int) spinner_2.getValue();
				correct4 = (int) spinner_3.getValue();
				
				text = "::" + title + ":: " + question + " {# ="
						+ "%" + correct1 +"%" + answer1 + ":" + range1 + " # " + fb1
						+ "=%" + correct2 + "%" + answer2 + ":" + range2 + " # " + fb2
						+ "=%" + correct3 + "%" + answer3 + ":" + range3 + " # " + fb3
						+ "=%" + correct4 + "%" + answer4 + ":" + range4 + " # " + fb4
				+ " }";
				
				qp = new QuestionPanel();
				qp.setNum(1);
				qp.setTitle(title);
				qp.setType("Multiple Choice");
				qp.setQuestion(question);
				qp.setAns1(answer1);
				qp.setAns2(answer2);
				qp.setAns3(answer3);
				qp.setAns4(answer4);
				qp.setCorrect1(correct1);
				qp.setCorrect2(correct2);
				qp.setCorrect3(correct3);
				qp.setCorrect4(correct4);
				
				v2.MoodleGIFTQuiz.insertQuestionPanel(qp);
				
				v2.MoodleGIFTQuiz.setText(text);
				v2.Main.refreshFrame();
				dispose();
			}
			
		});
		contentPane.add(btnSaveQuestion, "flowx,cell 1 5,alignx right");
		contentPane.add(btnCancel, "cell 1 5,alignx right");
	}

}
