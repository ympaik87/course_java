package kr.co.smh.chap11.example;

public class BenzCar extends Car {

	public BenzCar(BenzEngine engine) {
		super(engine);
	}

	@Override
	public void engineOn(Key key) {
		if (key instanceof SmartKey) {
			super.engineOn(key);
		} else {
			System.out.println("������ ����ƮŰ�� ��� �մϴ�.");
		}
	}

	@Override
	public void engineOff(Key key) {
		if (key instanceof SmartKey) {
			super.engineOff(key);
		} else {
			System.out.println("������ ����ƮŰ�� ��� �մϴ�.");
		}
	}

}
