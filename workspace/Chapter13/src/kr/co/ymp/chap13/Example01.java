package kr.co.ymp.chap13;

import kr.co.ymp.chap13.demo.DemoA;

public class Example01 {
	public static void main(String[] args) {
		DemoA demoA = new DemoA();
		demoA.memberVar++;
		demoA.memberFoo();
		
		demoA.staticVar++;
		demoA.staticGoo();
		
		DemoA demoA2 = new DemoA();
		demoA2.memberVar++;
		demoA2.memberFoo();
		
		DemoA.staticVar++;
		DemoA.staticGoo();		
	}
}
