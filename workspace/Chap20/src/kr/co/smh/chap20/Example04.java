package kr.co.smh.chap20;

import kr.co.smh.chap20.example.LowerTarget;
import kr.co.smh.chap20.example.UpperThread;

public class Example04 {

	public static void main(String[] args) {

		UpperThread thread1 = new UpperThread(); // ���������� run() �޼ҵ尡 �̹� ���� �Ǿ��� ������
													// target�� �ʿ� ����.

		Thread thread2 = new Thread(new LowerTarget()); // Thread Ŭ������ �����ڿ�
														// �ش� �����尡 �ؾ� �� ���� ��� �ִ�
														// target ��ü�� ����.

		// �����带 ���� �� ���� �ݵ�� start() �޼ҵ带 ����ؾ� �Ѵ�.
		// run �޼ҵ带 ȣ���ϸ� �ȵ�!
		thread1.start();
		thread2.start();

		for (char ch = '��'; ch <= '��'; ch++) {
			System.out.println("[��   ��] " + ch);
		}

	}

}
