package v2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Action;

public class MoodleGIFTQuiz extends JFrame {

	private JPanel contentPane;
	static String gift = "";
	static JTextArea textArea;
	static AddQuestion addQ;
	static int num = 1;
	private final Action action = new SwingAction();
	
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
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				saveBActionPerformed();
				
				
//				//Opens filechooser
//				JFileChooser fc = new JFileChooser(JFileChooser.FILE_FILTER_CHANGED_PROPERTY); 
//				fc.setDialogTitle("Save .txt File");
//				
//				if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
//				{
//					//If they clicked yes call fileSaver method
//					fileSaver(fc);
//				}
//				else
//				{
//					//Show cancelled message
//					JOptionPane.showMessageDialog(this, "Save Cancelled.", "Word Replacer Application Save Cancelled", JOptionPane.WARNING_MESSAGE);
//				}
				
//				try	{
//					//String s = textArea.getText();
//					File f = new File("Quiz.gift");
//					FileWriter fw = new FileWriter(f);
//					fw.write(s);
//				} catch(IOException ioe) {
//					System.out.println("Exception Caught : " +ioe.getMessage());
//				}
			}
		});
		getContentPane().add(btnNewButton, "flowx,cell 1 2,alignx right");
	}
	
	public static void setText(String text) {
		gift = text;
		textArea.append(" " + gift + "\n\n");
		num++;
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private void saveBActionPerformed() //java.awt.event.ActionEvent evt
	{ 
		//Opens filechooser
		JFileChooser fc = new JFileChooser(JFileChooser.FILE_FILTER_CHANGED_PROPERTY); 
		fc.setDialogTitle("Save .gift File");
		
		if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
		{
			//If they clicked yes call fileSaver method
			fileSaver(fc);
		}
		else
		{
			//Show cancelled message
			JOptionPane.showMessageDialog(this, "Save Cancelled.", "Word Replacer Application Save Cancelled", JOptionPane.WARNING_MESSAGE);
		}
	}
	//End saveBActionPerformed
	
	private void fileSaver(JFileChooser fc)
	//Saves string to file, pass in FileChooser
	{
		File file = fc.getSelectedFile();
		String textToSave = textArea.getText();
		BufferedWriter writer = null;

		//Check for legal file extension (.gift)	
		String fileExtension = file.getPath();
		
		//Set extension to .gift if not already	
		if(!fileExtension.toLowerCase().endsWith(".gift"))
		{
			file = new File(fileExtension + ".gift");
		}
		
		try
		{
			writer = new BufferedWriter( new FileWriter(file));
			writer.write(textToSave); //.replaceAll("\n", System.getProperty("line.seperator")));
			
			JOptionPane.showMessageDialog(this, "Message saved. (" + file.getName() + ")", "Page Saved Successfully", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (IOException e)
		{ }

		//Close writer
		finally
		{
			try
			{
				if(writer != null)
				{
					writer.close();
				}
			}
			catch (IOException e)
			{e.printStackTrace(); }
		}
	}
	//End fileSaver
}
