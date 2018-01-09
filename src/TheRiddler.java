import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score=0;
	String question=JOptionPane.showInputDialog("You see me in water, but I never get wet. What am I?");
	if(question.equals("Reflection")) {
		JOptionPane.showMessageDialog(null, "Correct");
		score+=1;
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG");
		
	}
	String question=JOptionPane.showInputDialog("");
	if(question.equals("Reflection")) {
		JOptionPane.showMessageDialog(null, "Correct");
		score+=1;
	}
	else {
		JOptionPane.showMessageDialog(null, "WRONG");
}
}
