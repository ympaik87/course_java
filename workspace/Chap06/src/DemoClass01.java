

public class DemoClass01 {

	//���� ���� ������
	// Ŭ������ ���(�������, �޼ҵ� ���)�� �ܺο��� ������ ��� ���� ������ �����Ѵ�.
	// public  -> ��ü ���� ( ������Ʈ ��𿡼��� ��� )
	// private -> Ŭ���� ���ο����� ���
	
	public int public_int = 0;	//public_int ������ ��𿡼��� ��� �� �� ����.
	
	private int private_int = 0; //private_int ������ Ŭ���� ���ο����� ��밡��
	
	public void foo() {
		System.out.println("foo() ȣ��");
		
		System.out.println(public_int);
	}
	
	public void goo() {
		System.out.println("goo() ȣ��");
		
		System.out.println(private_int);
	}
	
	
}
