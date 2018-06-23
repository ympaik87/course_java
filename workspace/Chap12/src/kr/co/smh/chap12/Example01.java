package kr.co.smh.chap12;

import kr.co.smh.chap12.demo.DemoA;
import kr.co.smh.chap12.demo.DemoB;
import kr.co.smh.chap12.demo.DemoBImpl;
import kr.co.smh.chap12.demo.DemoC;
import kr.co.smh.chap12.demo.IDemoA;

public class Example01 {

	public static void main(String[] args) {
		
		//인터페이스 UpCasting
		IDemoA demoA = new DemoA();
		demoA.foo();
		//DemoB demoB = new DemoBImpl();
		
		// DemoC는 IDemoA, DemoB 인터페이스를 구현 받았기 때문에
		// 두 가지 형태로 UpCasting이 가능하다.
		IDemoA demo1 = new DemoC();
		DemoB demob = new DemoC();
		
		
	}
	
}
