package kr.co.ymp.chap11.example;

public class SmartKey extends Key{
	@Override
	public void tryEngineOn() {
		System.out.println("��ư�� ������ ��� ����.");
	}
	@Override
	public void tryEngineOff() {
		System.out.println("��ư�� ������ ���.");
	}

}
