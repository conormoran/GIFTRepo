package v2;

import v2.MoodleGIFTQuiz;

public class Main {
	static MoodleGIFTQuiz mgq1;
	
	public static void Main(String[] args) {
		mgq1 = new MoodleGIFTQuiz();	
		mgq1.setResizable(false);
		mgq1.setVisible(true);
	}
		
		
	public static void refreshFrame() {
		mgq1.revalidate();
		mgq1.repaint();
	}

}
