package kr.co.ymp.chap15;

import kr.co.ymp.chap15.example.GradeCalculator;
import kr.co.ymp.chap15.exception.GradeException;

public class Example05 {
	public static void main(String[] args) {
		System.out.println(GradeCalculator.scoreToGrade(90));

		try {
			System.out.println(GradeCalculator.scoreToGrade(1000000000));
		} catch (GradeException e) {
			System.out.println(e.getMessage());
		}

	}
}
