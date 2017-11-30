import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		String answer = "A coin.";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String guess= JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals(guess)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
			// 5. Otherwise, say "wrong" and tell them the answer
		} else{JOptionPane.showMessageDialog(null, "Too bad, try again.");}
		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You have a score of " + score + "!");
	}
}
