
public class Example02 {

	public static void main(String[] args) {
		
		DemoClass01 demo1 = new DemoClass01();
		demo1.foo();
		System.out.println();
		demo1.goo(1);
		
		System.out.println();
		demo1.goo(5);
		
		System.out.println();
		int kooResult = demo1.koo();
		System.out.println("koo()가 반환한 값 : " + kooResult);
		
		System.out.println();
		int mooResult1 = demo1.moo('a', 10, 20);
		System.out.println("moo의 첫 번째 결과 : " + mooResult1);
		
		System.out.println();
		int mooResult2 = demo1.moo('b', 10, 20);
		System.out.println("moo의 두 번째 결과 : " + mooResult2);
		
		System.out.println();
		int mooResult3 = demo1.moo('c', 10, 20);
		System.out.println("moo의 세 번째 결과 : " + mooResult3);
		

	}
	
}
