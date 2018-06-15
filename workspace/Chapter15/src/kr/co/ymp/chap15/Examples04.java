package kr.co.ymp.chap15;

import kr.co.ymp.chap15.demo.DemoA;
import kr.co.ymp.chap15.exception.MyException;

public class Examples04 {
	public static void main(String[] args) {
		DemoA demoA = new DemoA();

		try {
			demoA.goo(4);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// public static void main(String[] args) throws MyException {
	// DemoA demoA = new DemoA();
	// demoA.goo(5);
	// }
}
