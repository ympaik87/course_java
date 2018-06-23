package kr.co.smh.chap11.example;

public abstract class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void engineOn(Key key) {
		key.tryEngineOn();
		engine.on();
	}
	
	public void engineOff(Key key) {
		key.tryEngineOff();
		engine.off();
	}
	
}
