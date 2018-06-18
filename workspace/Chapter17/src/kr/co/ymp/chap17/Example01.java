package kr.co.ymp.chap17;

public class Example01 {
	public static void main(String[] args) {
		int a = 5; // a��� �⺻ �ڷ����� 5�� �����ߴ�.
		
		Integer b = new Integer(5); // 5��� ���� Integer class�� Boxing
									// �⺻�ڷ����� Heap �޸𸮿� ��ġ ������.
		System.out.println(b.intValue()); // b�� ���ΰ� �ִ� �⺻ �ڷ����� �����´�. --> Unboxing
		
		
		Double d = new Double(1.123); // 1.123 �⺻ �ڷ����� Double�� Boxing
		System.out.println(d.doubleValue()); // unboxing
		
		Integer auto_val = 5; // new�� ���� �ʰ� �ڵ����� boxing (auto boxing)
		System.out.println(auto_val + 5); // auto unboxing
		
		
		// parsing --> ���ڿ��� ���� ���ϴ� Ÿ������
		System.out.println("100" + 100); // 100100 (���ڿ� + ����)
		
		// ���ϴ� �⺻ �ڷ����� ����Ŭ����. parse class �̸� ("parsing�� ���ڿ�")
		System.out.println(Integer.parseInt("100") + 100);
		System.out.println(Double.parseDouble("1.123") + 0.5);
//		System.out.println(Integer.parseInt("1.123")); // --> number format exception
		
		System.out.println(Boolean.parseBoolean("true") ? "Hello": "Bye");
		System.out.println(Boolean.parseBoolean("false") ? "Hello": "Bye");
		System.out.println(Boolean.parseBoolean("324") ? "Hello": "Bye");
	}
}
