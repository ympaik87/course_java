package kr.co.ymp.chap15;

import kr.co.ymp.chap15.demo.DemoA;

public class Example02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;

		DemoA demoA = null; // null: 아무 것도 참조하지 않은 상태

		// try ~ catch 블럭을 활용한 예외처리
		// 1. try: 예외발생 가능성이 있는 코드가 작성
		// 2. catch: try에서 발생된 (던져진 - throw) 예외를 처리하는 코드가 작성

		try {
			System.out.println(a / b);
			demoA.foo();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // 사용자에게 예외 메세지 보여주기
			e.printStackTrace(); // 개발자가 예외를 추적하기 쉽도록
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
