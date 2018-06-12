package kr.co.ymp.chap14.demo;

public class DemoA {
	
	final void foo() {}
	void goo () {}
}

final class DemoB extends DemoA {
	
	// DemoA의 goo는 final이 아니기 때문에 overriding 가능
	@Override
	void goo() {
		// TODO Auto-generated method stub
		super.goo();
	}
	
	// foo 메소드는 DemoA class에서 final로 지정 되었기 때문에 overriding 불가
//	void foo() {
//		super.foo();
//	}
	
}

// DemoB class는 final class(종단 클래스)기 때문에 상속이 불가능한 class이다.
//class DemoC entends DemoB {
//	
//}