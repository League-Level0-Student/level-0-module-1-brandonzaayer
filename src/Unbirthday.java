import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		if (birthday.equals("November 29")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Merry unbirthday!");
		}
	}
}