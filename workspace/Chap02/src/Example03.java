
public class Example03 {

	public static void main(String[] args) {
		//boolean 논리 연산자. true, false 저장
		// true, false => 논리값( 조건 )
		
		// 연산자 ( operator )
		// 변수 또는 값을 사용하여 어떠한 연산을 하게 하는 기호
		
		int a = 5;
		int b = 3;
		
		int c = a + b;
		
		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a % b );

		System.out.println( c );
		System.out.println( ( 2 + 2 ) * 2 );
		
		double d1 = 1.5;
		double d2 = 3.0;
		
		System.out.println( d2 / d1 );
		
		
		double d3 = 5;
		double d4 = 2;
		
		System.out.println( d3 / d4 );
		
		System.out.println( d3 / 2 );
		
		
		// 비교 연산자 ( 부등호 )
		boolean b1 = 10 > 5;
		System.out.println( b1 );
		
		boolean b2 = 10 < 5;
		System.out.println( b2 );
		
		a = 10;
		b = 11;
		
		boolean b3 = a >= b;
		System.out.println( b3 );
		
		boolean b4 = a <= b;
		System.out.println( b4 );
		
		boolean b5 = a == b;
		System.out.println( b5 );
		
		boolean b6 = a != b;
		System.out.println( b6 );
	
		
	}
	
}



