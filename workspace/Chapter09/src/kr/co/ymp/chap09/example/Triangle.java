package kr.co.ymp.chap09.example;

public class Triangle extends Shape {
	private double h;
	private double b;
	
	public Triangle(double h, double b) {
		super("»ï°¢Çü");
		this.h = h;
		this.b = b;
	}
	
	@Override
	public void makeArea() {
		super.makeArea();
		super.area = b * h * 0.5;
	}
}
