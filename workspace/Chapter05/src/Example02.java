
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
		System.out.println("koo()�� ��ȯ�� ��: " + kooResult);
		
		System.out.println();
		int mooResultA = demo1.moo('a', 10, 30);
		System.out.println("moo()�� ��ȯ�� ��: " + mooResultA);
		
		System.out.println();
		int mooResultB = demo1.moo('b', 10, 30);
		System.out.println("moo()�� ��ȯ�� ��: " + mooResultB);
		
		System.out.println();
		int mooResultElse = demo1.moo('c', 10, 30);
		System.out.println("moo()�� ��ȯ�� ��: " + mooResultElse);
		
	}
}
