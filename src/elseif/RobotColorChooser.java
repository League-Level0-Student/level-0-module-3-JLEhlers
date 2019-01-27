//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot stick= new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 50; i++) {
			
		
		String color;
		color=JOptionPane.showInputDialog("Pick a color");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("red")) {
stick.setPenColor(Color.red);
}
else if(color.equals("blue")) {
stick.setPenColor(Color.blue);	
}
else if(color.equals("green")) {
stick.setPenColor(Color.green);	
}
else if(color.equals("pink")) {
stick.setPenColor(Color.pink);	
}
else if(color.equals("black")) {
stick.setPenColor(Color.black);	
}
else if(color.equals("yellow")) {
stick.setPenColor(Color.yellow);	
}
else if(color.equals("orange")) {
stick.setPenColor(Color.orange);	
}
else {
stick.setRandomPenColor();	
}
stick.penDown();
stick.setPenWidth(10);
stick.setSpeed(10);
stick.move(100);
stick.turn(90);
stick.move(100);
stick.turn(90);
stick.move(100);
stick.turn(90);
stick.move(100);
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
