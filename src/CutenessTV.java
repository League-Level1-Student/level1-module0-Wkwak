import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.showButton();
	}
	public void showButton(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		b1.setText("ducks");
		b2.setText("frog");
		b3.setText("fluffyUnicorns");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("ducks")) {
			showDucks();
		}
		if (e.getActionCommand().equals("frog")) {
			showFrog();
		}
		if (e.getActionCommand().equals("fluffyUnicorns")) {
			showFluffyUnicorns();
		}
	}
	
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
