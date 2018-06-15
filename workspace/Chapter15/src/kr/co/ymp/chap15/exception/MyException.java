package kr.co.ymp.chap15.exception;

// Exception class 또는 RuntimeException class를 상속 받아서 만든다.
// Java에서 기본적으로 제공하는 예외클래스를 사용 하지 않고, 서비스에 대한 예외를 직접 만드러야 할 때.

// * 무조건 조건문으로 예외를 해결하려고 하지 말자.
public class MyException extends Exception {
	public MyException() {
		super("짝수는 예외입니다.");
	}

}
