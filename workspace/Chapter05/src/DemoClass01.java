
public class DemoClass01 {
	
	// method: class�� ��ü�� �Ǿ��� �� �� �� �ִ� ���(����)
	
	// * �Ű�����: �޼ҵ带 ������ �� �ʿ��� ��ᰡ �Ǵ� �����͸� ��� ���� ����
	// * ���ϰ�: �޼ҵ带 �����ϰ� ������ ���
	
	// ���ϰ��� ���� �� �������� void�� ���´�.
	// ������ �޼ҵ�� (�Ű����� ...) {
	//
	//		������ �żҵ�
	//
	// }
	
	// 1) �Ű����� x, ���ϰ� x
	void foo() {
		System.out.println("�Ű����� x, ���ϰ� x");
		System.out.println("foo() ����");
	}
	
	// 2) �Ű����� o, ���ϰ� x. �Ű����� �ʱ�ȭ �ʿ� ����.
	void goo(int param1) {
		System.out.println("�Ű����� o, ���ϰ� x");
		System.out.println("goo(int) ����: " + param1);
	}
	
	// 3) �Ű����� x, ���ϰ� o
	int koo() {
		System.out.println("�Ű����� x, ���ϰ� o");
		System.out.println("int koo() ����");
		
		// koo �޼ҵ��� ȣ�� ���� �� ���� ���� 5
		return 5;
		
		// return Ű����� ���� ��ȯ�� �� �޼ҵ带 �����ϱ� ������
		// return Ű���� �ؿ� ��� �ڵ嵵 ��� �� �� ����.
	}
	
	// 4) �Ű����� o, ���ϰ� o
	int moo(char ch, int first, int second) {
		if(ch == 'a') {
			System.out.println("������ ���� �մϴ�.");
			return first + second;
		}else if(ch == 'b') {
			System.out.println("������ ���� �մϴ�.");
			return first - second;
		}else {
			System.out.println("�߸��� ��ȣ �Դϴ�.");
			return -9999;
		}
		
	}
	
}
