package kr.co.ymp.chap09.example;

public class Shape {

	protected double area;
	private String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public void printArea() {
		System.out.println(this.shapeName + "의 넓이: " + this.area);
	}
	
	public void makeArea() {
		System.out.println(this.shapeName + "의 넓이를 구하는 중");
	}
	
}
