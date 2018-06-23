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
		System.out.println("�õ��� �ɷȽ��ϴ�.");
	}
	public void off() {
		System.out.println("�õ��� �������ϴ�.");
	}
	public abstract void printEngineInfo();
}
