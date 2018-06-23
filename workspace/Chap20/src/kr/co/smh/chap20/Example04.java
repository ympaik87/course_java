package kr.co.smh.chap20;

import kr.co.smh.chap20.example.LowerTarget;
import kr.co.smh.chap20.example.UpperThread;

public class Example04 {

	public static void main(String[] args) {

		UpperThread thread1 = new UpperThread(); // 내부적으로 run() 메소드가 이미 구현 되었기 때문에
													// target이 필요 없다.

		Thread thread2 = new Thread(new LowerTarget()); // Thread 클래스의 생성자에
														// 해당 쓰레드가 해야 할 일이 들어 있는
														// target 객체가 들어간다.

		// 쓰레드를 실행 할 때는 반드시 start() 메소드를 사용해야 한다.
		// run 메소드를 호출하면 안됨!
		thread1.start();
		thread2.start();

		for (char ch = 'ㄱ'; ch <= 'ㅎ'; ch++) {
			System.out.println("[한   글] " + ch);
		}

	}

}
