package edu.ycp.cs320.movethesquare.model;

public class Circle {
	private double x, y, width, height; 
	int radius;
		
	public Circle(int r) {
		radius = r;
	}
	
	public void setRadius(int r) {
		r = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getDiameter() {
		return radius * 2;
	}
	
	public double getArea() {
		return Math.PI  * Math.pow(radius, 2);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return radius *2;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return radius *2;
	}
	
	
	
	/*public void setRadius(double radius) {
		this.radius = radius;
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
	}*/
}
