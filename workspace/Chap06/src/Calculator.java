import java.util.concurrent.SynchronousQueue;

public class Calculator {
	private int result;
	
	//��� ���� �ݵ�� ���� �Ǿ�� �� �˰��� �޼ҵ�
	private void doAlgorithm() {
		System.out.println("�˰��� ����!");
	}
	
	private void add(int a, int b) {
		System.out.println("���� ����");
		result = a + b;
	}
	
	private void min(int a, int b) {
		System.out.println("���� ����");
		result = a - b;
	}
	
	private void mul(int a, int b) {
		System.out.println("���� ����");
		result = a * b;
	}
	
	private void div(int a, int b) {
		System.out.println("������ ����");
		
		if(b == 0) {
			System.out.println("b�� 0�� �� �����ϴ�.");
			return;
		}
		
		result = a / b;
	}
	
	public void printResult() {
		System.out.println("��� : " + result);
	}
	
	public void doCalc(int a, int b, char op) {
		doAlgorithm();
		
		switch(op) {
		case '+' :
			add(a,b);
			break;
		case '-' :
			min(a,b);
			break;
		case '*' :
			mul(a,b);
			break;
		case '/' :
			break;
		}
		
		
		printResult();
	}
	
	public void test(int a, int b) {
		div(a,b);
		printResult();
	}
	
}




