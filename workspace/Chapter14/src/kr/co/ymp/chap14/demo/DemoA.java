package kr.co.ymp.chap14.demo;

public class DemoA {
	
	final void foo() {}
	void goo () {}
}

final class DemoB extends DemoA {
	
	// DemoA�� goo�� final�� �ƴϱ� ������ overriding ����
	@Override
	void goo() {
		// TODO Auto-generated method stub
		super.goo();
	}
	
	// foo �޼ҵ�� DemoA class���� final�� ���� �Ǿ��� ������ overriding �Ұ�
//	void foo() {
//		super.foo();
//	}
	
}

// DemoB class�� final class(���� Ŭ����)�� ������ ����� �Ұ����� class�̴�.
//class DemoC entends DemoB {
//	
//}