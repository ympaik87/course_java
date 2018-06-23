package kr.co.smh.chap15.example;

import kr.co.smh.chap15.exception.GradeException;

public class GradeCalculator {

	public static String scoreToGrade(int score) throws GradeException{

		// 90�̻� 100���ϸ� A
		// 80�̻� 90�̸��̸� B
		// 70�̻� 80�̸��̸� C
		// 60�̻� 70�̸��̸� D
		// �� �ܴ� F

		// ���������� ���� ���� ���� ���� ���� �����
		if (score < 0 || score > 100) {
			// ���ܻ�Ȳ��..
//			return "�߸��� ���Դϴ�.";
			throw new GradeException(score);
		} else {
			if (score >= 90 && score <= 100) {
				return "A";
			} else if (score >= 80 && score < 90) {
				return "B";
			} else if (score >= 70 && score < 80) {
				return "C";
			} else if (score >= 60 && score < 70) {
				return "D";
			} else {
				return "F";
			}
		}

	}

}
