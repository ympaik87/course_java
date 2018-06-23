
public class Example02 {

	public static void main(String[] args) {
		boolean result1 = 2 < 5;
		// 논리 연산자 NOT ( ! )
		//  ==> 부정 연산 ( true를 false로, false를 true로 )
		
		System.out.println( result1 );
		System.out.println( !result1 );
		
		System.out.println( !( 2 > 5 ) );
		
		System.out.println( 2 < 5 && 5 < 6 );	//2가 5보다 작고, 5가 6보다 작다
		System.out.println( 2 > 5 && 5 < 6 );	//2가 5보다 크고, 5가 6보다 작다.
		
		System.out.println( 2 > 5 || 5 < 6 );	//2가 5보다 크거나, 5가 6보다 작다.
		
		
	}
	
}
