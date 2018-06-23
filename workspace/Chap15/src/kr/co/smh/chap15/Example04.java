package kr.co.smh.chap15;

import kr.co.smh.chap15.example.GradeCalculator;
import kr.co.smh.chap15.exception.GradeException;

public class Example04 {

	public static void main(String[] args) {
		
		System.out.println(GradeCalculator.scoreToGrade(100));
		System.out.println(GradeCalculator.scoreToGrade(80));
		System.out.println(GradeCalculator.scoreToGrade(75));
		System.out.println(GradeCalculator.scoreToGrade(63));
		System.out.println(GradeCalculator.scoreToGrade(55));
		
		System.out.println();
		
		try {
			System.out.println(GradeCalculator.scoreToGrade(1000));
		}catch(GradeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}




