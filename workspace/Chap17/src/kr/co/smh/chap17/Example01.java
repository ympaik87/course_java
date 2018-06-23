package kr.co.smh.chap17;

public class Example01 {

	public static void main(String[] args) {
		int a = 5;	//a��� ���� �⺻ �ڷ����� 5�� �����ߴ�.
		
		Integer b = new Integer(5);	//5��� ���� Integer Ŭ������ Boxing
									//�⺻�ڷ����� Heap �޸𸮿� ��ġ ������
		
		System.out.println(b.intValue());	//b�� ���ΰ� �ִ� �⺻ �ڷ����� �����´�.
											// UnBoxing
		
		Double d = new Double(1.123);	// 1.123 �⺻ �ڷ����� Double�� Boxing
		System.out.println(d.doubleValue()); //UnBoxing
		
		Integer auto_var = 5;	//auto boxing
		System.out.println(auto_var + 5);	//auto_var UnBoxing
		
		
		//parsing -> ���ڿ��� ���� ���ϴ� Ÿ������
		System.out.println("100" + 100);	//100100 ( ���ڿ� + ���� )
		
		//���ϴ� �⺻ �ڷ����� ����Ŭ����.parseŬ�����̸�("parsing�� ���ڿ�")
		System.out.println(Integer.parseInt("100") + 100);
		System.out.println(Double.parseDouble("1.123") + 0.5);
		//System.out.println(Integer.parseInt("1.123"));
		
		System.out.println(Boolean.parseBoolean("false") ? "Hello" : "Bye");
		
	}
	
}


