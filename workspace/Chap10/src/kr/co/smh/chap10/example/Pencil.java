package kr.co.smh.chap10.example;

public class Pencil extends Writer{

	public Pencil(int price) {
		super(price, "����");
	}
	
	@Override
	public void refill() {
		System.out.println("���ʽ� ä���");
	}
	
	
	public void foo() {
		System.out.println("Pencil.foo()");
	}
	
}
