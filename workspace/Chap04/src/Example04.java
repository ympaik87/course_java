
public class Example04 {

	public static void main(String[] args) {
		
		// do ~ while문 특징 : 조건이 애초가 맞지 않더라도 무조건 한번은 실행이 된다.
		
		int n = 0;
		
		do {
			System.out.println("do ~ while 반복 : " + n);
			n++;
		}while( n < 5 );
		
		do {
			System.out.println("두 번째 do ~ while 반복 : " + n);
			n++;
		}while( n < 5 );
		
		System.out.println("프로그램 종료");
		
	}
	
}
