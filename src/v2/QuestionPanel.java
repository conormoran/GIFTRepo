package v2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class QuestionPanel extends JPanel {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextArea textArea;
	
	String qNum;

	public QuestionPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "qNum", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow][::80px,grow,fill]", "[][][grow][][][][][][grow,fill]"));
		
		JLabel label = new JLabel("Title:");
		panel.add(label, "cell 0 0,alignx right");
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		panel.add(textField, "cell 1 0 2 1,growx");
		
		JLabel label_1 = new JLabel("Type:");
		panel.add(label_1, "cell 0 1,alignx right");
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 1 1 2 1,growx");
		
		JLabel label_2 = new JLabel("Question:");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label_2, "cell 0 2,alignx right,aligny top");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane, "cell 1 2 2 1,grow");
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setRows(3);
		textArea.setLineWrap(true);
		
		JLabel label_3 = new JLabel("Answer:");
		panel.add(label_3, "cell 1 3,alignx left");
		
		JLabel lblcorrect = new JLabel("%Correct:");
		panel.add(lblcorrect, "cell 2 3");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		panel.add(textField_2, "cell 1 4,growx");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel.add(textField_3, "cell 2 4,growx");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel.add(textField_4, "cell 1 5,growx");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel.add(textField_5, "cell 2 5,growx");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		panel.add(textField_6, "cell 1 6,growx");
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		panel.add(textField_7, "cell 2 6,growx");
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		panel.add(textField_8, "cell 1 7,growx");
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		panel.add(textField_9, "cell 2 7,growx");
		textField_9.setColumns(10);
		
		JButton button = new JButton("Edit");
		panel.add(button, "flowx,cell 1 8 2 1,alignx right");
		
		JButton button_1 = new JButton("Delete");
		panel.add(button_1, "cell 1 8,alignx right");

	}
	
	public void setNum(int n) {
		qNum = "Q" + n;
	}

	public void setTitle(String t) {
		textField.setText(t);
	}
	
	public void setType(String y) {
		textField_1.setText(y);
	}
	
	public void setQuestion(String q) {
		textArea.setText(q);
	}
	
	public void setAns1(String a1) {
		textField_2.setText(a1);
	}
	
	public void setAns2(String a2) {
		textField_4.setText(a2);
	}

	public void setAns3(String a3) {
		textField_6.setText(a3);
	}

	public void setAns4(String a4) {
		textField_8.setText(a4);
	}

	public void setCorrect1(int c1) {
		textField_3.setText("" + c1);
	}
	
	public void setCorrect2(int c2) {
		textField_5.setText("" + c2);
	}
	
	public void setCorrect3(int c3) {
		textField_7.setText("" + c3);
	}
	
	public void setCorrect4(int c4) {
		textField_9.setText("" + c4);
	}
	
}
