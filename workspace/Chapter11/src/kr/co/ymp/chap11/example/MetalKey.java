package kr.co.ymp.chap11.example;

public class MetalKey extends Key{
	@Override
	public void tryEngineOn() {
		System.out.println("Ű�� �ɾƼ� �����ϴ�.");
	}
	@Override
	public void tryEngineOff() {
		System.out.println("Ű�� �����鼭 ���ϴ�.");
	}

}
