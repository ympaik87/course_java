package kr.co.ymp.chap15;

import kr.co.ymp.chap15.demo.DemoA;

public class Example02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;

		DemoA demoA = null; // null: �ƹ� �͵� �������� ���� ����

		// try ~ catch ���� Ȱ���� ����ó��
		// 1. try: ���ܹ߻� ���ɼ��� �ִ� �ڵ尡 �ۼ�
		// 2. catch: try���� �߻��� (������ - throw) ���ܸ� ó���ϴ� �ڵ尡 �ۼ�

		try {
			System.out.println(a / b);
			demoA.foo();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // ����ڿ��� ���� �޼��� �����ֱ�
			e.printStackTrace(); // �����ڰ� ���ܸ� �����ϱ� ������
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
