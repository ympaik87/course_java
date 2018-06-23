package kr.co.smh.chap15.demo;

import kr.co.smh.chap15.exception.MyException;

public class DemoA {

	public void foo() {
		System.out.println("DemoA.foo()");
	}
	
	
					//throws : 메소드를 호출 했을 때 예외가 날 것이다 라는 것을 미리 알려줌
	public void goo(int a) throws MyException{
		
		//a가 짝수면 예외
		if(a % 2 == 0) {
			//예외 객체 생성 후 catch에 던지기
			throw new MyException();
		}
		
		System.out.println(a);
		
	}
	
}
