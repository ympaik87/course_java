package kr.co.smh.chap11.example;

public abstract class Engine {

	protected int cc;
	protected int cylinder;
	protected int hp;
	
	public Engine(int cc, int cylinder, int hp) {
		this.cc = cc;
		this.cylinder = cylinder;
		this.hp = hp;
	}
	public void on() {
		System.out.println("시동이 걸렸습니다.");
	}
	public void off() {
		System.out.println("시동이 꺼졌습니다.");
	}
	public abstract void printEngineInfo();
}
