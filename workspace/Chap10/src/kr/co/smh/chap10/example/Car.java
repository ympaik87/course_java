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
		System.out.println("차가 앞으로 갑니다.");
	}
	
	public void doBreak() {
		System.out.println("차가 멈췄습니다.");
		//engine.off();
	}
	
	
	
	
}
