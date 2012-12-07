package v2;

import javax.swing.UIManager;

import v2.MoodleGIFTQuiz;

public class Main {
	static MoodleGIFTQuiz mgq1;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
		
		
		mgq1 = new MoodleGIFTQuiz();	
		mgq1.setResizable(false);
		mgq1.setVisible(true);
	}
		
		
	public static void refreshFrame() {
		mgq1.revalidate();
		mgq1.repaint();
	}

}
