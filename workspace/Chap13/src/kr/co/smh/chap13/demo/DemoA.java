package kr.co.smh.chap13.demo;

public class DemoA {

	public int memberVar;
	
	public void memberFoo() {
		System.out.println("DemoA.memberFoo() ȣ��");
		System.out.println(this.memberVar);
	}
	
	public static int staticVar;
	
	public static void staticGoo() {
		System.out.println("DemoA.staticGoo() ȣ��");
		System.out.println(DemoA.staticVar);
	}
	
	
	
}
