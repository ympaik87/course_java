package kr.co.smh.chap15.exception;

// Exception Ŭ���� �Ǵ� RuntimeException Ŭ������ ��� �޾Ƽ� �����.
// �ڹٿ��� �⺻������ �����ϴ� ����Ŭ������ ��� ���� �ʰ�, ���񽺿� ���� ���ܸ� ���� ������ �� ��..

// * ������ ���ǹ����� ���ܸ� �ذ��Ϸ��� ���� ����..
public class MyException extends Exception{

	public MyException() {
		super("¦���� ���� �Դϴ�");
	}
	
}
