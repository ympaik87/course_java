package kr.co.ymp.chap11.example;

public class Audi extends Car {

	public Audi(AudiEngine engine) {
		super(engine);
	}

	@Override
	public void engineOn(Key key) {
		if (key instanceof MetalKey) {
			//key.tryEngineOn();
			super.engineOn(key);
		} else {
			System.out.println("아우디는 메탈키만 사용합니다.");
		}

	}

	@Override
	public void engineOff(Key key) {
		//key.tryEngineOn();
		super.engineOff(key);
	}

}
