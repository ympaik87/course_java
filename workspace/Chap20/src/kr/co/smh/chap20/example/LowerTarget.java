package kr.co.smh.chap20.example;

//Target : Runnable 인터페이스를 구현받은 클래스를 Target이라고 한다.
// 쓰레드가 실행 시켜야 할 내용이 들어있는 클래스를 의미한다.
// 쓰레드에서 작업을 하려면 반드시 Target이 필요하다.

public class LowerTarget implements Runnable {

	@Override
	public void run() {
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println("[소문자] " + ch);
		}

	}

}
