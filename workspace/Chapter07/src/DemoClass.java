
public class DemoClass {
	
	// method overloading�̶�?
	// ���� �̸��� �޼ҵ带 �Ű������θ� �ٸ��� �ؼ� ������ �����ϴ� ��
	// �Ű������� �ڷ���, �ڷ����� ����, ������ �ٸ��� �����ε��� �� �� �ִ�.
	
	public void addTen(int a) {
		System.out.println(a + 10);
	}
	
	public void addTen(char ch) {
		System.out.println((char)(ch + 10));
	}
	
	public void addTen(String a) {
		System.out.println(a + 10);
	}
	
	public void addTen(int a, int b) {
		System.out.println(a + b + 10);
	}
	
	public void addTen(String s, int a) {
		System.out.println(s + a + 10);
	}
	
	public void addTen(int a, String s) {
		System.out.println(a + s + 10);
	}
}
