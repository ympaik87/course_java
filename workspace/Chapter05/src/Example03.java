
public class Example03 {
	public static void main(String[] args) {
		DemoClass02 demo2 = new DemoClass02();
		demo2.moo(5);
		
		System.out.println();
		demo2.moo(demo2.foo(5));
		
		System.out.println();
//		demo2.foo(demo2.moo(10)); --> moo의 return값이 없기에 에러
	}
}
