package kr.co.ymp.chap12.demo;

public interface IDemoA {
	// ���� ��Ȳ 1 - �Ϲ����� ��� �޼ҵ带 ���� �Ϸ� �� ��
	// --> �������̽��� �߻� �޼ҵ常 ���� �� �ֱ� ������ goo() ���� �Ϲ� �޼ҵ� ó��
	// ������ �޼ҵ带 ���� �� ����.
//	void goo() {}
	
	public abstract void foo(); // �������̽��� ������ �߻� �޼ҵ常
	void goo(); 				// public abstract�� �Ͻ������� �Ѵ´�.
	
	int a = 10; // �������̽��� ������ �׻� static final�̴�.
	public static void koo() {
		// static method�� ���� ����
//		a = 20; // a�� ����� ������ ���� �Ұ�
		
	}
}
