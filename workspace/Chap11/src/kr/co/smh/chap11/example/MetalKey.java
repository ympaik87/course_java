package kr.co.smh.chap11.example;

public class MetalKey extends Key{

	@Override
	public void tryEngineOn() {
		System.out.println("Ű�� �ȾƼ� �����ϴ�.");
	}

	@Override
	public void tryEngineOff() {
		System.out.println("Ű�� �����鼭 ���ϴ�.");
	}

}
