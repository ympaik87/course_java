
public class Example01 {
	public static void main(String[] args) {
		// 콘솔에 입력하기
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("입력>> ");
		int n = scanner.nextInt();
		
		System.out.println("입력한 값: " + n);
		
		// switch - case
		// -> 변수를 활용하여 코드의 시작할 위치를 지정할 수 있다.
		
		switch(n) { // n에 어떤 값이 있는지 검사하여,
		case 1: // 1 이면 여기서 부터 시작.
			System.out.println("1 typed");
			break; // 코드의 진행을 멈추겠다.
		case 2: // 2 이면 여기서 부터 시작.
			System.out.println("2 typed");
		case 3:
			System.out.println("bye");
			default:
				System.out.println("greeting");
		}
	}
}
