import javax.swing.JOptionPane;

public class EveryIsAwesome {
public static void main(String[] args) {
	String question=JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, question+" are awesome");
}
}
