
public class Example01 {

	public static void main(String[] args) {
		// ������ ���� -> ������ ����� ����
		// ������? �����͸� ������ �� �ִ� ����
		// ���� ���� ���: �ڷ���(Ÿ��) ������;
		
		int a;
		int b;
		
		// ������ ����� ���� �ݵ�� �� ��
		// --> �ʱ�ȭ: ������ ����ǰ� ���� ���ʷ� ���� �۾�
		
		a = 10;
		b = a;
		
		System.out.println(a);
		System.out.println(a+b);
		
		// ����� ���ÿ� �ʱ�ȭ
		// ������ ����� ���� ���ÿ� ���� �ʱ�ȭ ��
		
		int c = 10;
		a = c + 5; // c�� 5�� ���ؼ� a�� ����
		
		// ������ ������ ���� ��� �ִ� ���¿��� �ٸ� ���� ��� �� ��
		// �ʱ�ȭ�� ������ ����ǰ� ���� ���ʷ� ��� �� ��
		
		double d = 3.3;
//		int e = d;
		int e = (int) d; // �ڷ��� ��ȯ (type casting)
		d = a;
		
		{
			int f = 0;
			System.out.println(a);
		}
		// ������ scope(����) �� �߰�ȣ ��
//		System.out.println(f);
	}

}
