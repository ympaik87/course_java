package kr.co.smh.chap10.example;

public class BallPen extends Writer{

	public BallPen(int price, String color) {
		super(price, color);
	}
	
	public void setColor(String color) {
		super.color = color;
	}
	
	public void refill() {
		System.out.println("볼펜심지를 " + super.color + "로 바꾸었습니다.");
	}
	
	public void refillBallPenColor(String color) {
		setColor(color);
		refill();
	}

	
	
}
