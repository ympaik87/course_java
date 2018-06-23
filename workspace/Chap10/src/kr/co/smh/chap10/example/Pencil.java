package kr.co.smh.chap10.example;

public class Pencil extends Writer{

	public Pencil(int price) {
		super(price, "검정");
	}
	
	@Override
	public void refill() {
		System.out.println("연필심 채우기");
	}
	
	
	public void foo() {
		System.out.println("Pencil.foo()");
	}
	
}
