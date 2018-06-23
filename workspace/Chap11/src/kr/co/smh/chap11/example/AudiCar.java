package kr.co.smh.chap11.example;

public class AudiCar extends Car{

	public AudiCar(AudiEngine engine) {
		super(engine);
	}

	@Override
	public void engineOn(Key key) {
		if (key instanceof MetalKey) {
			super.engineOn(key);
		} else {
			System.out.println("아우디는 메탈키만 사용합니다.");
		}
	}
	
	@Override
	public void engineOff(Key key) {
		if (key instanceof MetalKey) {
			super.engineOff(key);
		} else {
			System.out.println("아우디는 메탈키만 사용합니다.");
		}
	}
	
}
