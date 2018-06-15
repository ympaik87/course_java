package kr.co.ymp.chap15.exception;

public class GradeException extends RuntimeException {
	public GradeException(int errScore) {
		super("성적 계산을 하기 위한 잘못된 값이 들어왔습니다. [" + errScore + "]");
	}

}
