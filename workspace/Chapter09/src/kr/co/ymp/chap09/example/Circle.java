package kr.co.ymp.chap09.example;

public class Circle extends Shape{
	private int r;
	
	// 생성자에서 반지름 받기
	public Circle(int r) {
		super("원");
		this.r = r;
	}
	
	// 부모클래스에 있는 makeArea()를 자식클래스인 Circle 클래스가 재정의
	// --> override
	public void makeArea() {
		super.area = r * r * 3; // 부모의 넓이값
		// this.area도 가능
	}
	
}
