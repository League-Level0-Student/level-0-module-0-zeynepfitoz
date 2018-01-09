import javax.swing.JOptionPane;

public class HappyUnbirthday {
public static void main(String[] args) {
	String question=JOptionPane.showInputDialog("When's your birthday");
			if(question.equals("01/08")) {
				JOptionPane.showMessageDialog(null,"Happy Birthday");
			}
			else {
				JOptionPane.showMessageDialog(null, "Happy Unbirthday");
			}
}
}
