package kr.co.smh.chap20.example;

public class UpperThread extends Thread {

	//Thread 클래스를 상속 받았을 경우 run 메소드를 반드시 오버라이딩
	
	//run() 메소드는 쓰레드에서 해야 할 일을 작성한다.
	 // Thread 클래스의 main이라고 생각하면 된다.
	 // 모든 예외처리는 run() 메소드에서 해결 해야 한다. ( run에서 throws 불가능 )
	@Override
	public void run() {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("[대문자] " + ch);
		}
		
	}
	
}
