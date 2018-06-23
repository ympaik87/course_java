package kr.co.smh.chap15.example;

import kr.co.smh.chap15.exception.GradeException;

public class GradeCalculator {

	public static String scoreToGrade(int score) throws GradeException{

		// 90이상 100이하면 A
		// 80이상 90미만이면 B
		// 70이상 80미만이면 C
		// 60이상 70미만이면 D
		// 그 외는 F

		// 정상적이지 않은 값에 대한 예외 조건 만들기
		if (score < 0 || score > 100) {
			// 예외상황임..
//			return "잘못된 값입니다.";
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
