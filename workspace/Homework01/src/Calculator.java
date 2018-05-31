
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
	
	private void substract(int a, int b) {
		System.out.println("뺄샘 수행");
		result = a - b;
	}
	
	private void multiply(int a, int b) {
		System.out.println("곱샘 수행");
		result = a * b;
	}
	
	private void divide(int a, int b) {
		System.out.println("나눗셈 수행");
		if(b == 0) {
			System.out.println("분모가 0 입니다");
			return;
		}
		result = a / b;
	}
	
	public void printResult() {
		System.out.println("결과: " + result);
	} // private만 무조건 캡슐화 하지 않는다.
	
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
