package kr.co.smh.chap16;

public class Example01 {

	public static void main(String[] args) {
		
		//�迭 �����
		// �ڷ���[] ������ = new �ڷ���[����];
		
		int[] arr_score = new int[10];
		
		//�ε��� : �迭 ������ ������ �ǹ��Ѵ�.
		//       0������ ���۵ȴ�.
		//       0�̻��� ��� ������ �� �� �ִ�. (����, �Ǽ��� ��� �Ұ���)
		arr_score[0] = 90;
		arr_score[1] = 80;
		arr_score[2] = 70;
		arr_score[3] = 60;
		arr_score[4] = 50;
		
		arr_score[5] = 40;
		arr_score[6] = 30;
		arr_score[7] = 20;
		arr_score[8] = 10;
		arr_score[9] = 0;
		
		double total = 0;
		
		//������ �ε��� : �迭�� ũ��(����) - 1
		
		for(int i = 0; i < arr_score.length; i++) {
			total += arr_score[i];
		}
		
		System.out.println("��� : " + total / (double)arr_score.length);

		// ��� �� �� �ִ� ������ �ε����� ����� ArrayIndexOutOfBoundException �߻�
		System.out.println(arr_score[10]);
		// �迭 ��ü�� �ѹ� �����Ǹ� �� ũ�Ⱑ ���� �� ����.
		
	}
	
}



