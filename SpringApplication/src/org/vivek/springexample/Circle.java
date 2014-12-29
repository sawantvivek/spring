package org.vivek.springexample;

public class Circle implements Shape {

	public Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
System.out.println("Circle: Center point X: "+ center.getX() +" and Y : "+center.getY());
	}

}
