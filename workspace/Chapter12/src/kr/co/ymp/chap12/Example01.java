package kr.co.ymp.chap12;

import kr.co.ymp.chap12.demo.DemoA;
import kr.co.ymp.chap12.demo.DemoB;
import kr.co.ymp.chap12.demo.DemoC;
import kr.co.ymp.chap12.demo.IDemoA;

public class Example01 {
	public static void main(String[] args) {
		// 인터페이스 Up Casting
		IDemoA demoA = new DemoA();
		demoA.foo();
		// DemoB demoB = new Demo
		
		// DemoC는 IDemoA, DemoB 인터페이스를 구현 받았기 때문에
		// 두 가지 형태로 Up Casting이 가능하다.
		IDemoA demo1 = new DemoC();
		DemoB demob = new DemoC();
		
		
	}
}
