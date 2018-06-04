package kr.co.ymp.chap09.example;

public class Rectangle extends Shape {
	private int w;
	private int h;
	
	public Rectangle(int w, int h) {
		super("»ç°¢Çü");
		this.w = w;
		this.h = h;
	}
	
	public void makeArea() {
		super.area = w * h;
	}
}
