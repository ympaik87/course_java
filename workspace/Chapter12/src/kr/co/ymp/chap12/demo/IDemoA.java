package kr.co.ymp.chap12.demo;

public interface IDemoA {
	// 에러 상황 1 - 일반적인 멤버 메소드를 생성 하려 할 때
	// --> 인터페이스는 추상 메소드만 가질 수 있기 때문에 goo() 같은 일반 메소드 처럼
	// 구현된 메소드를 가질 수 없다.
//	void goo() {}
	
	public abstract void foo(); // 인터페이스는 무조건 추상 메소드만
	void goo(); 				// public abstract가 암시적으로 붇는다.
	
	int a = 10; // 인터페이스의 변수는 항상 static final이다.
	public static void koo() {
		// static method는 생성 가능
//		a = 20; // a는 상수기 때문에 변경 불가
		
	}
}
