
public class DemoA {

	// 생성자 (constructor)
	// 클래스가 객체가 되는 과정을 설명해 놓음
	// 객체가 생성 되면서 (new 하면서) 해야 할 일들
	// 대부분 해당 클래스의 멤버변수를 초기화 시켜주는 역할을 한다.
	// 즉 객체가 최초로 만들어 지면서 유지해야 할 생태를 만들어 준다. (초기화)
	
	// 개발자가 직접 생성자를 만들지 않으면 컴파일러가 직접 기본 생성자를 만들어 낸다.
	// -> default constructor
	
	private int a;
	
	public DemoA(int _a) {
		a = _a; // 객체가 만들어 지면서 멤버변수를 초기화
		System.out.println("DemoA 생성 " + a);
	}
	
	public DemoA() {
		System.out.println("DemoA 생성");
	}
	
}
