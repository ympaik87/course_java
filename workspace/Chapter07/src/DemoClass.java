
public class DemoClass {
	
	// method overloading이란?
	// 같은 이름의 메소드를 매개변수로만 다르게 해서 여러개 지정하는 것
	// 매개변수의 자료형, 자료형의 순서, 갯수가 다르면 오버로딩을 할 수 있다.
	
	public void addTen(int a) {
		System.out.println(a + 10);
	}
	
	public void addTen(char ch) {
		System.out.println((char)(ch + 10));
	}
	
	public void addTen(String a) {
		System.out.println(a + 10);
	}
	
	public void addTen(int a, int b) {
		System.out.println(a + b + 10);
	}
	
	public void addTen(String s, int a) {
		System.out.println(s + a + 10);
	}
	
	public void addTen(int a, String s) {
		System.out.println(a + s + 10);
	}
}
