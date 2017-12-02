package elseif;
import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What is your zodiac symbol?");
	if (star.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "As The Moon enters your house today your head and heart\n will work together to bring you harmony " + 
				"The Moon enters\n Aries today, putting your heart and your head on the same side\n and bringing you a harmony within you thats been missing for\n a while. This means you can really start to think about what you\n want in your life and how youre going to get it. Your relationships\n will be easy going and your communication will flow easily,\n so make the most of this confident time.");
	}
	else if (star.equalsIgnoreCase("Tarus")) {
		JOptionPane.showMessageDialog(null, 
				"Many different things appeal and making a firm commitment to one path or course of\n"
				+ "action troublesome. Surrendering to the flow of the group or another's choice may\n"
				+ " seem like a cop-out at first but is probably less bothersome in the end. Jupiter\n"
				+ " is still nevertheless lucky in the seventh house. Youve probably shut yourself off\n"
				+ " from your innate sensitivity through fear of being hurt. Someone may give you the\n"
				+ " opportunity to restore self-confidence and that brings a renewed trust in life generally\n."
				+ " Remember, the company you keep is important and that hanging around a cripple too long\n"
				+ " may cause you to develop a limp.");
	}
	else if (star.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, 
				"You 're more in tune with your friends and social networking during\n"
				+ " this period but the Mars and Uranus opposition can create tension \n"
				+ "and challenges at the same time. Against the backdrop of Saturn's \n"
				+ "continued transit in your seventh house of relationships, you may \n"
				+ "be using love as a means of escape rather than a true connection at \n"
				+ "the heart level. Monitor this as this can have negative consequences\n "
				+ "down the track when you least expect it. If you're working on building\n "
				+ "an independent business, you may find there's an opportunity to increase\n "
				+ "your profitability from a few different streams of income. Investigate what's on offer.");
		}
	else if 	(star.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, 
				"Don't leave routine to chance today as you have a lot on your plate both.\n"
				+ " Prepare methodically and double-check your appointment times are on schedule.\n"
				+ " Punctuality is also a keyword today. It's one of those days where you cant quite\n"
				+ " balance personal and professional life. Youll have to be creative in how you do this.\n"
				+ " Dealing with another persons depression or sad story will also be an additional issue \n"
				+ "that could weigh you down. Exhaustion is setting in but you're covering it up for some\n"
				+ " reason. No one even suspects that you're playing the martyr because they can't see the\n"
				+ " inner turmoil you may be going through now.");
		}
	else if 	(star.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null,
				"Protecting what's yours is important during this period but taking \n"
				+ "a pre-emptive approach may not necessarily work for you. For some \n"
				+ "reason, you have recently become less trusting of others and this could \n"
				+ "have a negative reaction, in that you may be passing people by. Before \n"
				+ "making severe judgements of others try to listen to what they have to say.\n"
				+ " Its time to let your hair down and mix with some friends. Get away from work\n"
				+ " and all those heavy topics that have been weighing you down. By forgetting some\n"
				+ " of your problems you actually create the space necessary for the solutions to appear, \n"
				+ "almost as if by magic.");
		}
	else if(star.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, 
				"You do have a weak point today: you become so engrossed\n"
				+ " in your mundane tasks that you don't take the time to understand\n"
				+ " or reflect upon your experience. Really appreciating what IS happening\n"
				+ "to you is the secret of life and happiness. Smell the roses today and by \n"
				+ "all means, work hard to achieve your goal but don't forget about now and \n"
				+ "limit your experience of life. You don't necessarily need to go anywhere \n"
				+ "just now to feel happy. This habit of running here, there and everywhere \n"
				+ "is simply a distraction from the fact that you may not have enough to keep \n"
				+ "you occupied and satisfied within the confines of your own home.");
		}
	else if (star.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, 
				"You've probably got more commitments than you know what to\n"
				+ " do with right now, so taking on a huge pile of extra work\n"
				+ " may be unwise. Find time to unwind, connect with your nearest\n"
				+ " and dearest and work out what you want to do with your life next\n"
				+ " year. Work continues to dominate your mind with Jupiter activating\n"
				+ " contracts, negotiations and a new spin on the way you communicate \n"
				+ "ideas on a day by day basis. But dont let your ego simply revel in \n"
				+ "praise for a job well done. You need to practically use the information\n"
				+ " you gain along with the assistance of others to get a leg up and move to\n"
				+ " the next level of your professional plan.");
		}
	else if 	(star.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, 
				"Be firm when you air your grievances to a person who's been turning\n"
				+ " your world upside-down. They may not even know. If youre purchasing\n"
				+ " items for the home, it might be best to lay-by rather than spend a huge\n"
				+ " amount in one go. You can stagger the payments and continue enjoying the\n"
				+ " lifestyle you have. You may have holidays on your mind now and it is most\n"
				+ " certainly the time to make plans and bookings as well. If youre lazy you may\n"
				+ " miss the boat so try to do tomorrows tasks today and todays immediately so that\n"
				+ " you wont be disappointed in this respect. You may receive some confusing email or\n"
				+ " notice which requires investigation.");
		}
	else if (star.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "No horoscope available");}
	else if (star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, " No horoscope available");}
	else if (star.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, " No horoscope available");}
	else if (star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, 
				"Work can get you down but only if you're not using your creativity\n"
				+ " to find different solutions to age-old problems. You could be stuck\n"
				+ " in a rut and working with the same old people who aren't exactly reciprocating\n"
				+ " the right sort of energy to you. You have to take the initiative to change if you\n"
				+ " want work to change as well. Keep your compass pointing north today and don't get \n"
				+ "sidetracked. Positive developments professionally through your family's help and support\n"
				+ " (both emotional and financial) lead to breakthroughs now. If you're considering\n"
				+ " pooling your resources with someone else, it's a good time to do so.");}
	else JOptionPane.showMessageDialog(null, "That's not a horoscope symbol.");
}
}

