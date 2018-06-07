package kr.co.ymp.chap11.example;

public class SmartKey extends Key{
	@Override
	public void tryEngineOn() {
		System.out.println("버튼을 눌러서 잠금 헤제.");
	}
	@Override
	public void tryEngineOff() {
		System.out.println("버튼을 눌러서 잠금.");
	}

}
