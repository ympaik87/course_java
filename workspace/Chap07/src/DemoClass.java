
public class DemoClass {

	// * �޼ҵ� �����ε�
	// ���� �̸��� �޼ҵ带 �Ű������� �ٸ��� �ؼ� ������ ���� �ϴ� ��
	// �Ű������� �ڷ���, �ڷ����� ����, ������ �ٸ��� �����ε��� �� �� �ִ�.
	
	public void plusTen(int a) {
		System.out.println( a + 10 );
	}
	
	public void plusTen(char ch) {
		System.out.println( (char)(ch + 10) );
	}

	public void plusTen(String a) {
		System.out.println( a + 10 );
	}
	
	public void plusTen(int a, int b) {
		System.out.println(a + b + 10);
	}
	
	public void plusTen(String s, int a) {
		System.out.println( s + a + 10 );
	}
	
	public void plusTen(int a, String s) {
		System.out.println( a + s + 10 );
	}
	

}
