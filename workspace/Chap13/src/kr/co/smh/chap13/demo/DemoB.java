package kr.co.smh.chap13.demo;

public class DemoB {

	private int memberVar;
	private void memberMethod() { DemoB.staticMethod(); }
	
	private static void staticMethod() {
		
//		System.out.println(memberVar);
//		memberMethod();
//		
//		this.memberMethod();
		
		DemoB demoB = new DemoB();
		demoB.memberVar++;
		demoB.memberMethod();
	}
	
}
