package kr.co.smh.chap15.exception;

public class GradeException extends RuntimeException{

	public GradeException(int errScore) {
		super("���� ����� �ϱ� ���� �߸��� ���� ��� �Խ��ϴ�. [" + errScore + "]");
	}
	
}
