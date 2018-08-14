import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}
	
	public void showButton() {
		System.out.print("Button clicked");

		JFrame frame = new JFrame();
		frame.setSize(200,200);
		frame.setVisible(true);
		
		JButton button = new JButton();
		frame.add(button);
	
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		
		int rand = new Random().nextInt(5);
		
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will become rich");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will invest in stock and become bankrupt");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will run out of tissues");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "nothing will happen");
		}
	}
		
}
