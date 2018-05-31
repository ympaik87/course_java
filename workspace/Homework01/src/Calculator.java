
public class Calculator {
	private int result;
	
	// ��� ���� �ݵ�� ���� �Ǿ�� �� �˰��� �޼ҵ�
	private void doAlgorithm() {
		System.out.println("�˰��� ����!");
	}
	
	private void add(int a, int b) {
		System.out.println("���� ����");
		result = a + b;
	}
	
	private void substract(int a, int b) {
		System.out.println("���� ����");
		result = a - b;
	}
	
	private void multiply(int a, int b) {
		System.out.println("���� ����");
		result = a * b;
	}
	
	private void divide(int a, int b) {
		System.out.println("������ ����");
		if(b == 0) {
			System.out.println("�и� 0 �Դϴ�");
			return;
		}
		result = a / b;
	}
	
	public void printResult() {
		System.out.println("���: " + result);
	} // private�� ������ ĸ��ȭ ���� �ʴ´�.
	
	public void doCalc(int a, int b, char op) {
		doAlgorithm();
		
		switch(op) {
		case '+':
			add(a, b);
			break;
		case '-':
			substract(a, b);
			break;
		case '/':
			divide(a, b);
			break;
		case '*':
			multiply(a, b);
			break;
		}
		printResult();
	}
	
	public void test(int a, int b) {
		System.out.println("TDD");
		substract(a, b);
	}
}
