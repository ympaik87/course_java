package kr.co.smh.chap11.example;

public class SmartKey extends Key {

	@Override
	public void tryEngineOn() {
		System.out.println("버튼을 눌러서 잠금 해제");
	}

	@Override
	public void tryEngineOff() {
		System.out.println("버튼을 눌러서 잠금");
	}

}
