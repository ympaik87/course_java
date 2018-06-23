
public class DemoClass {

	// * 메소드 오버로딩
	// 같은 이름의 메소드를 매개변수만 다르게 해서 여러개 지정 하는 것
	// 매개변수의 자료형, 자료형의 순서, 갯수가 다르면 오버로딩을 할 수 있다.
	
	public void plusTen(int a) {
		System.out.println( a + 10 );
	}
	
	public void plusTen(char ch) {
		System.out.println( (char)(ch + 10) );
	}

	public void plusTen(String a) {
		System.out.println( a + 10 );
	}
	
	public void plusTen(int a, int b) {
		System.out.println(a + b + 10);
	}
	
	public void plusTen(String s, int a) {
		System.out.println( s + a + 10 );
	}
	
	public void plusTen(int a, String s) {
		System.out.println( a + s + 10 );
	}
	

}
