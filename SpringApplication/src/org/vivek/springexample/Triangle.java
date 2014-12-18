package org.vivek.springexample;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void drawShape() {
		System.out.println("Point A coordinates are X = "+ getPointA().getX()+" and  Y = "+ getPointA().getY());
		System.out.println("Point B coordinates are X = "+ getPointB().getX()+" and  Y = "+ getPointB().getY());
		System.out.println("Point c coordinates are X = "+ getPointC().getX()+" and  Y = "+ getPointC().getY());
		
	}

}
