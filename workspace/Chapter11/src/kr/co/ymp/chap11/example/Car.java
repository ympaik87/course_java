package kr.co.ymp.chap11.example;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void engineOn() {
		engine.on();
	}
	
	public void engineOff() {
		engine.off();
	}
}
