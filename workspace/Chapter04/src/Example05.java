
public class Example05 {
	public static void main(String[] args) {
		// break; continue; �� �̿��� �ݺ� ����
		// break: �ݺ��� �ƿ� ����
		// continue: �ݺ��� ���߰� ó������ �̾ ��
		
		// 1. break Ȱ��
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("�ݺ� ����");
				break;
			}
			System.out.println("�ݺ� ��: "+ i);
		}
		
		// 2. continue Ȱ��
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("�ݺ� ���߰� �̾ ���");
				continue;
			}
			System.out.println("�ݺ� ��: "+ i);
		}
	}
}
