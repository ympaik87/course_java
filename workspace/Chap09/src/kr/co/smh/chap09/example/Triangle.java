package kr.co.smh.chap09.example;

public class Triangle extends Shape{

	private int b;
	private int h;
	
	public Triangle(int b, int h) {
		super("�ﰢ��");
		this.b = b;
		this.h = h;
	}
	
	@Override
	public void makeArea() {
		super.makeArea();
		super.area = b * h * 0.5;
	}
	
}

