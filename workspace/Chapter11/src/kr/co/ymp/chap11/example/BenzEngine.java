package kr.co.ymp.chap11.example;

public class BenzEngine extends Engine{
	public BenzEngine(int cc, int cylinder, int hp) {
		super(cc, cylinder, hp);
		
	}
	@Override
	public void printEngineInfo() {
		System.out.println("------벤츠 엔진의 제원-------");
		System.out.println(super.cc + " cc");
		System.out.println(super.cylinder + " 기통");
		System.out.println(super.hp + " 마력");
		System.out.println("--------------------------");
		
	}

}
