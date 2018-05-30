
public class Calculator {
	private int result;
	
	// 계산 전에 반드시 수행 되어야 할 알고리즘 메소드
	private void doAlgorithm() {
		System.out.println("알고리즘 수행!");
	}
	
	private void add(int a, int b) {
		System.out.println("덧샘 수행");
		result = a + b;
	}
	
	public void printResult() {
		System.out.println("결과: " + result);
	} // private만 무조건 캡슐화 하지 않는다.
	
	public void doCalc(int a, int b) {
		doAlgorithm();
		add(a, b);
		printResult();
	}
}
