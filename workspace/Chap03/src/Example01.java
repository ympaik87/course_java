
public class Example01 {

	public static void main(String[] args) {
		//증감( 증가 : ++, 감소 : -- )
		int a1 = 1;
		
		//전위 증감 : 문장이 끝나기 전( 세미콜론을 만나기 전 )에 증감 된다.
		System.out.println( ++a1 );
		
		//후위 증감 : 문장이 끝난 후에 증감 된다.
		System.out.println( a1++ ); 
		System.out.println( a1 );

		int a2 = 0;
//		System.out.println( a2+(++a2) );
//		System.out.println( a2 );
		
//		System.out.println( ++a2 + a2++ );
//		System.out.println( a2 );
	}
	
}
