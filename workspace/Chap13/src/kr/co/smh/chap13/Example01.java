package kr.co.smh.chap13;

import kr.co.smh.chap13.demo.DemoA;

public class Example01 {

	public static void main(String[] args) {
		DemoA demoA = new DemoA();
		demoA.memberVar++;
		demoA.memberFoo();
		
		DemoA.staticVar++;
		DemoA.staticGoo();
		
		DemoA demoA2 = new DemoA();
		demoA2.memberVar++;
		demoA2.memberFoo();
		
		DemoA.staticVar++;
		DemoA.staticGoo();
		
		
		
		
		
		
		
	}
	
}
