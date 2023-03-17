package edu.ycp.cs320.movethesquare.controllers;

import edu.ycp.cs320.movethesquare.model.Circle;
import edu.ycp.cs320.movethesquare.model.Game;
public class GameController {
	public void computeSquareMoveDirection(Game game, Circle circle, double mouseX, double mouseY) {
		if (mouseX > 0 && mouseX < game.getWidth() && mouseY > 0 && mouseY < game.getHeight()) {
			double dx = mouseX - (circle.getX() + circle.getWidth()/2);
			double dy = mouseY - (circle.getY() + circle.getHeight()/2);
			
			double moveX = 0, moveY = 0;
			
			if (dx > 0) {
				moveX = Game.MOVE_DIST;
			}
			else {
				moveX = -Game.MOVE_DIST;
			}
			if (dy > 0 ) {
				moveY = Game.MOVE_DIST;
			} 
			else {
				moveY = -Game.MOVE_DIST;
			}
			
					
			
				game.setCircleDx(moveX);
				game.setCircleDy(moveY);
		}
		
	}

		
	public void moveSquare(Game model, Circle circle) {
		if((circle.getX() + model.getCircleDx() > 0.0 && (circle.getX() + model.getCircleDx()) < 640.0))
		{
			circle.setX(circle.getX() + model.getCircleDx());
		}
		if((circle.getY() + model.getCircleDy()) > 0.0 && (circle.getY() + model.getCircleDy()) < 480.0)
		{
			circle.setY(circle.getY() + model.getCircleDy());
		}
	}
}
	