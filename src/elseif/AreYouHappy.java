package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String one = JOptionPane.showInputDialog("Are you happy?");
	if (one.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	String x="";
	 if (one.equalsIgnoreCase("No")) {
		 x = JOptionPane.showInputDialog("Do you want to be happy?");
	}
	  if (x.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	 else if (x.equalsIgnoreCase("Yes")) {
		 JOptionPane.showMessageDialog(null, "Change something.");
	 }
}
}
