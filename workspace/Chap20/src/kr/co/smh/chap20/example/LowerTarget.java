package kr.co.smh.chap20.example;

//Target : Runnable �������̽��� �������� Ŭ������ Target�̶�� �Ѵ�.
// �����尡 ���� ���Ѿ� �� ������ ����ִ� Ŭ������ �ǹ��Ѵ�.
// �����忡�� �۾��� �Ϸ��� �ݵ�� Target�� �ʿ��ϴ�.

public class LowerTarget implements Runnable {

	@Override
	public void run() {
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println("[�ҹ���] " + ch);
		}

	}

}
