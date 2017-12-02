package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String horoscope = JOptionPane.showInputDialog("What zodiac sign are you?");
	if(horoscope.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. ");
	}
	else if (horoscope.equalsIgnoreCase("Taurus")) {
		JOptionPane.showInternalMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension. ");
	}
	else if (horoscope.equalsIgnoreCase("Gemini")) {
		JOptionPane.showInternalMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone. Gemini are never happier than when they are sharing ideas and concepts with someone else.");
	}
	else if (horoscope.equalsIgnoreCase("Cancer")) {
		JOptionPane.showInternalMessageDialog(null, "The crab symbolizes this sign for good reason. Just as the crab carries its own shell on its back, so too, does the typical cancerian…so to speak. ");
	}
	else if (horoscope.equalsIgnoreCase("Leo")) {
		JOptionPane.showInternalMessageDialog(null,"The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge. Leo people know they are in charge, even when it may seem outwardly that they are not.");
}
	else if (horoscope.equalsIgnoreCase("Virgo")) {
		JOptionPane.showInternalMessageDialog(null,"The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. ");
}
	else if (horoscope.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign");
	}
	else if (horoscope.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "The symbol for Scorpio is the scorpion. This creature was chosen because it typifies many of the characteristics of this sign. The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative.");
}
	else if (horoscope.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure. The centaur is shown with a bow, which he shoots.");
	}
	else if (horoscope.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "The mountain goat is the symbol for this sign because of the characteristic of the goat to climb higher and higher without losing his footing. Capricorn people are the type that are goal oriented and driven to succeed despite all odds. ");
	}
	else if (horoscope.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "The man who carries the pitcher of water is the symbol for this sign. This is because Aquarians are often generous with their time and resources. ");
	}
	else if (horoscope.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "The fish is the symbol given to this sign, primarily because fish live in a secretive and mysterious place. Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves. ");
	}
	else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
}
}
