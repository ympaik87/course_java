
public class Example01 {
	public static void main(String[] args) {
		// �ֿܼ� �Է��ϱ�
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("�Է�>> ");
		int n = scanner.nextInt();
		
		System.out.println("�Է��� ��: " + n);
		
		// switch - case
		// -> ������ Ȱ���Ͽ� �ڵ��� ������ ��ġ�� ������ �� �ִ�.
		
		switch(n) { // n�� � ���� �ִ��� �˻��Ͽ�,
		case 1: // 1 �̸� ���⼭ ���� ����.
			System.out.println("1 typed");
			break; // �ڵ��� ������ ���߰ڴ�.
		case 2: // 2 �̸� ���⼭ ���� ����.
			System.out.println("2 typed");
		case 3:
			System.out.println("bye");
			default:
				System.out.println("greeting");
		}
	}
}
