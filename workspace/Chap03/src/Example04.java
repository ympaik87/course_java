
public class Example04 {

	public static void main(String[] args) {
		// 조건문
		// 어떠한 조건( 조건식 - boolean )에 따라서 코드를 실행하는 문법
		// true 일 때 실행, false 일 때 실행 안함
		
		int a = 1;
		int b = 2;
		
		// 만약에 a가 b보다 작으면 Hello World! 문자열을 출력
		if( a < b ) {
			System.out.println("Hello World!");
			
			if ( a == 1) {
				System.out.println();
			}
		}
		//그게 아니고 만약에 a가 b보다 작거나 같으면 Bye Bye 문자열을 출력
		else if( a <= b ) {
			System.out.println("Bye Bye");
		}
		//그게 아니고 a와 b가 같으면 Greeting 문자열을 출력
		else if( a == b ) {
			System.out.println("Greeting");
		}
		//그게 아니면 hihi 문자열 출력
		else {
			System.out.println("Hi Hi");
		}
	}
	
}
