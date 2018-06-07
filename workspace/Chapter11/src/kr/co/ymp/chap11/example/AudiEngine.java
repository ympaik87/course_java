package kr.co.ymp.chap11.example;

public class AudiEngine extends Engine{
	public AudiEngine(int cc, int cylinder, int hp) {
		super(cc, cylinder, hp);
		
	}
	
	@Override
	public void printEngineInfo() {
		System.out.println("------아우디 엔진의 제원-------");
		System.out.println(super.cc + " cc");
		System.out.println(super.cylinder + " 기통");
		System.out.println(super.hp + " 마력");
		System.out.println("--------------------------");
	}
	
	@Override
	public void on() {
		System.out.println("아우디 엔진의");
		super.on();
	}

	@Override
	public void off() {
		System.out.println("아우디 엔진의");
		super.off();
	}
}
