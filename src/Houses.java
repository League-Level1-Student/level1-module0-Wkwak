import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		rob.setX(100);
		rob.setY(500);
		rob.miniaturize();
		rob.setSpeed(20);
		rob.penDown();

		for (int i = 0; i < 9; i++) {
			Random rand = new Random();
			int randheight = rand.nextInt(3);
			
			int color1 = rand.nextInt(256);
			int color2 = rand.nextInt(256);
			int color3 = rand.nextInt(256);
			
			String height = "";

			if (randheight == 0) {
				height = "small";
				drawPointyRoof(height, color1, color2, color3);
			}
			if (randheight == 1) {
				 height = "medium";
				 drawPointyRoof(height, color1, color2, color3);
			}
			if (randheight == 2) {
				height = "large";
				drawFlatRoof(height, color1, color2, color3);
			}
			
		}
		
		
	}
	
	public static void drawFlatRoof(String height, int color1, int color2, int color3){
		
		int heightnum = 0;
		if (height.equals("small")) {
			heightnum = 60;
		}
		
		if (height.equals("medium")) {
			heightnum = 120;
		}
		if (height.equals("large")) {
			heightnum = 250;
		}
		
		
		rob.setPenColor(color1, color2, color3);
		rob.move(heightnum);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(heightnum);
		rob.setPenColor(160, 255, 0);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
		
	}
	
	public static void drawPointyRoof(String height, int color1, int color2, int color3) {
		int heightnum = 0;
		if (height.equals("small")) {
			heightnum = 60;
		}
		
		if (height.equals("medium")) {
			heightnum = 120;
		}
		if (height.equals("large")) {
			heightnum = 250;
		}
		
		
		rob.setPenColor(color1, color2, color3);
		rob.move(heightnum);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		rob.move(heightnum);
		rob.setPenColor(160, 255, 0);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
	}
	
}
