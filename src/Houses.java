import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob = new Robot();
	public static void main(String[] args) {
		Random rand = new Random();
		int height = rand.nextInt(191) + 60;
		
		rob.setX(100);
		rob.setY(500);
		
		
		for (int i = 0; i < 9; i++) {
			flatHouse(height + i*3);
			
			
		}
		
	}
	
	public static void flatHouse(int height){
		rob.miniaturize();
		rob.setSpeed(20);
		rob.penDown();
		
		rob.setPenColor(0, 0, 0);
		rob.move(height);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(160, 255, 0);
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);
		
	}
}
