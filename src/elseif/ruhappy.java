package elseif;

import java.awt.DisplayMode;

import javax.swing.JOptionPane;

public class ruhappy {
	public static void main(String[] args) {
		int answer= JOptionPane.showConfirmDialog(null, "Are you happy?");
	
	if(answer==0) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if(answer==1) {
		JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
		if(answer==0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else if(answer==1) {
			JOptionPane.showMessageDialog(null, "Change Something.");
		}
	}
	
	}
}
