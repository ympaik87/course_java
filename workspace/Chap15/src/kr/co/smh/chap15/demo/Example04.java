package kr.co.smh.chap15.demo;

import kr.co.smh.chap15.exception.MyException;

public class Example04 {

	public static void main(String[] args) {
		DemoA demoA = new DemoA();
		try {
			demoA.goo(6);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
}
