package kr.co.smh.chap14.demo;

public class DemoA {
	
	final void foo() {}
	void goo() {}
}

final class DemoB extends DemoA {
	// DemoA�� goo�� final�� �ƴϱ� ������ �������̵� ����
	@Override
	void goo() {
		super.goo();
	}
	//foo �޼ҵ�� DemoA Ŭ�������� final�� ���� �Ǿ��� ������ �������̵� �Ұ�
//	void foo() {
//		super.foo();
//	}
}

//DemoB Ŭ������ final Ŭ����(���� Ŭ����)�� ������ ����� �Ұ����� Ŭ�����̴�.
//class DemoC extends DemoB{
//	
//}





