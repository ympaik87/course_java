package kr.co.ymp.chap13.demo;

public class DemoB {
	private int memberVar;
	private void memberMethod() {
		DemoB.staticMethod();
	}
	
	// static 먼저 생성되기에 객체를 생성 해야만 생성되는 멤버 변수/메소드를 static안에 넣으면 에러
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
