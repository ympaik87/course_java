package kr.co.ymp.chap11.example;

public class BenzEngine extends Engine{
	public BenzEngine(int cc, int cylinder, int hp) {
		super(cc, cylinder, hp);
		
	}
	@Override
	public void printEngineInfo() {
		System.out.println("------���� ������ ����-------");
		System.out.println(super.cc + " cc");
		System.out.println(super.cylinder + " ����");
		System.out.println(super.hp + " ����");
		System.out.println("--------------------------");
		
	}

}
