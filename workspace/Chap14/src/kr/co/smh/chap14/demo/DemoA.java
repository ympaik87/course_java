package kr.co.smh.chap14.demo;

public class DemoA {
	
	final void foo() {}
	void goo() {}
}

final class DemoB extends DemoA {
	// DemoA의 goo는 final이 아니기 때문에 오버라이딩 가능
	@Override
	void goo() {
		super.goo();
	}
	//foo 메소드는 DemoA 클래스에서 final로 지정 되었기 때문에 오버라이딩 불가
//	void foo() {
//		super.foo();
//	}
}

//DemoB 클래스는 final 클래스(종단 클래스)기 때문에 상속이 불가능한 클래스이다.
//class DemoC extends DemoB{
//	
//}





