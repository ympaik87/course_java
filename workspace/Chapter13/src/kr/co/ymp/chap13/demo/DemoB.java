package kr.co.ymp.chap13.demo;

public class DemoB {
	private int memberVar;
	private void memberMethod() {
		DemoB.staticMethod();
	}
	
	// static ���� �����Ǳ⿡ ��ü�� ���� �ؾ߸� �����Ǵ� ��� ����/�޼ҵ带 static�ȿ� ������ ����
	private static void staticMethod() {
//		System.out.println(memberVar);
//		memberMethod();
//		
//		DemoB.memberMethod();
		
		DemoB demoB = new DemoB();
		demoB.memberVar++;
		demoB.memberMethod();
	}
}
