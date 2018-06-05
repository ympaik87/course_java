package kr.co.ymp.chap10.example;

public class BallPen extends Writer {
	
	public BallPen(int price, String color) {
		super(price, color);
	}
	
	public void setColor(String color) {
		super.color = color;
	}
	
	public void refill() {
		System.out.println(super.color + " �� ��������� �ٲߴϴ�.");
	}
	
	public void refillBallPenColor(String color) {
		setColor(color);
		refill();
	}
	
}
