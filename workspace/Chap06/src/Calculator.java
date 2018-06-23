import java.util.concurrent.SynchronousQueue;

public class Calculator {
	private int result;
	
	//계산 전에 반드시 수행 되어야 할 알고리즘 메소드
	private void doAlgorithm() {
		System.out.println("알고리즘 수행!");
	}
	
	private void add(int a, int b) {
		System.out.println("덧셈 수행");
		result = a + b;
	}
	
	private void min(int a, int b) {
		System.out.println("뺄셈 수행");
		result = a - b;
	}
	
	private void mul(int a, int b) {
		System.out.println("곱셈 수행");
		result = a * b;
	}
	
	private void div(int a, int b) {
		System.out.println("나눗셈 수행");
		
		if(b == 0) {
			System.out.println("b는 0일 수 없습니다.");
			return;
		}
		
		result = a / b;
	}
	
	public void printResult() {
		System.out.println("결과 : " + result);
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




