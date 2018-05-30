
public class Example01 {
	public static void main(String[] args) {
		DemoClass01 demo1 = new DemoClass01();
		demo1.public_int = 10;
		demo1.foo();
		
//		demo1.private_int = 5; Error. private_int는 DemoClass01에서만 사용 가능 변수
		demo1.goo();
	}
	
}
