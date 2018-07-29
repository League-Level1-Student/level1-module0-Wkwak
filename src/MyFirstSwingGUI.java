/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
		JFrame obj1 = new JFrame();

		//2. Set your JFrame object to be visible
		obj1.setVisible(true);
		//3. Run your program. Do you see your window? It's probably very small.
		
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//5. Create and initialize an object of the JPanel class
		JPanel obj2 = new JPanel();
		//6. Create and initialize an object of the JLabel class
		JLabel obj3 = new JLabel();
		//7. Set the text of the JLabel to a lovely greeting.
		obj3.setText("Hello There");
		//8. Add the JPanel object to the JFrame
		obj1.add(obj2);
		//9. Add the JLabel object to the JPanel
		obj2.add(obj3);
		//10. Pack your JFrame.
		//11. Run your program again. Do you see your message.
		
		//12. Use the loadImage method to set the icon of the JLabel object.  
		loadImage();
		//13. Re-pack the JFrame object.
		obj1.pack();
		
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
