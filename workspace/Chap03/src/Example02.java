
public class Example02 {

	public static void main(String[] args) {
		boolean result1 = 2 < 5;
		// �� ������ NOT ( ! )
		//  ==> ���� ���� ( true�� false��, false�� true�� )
		
		System.out.println( result1 );
		System.out.println( !result1 );
		
		System.out.println( !( 2 > 5 ) );
		
		System.out.println( 2 < 5 && 5 < 6 );	//2�� 5���� �۰�, 5�� 6���� �۴�
		System.out.println( 2 > 5 && 5 < 6 );	//2�� 5���� ũ��, 5�� 6���� �۴�.
		
		System.out.println( 2 > 5 || 5 < 6 );	//2�� 5���� ũ�ų�, 5�� 6���� �۴�.
		
		
	}
	
}
