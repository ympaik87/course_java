package kr.co.smh.chap10.example;

public class FountainPen extends Writer{

	public FountainPen(int price, String color) {
		super(price, color);
	}

	@Override
	public void refill() {
		System.out.println("À×Å© Ã¤¿ì±â");
	}
	
}
