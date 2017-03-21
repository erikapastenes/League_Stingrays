import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot dusty =new Robot();
			

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5
dusty.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	dusty.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
dusty.penDown();
dusty.setSpeed(10);
dusty.move(90);
dusty.turn(90);
dusty.move(100);
dusty.turn(90);
dusty.move(100);
dusty.turn(90);
dusty.move(100);







		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}


