package kr.co.smh.chap10.example;

public class Car {

	private String brand;
	private int maxSpeed;
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void doDrive() {
		//engine.on();
		System.out.println("���� ������ ���ϴ�.");
	}
	
	public void doBreak() {
		System.out.println("���� ������ϴ�.");
		//engine.off();
	}
	
	
	
	
}
