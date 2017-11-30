import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What is your zodiac symbol?");
	if (star.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "As The Moon enters your house today your head and heart\n will work together to bring you harmony " + 
				"The Moon enters\n Aries today, putting your heart and your head on the same side\n and bringing you a harmony within you thats been missing for\n a while. This means you can really start to think about what you\n want in your life and how youre going to get it. Your relationships\n will be easy going and your communication will flow easily,\n so make the most of this confident time.");
	}
	
	
	
}
}

