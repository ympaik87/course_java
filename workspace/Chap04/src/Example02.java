
public class Example02 {

	public static void main(String[] args) {
		
		//for -> Ƚ������ �����ϴ�
		
		//for(1. �ݺ� �ʱ⺯�� ����; 2. (1)�� ���� ���� �˻�; 4. (1) ����){
		
				// 3. (2)�� ����� true�� �� ���� �� ���� 
		
		//}
		
		// �ݺ� ���� : 1->2->3->4->2->3->4... (2)�� ������ false �� ������ �ݺ��Ѵ�.
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println( "�ݺ��� : " + i );
			
			for(int j = 1; j < 9; j+=2) {
				System.out.println("  j �ݺ� : " + j);
			}
			
		}
		
		
	}
	
}
