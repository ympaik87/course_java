
public class Example04 {

	public static void main(String[] args) {
		// ���ǹ�
		// ��� ����( ���ǽ� - boolean )�� ���� �ڵ带 �����ϴ� ����
		// true �� �� ����, false �� �� ���� ����
		
		int a = 1;
		int b = 2;
		
		// ���࿡ a�� b���� ������ Hello World! ���ڿ��� ���
		if( a < b ) {
			System.out.println("Hello World!");
			
			if ( a == 1) {
				System.out.println();
			}
		}
		//�װ� �ƴϰ� ���࿡ a�� b���� �۰ų� ������ Bye Bye ���ڿ��� ���
		else if( a <= b ) {
			System.out.println("Bye Bye");
		}
		//�װ� �ƴϰ� a�� b�� ������ Greeting ���ڿ��� ���
		else if( a == b ) {
			System.out.println("Greeting");
		}
		//�װ� �ƴϸ� hihi ���ڿ� ���
		else {
			System.out.println("Hi Hi");
		}
	}
	
}
