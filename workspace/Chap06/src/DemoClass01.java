

public class DemoClass01 {

	//접근 제어 지시자
	// 클래스의 요소(멤버변수, 메소드 등등)를 외부에서 접근을 허용 할지 말지를 결정한다.
	// public  -> 전체 공개 ( 프로젝트 어디에서든 사용 )
	// private -> 클래스 내부에서만 사용
	
	public int public_int = 0;	//public_int 변수는 어디에서나 사용 할 수 있음.
	
	private int private_int = 0; //private_int 변수는 클래스 내부에서만 사용가능
	
	public void foo() {
		System.out.println("foo() 호출");
		
		System.out.println(public_int);
	}
	
	public void goo() {
		System.out.println("goo() 호출");
		
		System.out.println(private_int);
	}
	
	
}
