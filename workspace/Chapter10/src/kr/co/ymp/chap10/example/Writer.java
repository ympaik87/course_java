package kr.co.ymp.chap10.example;

public class Writer {
	// data
	// ����
	protected int price = 0;
	// ����
	protected String color = "";
	
	public Writer(int price, String color) {
		this.price = price;
		this.color = color;
		
	}
	
	public void write(String contents) {
		System.out.println(this.color + " ������" + contents + " ��� �������ϴ�.");
	}
	
	public void refill() {
		
	}

}
