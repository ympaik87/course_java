package kr.co.smh.chap20.example;

public class UpperThread extends Thread {

	//Thread Ŭ������ ��� �޾��� ��� run �޼ҵ带 �ݵ�� �������̵�
	
	//run() �޼ҵ�� �����忡�� �ؾ� �� ���� �ۼ��Ѵ�.
	 // Thread Ŭ������ main�̶�� �����ϸ� �ȴ�.
	 // ��� ����ó���� run() �޼ҵ忡�� �ذ� �ؾ� �Ѵ�. ( run���� throws �Ұ��� )
	@Override
	public void run() {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("[�빮��] " + ch);
		}
		
	}
	
}
