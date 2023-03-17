package edu.ycp.cs320.movethesquare.model;

public class Game {
	public static final double MOVE_DIST = 1.0; // x/y distance square moves each tick
	// private double width, height;
	private Circle circle;
	private double circleDy;
	private double circleDx;
	int radius;
	private double width;
	private double height;

	public Game() {

	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircleDx(double circleDx) {
		this.circleDx = circleDx;
	}

	public double getCircleDx() {
		return circleDx;
	}

	public void setCircleDy(double circleDy) {
		this.circleDy = circleDy;
	}

	public double getCircleDy() {
		return circleDy;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

}
