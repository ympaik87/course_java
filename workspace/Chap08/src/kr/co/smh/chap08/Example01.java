package kr.co.smh.chap08;

import kr.co.smh.chap08.demo.DemoA;
import kr.co.smh.chap08.demo.DemoB;

public class Example01 {

	public static void main(String[] args) {
		DemoA demoA = new DemoA(5);
		demoA.foo();
		//demoA.goo();
		
		DemoB demoB = new DemoB(10,"Hello","Hi");
		demoB.foo();
		demoB.goo();
		
		
		
	}
	
}
