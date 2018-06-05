package kr.co.ymp.chap10.example;

public class Car {
	private String brand;
	private int maxSpeed;
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.on();
		System.out.println("���� ������ ���ϴ�.");
	}
	
	public void doBreak() {
		engine.off();
		System.out.println("���� ������ϴ�.");
	}
}
