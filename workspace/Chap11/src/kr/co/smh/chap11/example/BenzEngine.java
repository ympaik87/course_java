package kr.co.smh.chap11.example;

public class BenzEngine extends Engine{

	
	public BenzEngine(int cc, int cylinder, int hp) {
		super(cc, cylinder, hp);
	}

	@Override
	public void printEngineInfo() {
		System.out.println("���� �����Դϴ�. ������ ������ �����ϴ�.");
		System.out.println(super.cc + " cc");
		System.out.println(super.cylinder + " ����");
		System.out.println(super.hp + " ����");
	}
	
}
