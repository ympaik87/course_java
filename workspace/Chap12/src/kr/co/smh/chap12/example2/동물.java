package kr.co.smh.chap12.example2;

public abstract class 동물 implements 낳기{
	protected 종 동물의종류;

	public 동물(종 동물의종류) {
		this.동물의종류 = 동물의종류;
	}
	@Override
	public void 낳는다() {
		this.동물의종류.낳는기능.낳는다();
	}
}
