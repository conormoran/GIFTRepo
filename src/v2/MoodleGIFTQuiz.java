package v2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;

public class MoodleGIFTQuiz extends JFrame {

	private JPanel contentPane;
	static String gift = "";
	static JTextArea textArea;
	static AddQuestion addQ;
	static int num = 1;
	
	public MoodleGIFTQuiz() {
		setResizable(false);
		setTitle("GIFT Quiz Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 420);
		getContentPane().setLayout(new MigLayout("", "[800px][300px:n,grow]", "[][323px,grow][]"));
		
		JLabel lblNewLabel = new JLabel("Quiz Questions");
		getContentPane().add(lblNewLabel, "cell 0 0");
		
		JLabel lblGiftFile = new JLabel("GIFT File");
		getContentPane().add(lblGiftFile, "cell 1 0");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(scrollPane, "cell 0 1,grow");
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow]", "[]"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		getContentPane().add(scrollPane_1, "cell 1 1,grow");
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane_1.setViewportView(textArea);
		
		JButton btnAddQuestion = new JButton("Add Question");
		btnAddQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				addQ = new AddQuestion();
				addQ.setVisible(true);
			}
		});
		getContentPane().add(btnAddQuestion, "flowx,cell 0 2");
		
		JButton btnNewButton = new JButton("Save GIFT File");
		getContentPane().add(btnNewButton, "flowx,cell 1 2,alignx right");
		
		JButton btnClose = new JButton("Close");
		getContentPane().add(btnClose, "cell 1 2,alignx right");
	}
	
	public static void setText(String text) {
		gift = text;
		textArea.append(" " + gift + "\n\n");
		num++;
	}

}
