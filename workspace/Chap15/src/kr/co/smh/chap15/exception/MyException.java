package kr.co.smh.chap15.exception;

// Exception 클래스 또는 RuntimeException 클래스를 상속 받아서 만든다.
// 자바에서 기본적으로 제공하는 예외클래스를 사용 하지 않고, 서비스에 대한 예외를 직접 만들어야 할 때..

// * 무조건 조건문으로 예외를 해결하려고 하지 말자..
public class MyException extends Exception{

	public MyException() {
		super("짝수는 예외 입니다");
	}
	
}
