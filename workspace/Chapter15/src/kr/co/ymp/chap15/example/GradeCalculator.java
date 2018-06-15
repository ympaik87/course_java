package kr.co.ymp.chap15.example;

import kr.co.ymp.chap15.exception.GradeException;

public class GradeCalculator {
	public static String scoreToGrade(int score) throws GradeException {
		// 90 이상 100 이하면 A
		// 80 이상 90 미만 이면 B
		// 70 이상 80 미만 이면 C
		// 60 이상 70 미만 이면 D
		// 그 외는 F

		// 정상적이지 않은 값에 대한 예외 조건 만들기
		if (score < 0 || score > 100) {
			// 예외상황...
			// return "잘못된 값입니다.";
			throw new GradeException(score);
		} else {
			if (score >= 90 && score <= 100) {
				return "A";
			} else if (score >= 80 && score < 90) {
				return "B";
			} else if (score >= 70 && score < 80) {
				return "c";
			} else if (score >= 60 && score < 70) {
				return "D";
			} else {
				return "F";
			}
		}

	}
}
