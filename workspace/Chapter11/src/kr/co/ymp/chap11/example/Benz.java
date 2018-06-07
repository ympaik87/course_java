package kr.co.ymp.chap11.example;

public class Benz extends Car{

	public Benz(BenzEngine engine) {
		super(engine);
	}
	
	@Override
	public void engineOn(Key key) {
		if (key instanceof SmartKey) {
			key.tryEngineOn();
			super.engineOn(key);
		}else {
			System.out.println("벤츠는 스마트키만 사용합니다.");
		}
		
	}
	@Override
	public void engineOff(Key key) {
		if (key instanceof SmartKey) {
			key.tryEngineOn();
			super.engineOff(key);
		}else {
			System.out.println("벤츠는 스마트키만 사용합니다.");
		}
		
	}
	

}
