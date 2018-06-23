package kr.co.smh.chap09;

import kr.co.smh.chap09.example.Circle;
import kr.co.smh.chap09.example.Triangle;

public class Example01 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.makeArea();
		circle.printArea();
		
		
		Triangle triangle = new Triangle(10,5);
		triangle.makeArea();
		triangle.printArea();
	}
	
}
