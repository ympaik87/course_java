package kr.co.ymp.chap11.example;

public class MetalKey extends Key{
	@Override
	public void tryEngineOn() {
		System.out.println("키를 꽃아서 돌립니다.");
	}
	@Override
	public void tryEngineOff() {
		System.out.println("키를 돌리면서 뺍니다.");
	}

}
