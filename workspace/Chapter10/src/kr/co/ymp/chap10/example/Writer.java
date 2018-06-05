package kr.co.ymp.chap10.example;

public class Writer {
	// data
	// 가격
	protected int price = 0;
	// 색상
	protected String color = "";
	
	public Writer(int price, String color) {
		this.price = price;
		this.color = color;
		
	}
	
	public void write(String contents) {
		System.out.println(this.color + " 색으로" + contents + " 라고 적었습니다.");
	}
	
	public void refill() {
		
	}

}
