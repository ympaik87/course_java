package kr.co.ymp.chap09;

import kr.co.ymp.chap09.example.Circle;
import kr.co.ymp.chap09.example.Rectangle;
import kr.co.ymp.chap09.example.Triangle;

public class Example01 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.makeArea();
		circle.printArea();
		
		Rectangle rectangle = new Rectangle(3, 4);
		rectangle.makeArea();
		rectangle.printArea();
		
		Triangle triangle = new Triangle(3, 4);
		triangle.makeArea();
		triangle.printArea();
	}

}
