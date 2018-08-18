import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	public static void main(String[] args) {
		SoundEffectsMachine sf = new SoundEffectsMachine();
		sf.showButton();
	}
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Sound Effects Machine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		button1.setText("Random Sound");
		button2.setText("The Better Random Sound");
		
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("Random Sound")) {
			playSound("drum2.wav");
		}
		if (e.getActionCommand().equals("The Better Random Sound")) {
			playSound("bing.wav");
		}
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
