package kr.co.ymp.chap11.example;

public class AudiEngine extends Engine{
	public AudiEngine(int cc, int cylinder, int hp) {
		super(cc, cylinder, hp);
		
	}
	
	@Override
	public void printEngineInfo() {
		System.out.println("------�ƿ�� ������ ����-------");
		System.out.println(super.cc + " cc");
		System.out.println(super.cylinder + " ����");
		System.out.println(super.hp + " ����");
		System.out.println("--------------------------");
	}
	
	@Override
	public void on() {
		System.out.println("�ƿ�� ������");
		super.on();
	}

	@Override
	public void off() {
		System.out.println("�ƿ�� ������");
		super.off();
	}
}
