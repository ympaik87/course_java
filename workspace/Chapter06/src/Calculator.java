
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
	
	public void printResult() {
		System.out.println("���: " + result);
	} // private�� ������ ĸ��ȭ ���� �ʴ´�.
	
	public void doCalc(int a, int b) {
		doAlgorithm();
		add(a, b);
		printResult();
	}
}
