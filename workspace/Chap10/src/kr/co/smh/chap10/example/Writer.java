package kr.co.smh.chap10.example;

//abstract Ű���带 ����Ͽ� �߻�ȭ
public abstract class Writer {
	// data
	//����
	protected int price = 0;
	//����
	protected String color = "";
	
	public Writer(int price, String color) {
		this.price = price;
		this.color = color;
	}
	
	public void write(String contents) {
		System.out.println(this.color + "������ " + contents + " ��� �������ϴ�.");
	}
	
//	public void refill() {
//		
//	}
	
	//�޼ҵ� �߻�ȭ
	public abstract void refill();
	
	
	
}



