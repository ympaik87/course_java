package kr.co.ymp.chap15.exception;

// Exception class �Ǵ� RuntimeException class�� ��� �޾Ƽ� �����.
// Java���� �⺻������ �����ϴ� ����Ŭ������ ��� ���� �ʰ�, ���񽺿� ���� ���ܸ� ���� ���巯�� �� ��.

// * ������ ���ǹ����� ���ܸ� �ذ��Ϸ��� ���� ����.
public class MyException extends Exception {
	public MyException() {
		super("¦���� �����Դϴ�.");
	}

}
