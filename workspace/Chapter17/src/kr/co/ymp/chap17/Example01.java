package kr.co.ymp.chap17;

public class Example01 {
	public static void main(String[] args) {
		int a = 5; // a라는 기본 자료형에 5를 대입했다.
		
		Integer b = new Integer(5); // 5라는 값을 Integer class로 Boxing
									// 기본자료형을 Heap 메모리에 위치 시켰음.
		System.out.println(b.intValue()); // b가 감싸고 있던 기본 자료형을 가져온다. --> Unboxing
		
		
		Double d = new Double(1.123); // 1.123 기본 자료형을 Double로 Boxing
		System.out.println(d.doubleValue()); // unboxing
		
		Integer auto_val = 5; // new를 하지 않고 자동으로 boxing (auto boxing)
		System.out.println(auto_val + 5); // auto unboxing
		
		
		// parsing --> 문자열을 내가 원하는 타입으로
		System.out.println("100" + 100); // 100100 (문자열 + 정수)
		
		// 원하는 기본 자료형의 래퍼클래스. parse class 이름 ("parsing할 문자열")
		System.out.println(Integer.parseInt("100") + 100);
		System.out.println(Double.parseDouble("1.123") + 0.5);
//		System.out.println(Integer.parseInt("1.123")); // --> number format exception
		
		System.out.println(Boolean.parseBoolean("true") ? "Hello": "Bye");
		System.out.println(Boolean.parseBoolean("false") ? "Hello": "Bye");
		System.out.println(Boolean.parseBoolean("324") ? "Hello": "Bye");
	}
}
