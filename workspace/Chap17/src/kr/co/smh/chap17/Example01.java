package kr.co.smh.chap17;

public class Example01 {

	public static void main(String[] args) {
		int a = 5;	//a라는 정수 기본 자료형에 5를 대입했다.
		
		Integer b = new Integer(5);	//5라는 값을 Integer 클래스로 Boxing
									//기본자료형을 Heap 메모리에 위치 시켰음
		
		System.out.println(b.intValue());	//b가 감싸고 있던 기본 자료형을 가져온다.
											// UnBoxing
		
		Double d = new Double(1.123);	// 1.123 기본 자료형을 Double로 Boxing
		System.out.println(d.doubleValue()); //UnBoxing
		
		Integer auto_var = 5;	//auto boxing
		System.out.println(auto_var + 5);	//auto_var UnBoxing
		
		
		//parsing -> 문자열을 내가 원하는 타입으로
		System.out.println("100" + 100);	//100100 ( 문자열 + 정수 )
		
		//원하는 기본 자료형의 래퍼클래스.parse클래스이름("parsing할 문자열")
		System.out.println(Integer.parseInt("100") + 100);
		System.out.println(Double.parseDouble("1.123") + 0.5);
		//System.out.println(Integer.parseInt("1.123"));
		
		System.out.println(Boolean.parseBoolean("false") ? "Hello" : "Bye");
		
	}
	
}


