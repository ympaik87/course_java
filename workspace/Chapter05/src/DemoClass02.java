
public class DemoClass02 {
	
	int foo(int a) {
		System.out.println("foo(int): " + a);
		return a;
	}
	
	int goo() {
		System.out.println("goo()");
		return 10;
	}
	
	void moo(int i) {
		
		i += goo();
		
		System.out.println("moo(int): " + i);
	}
}
