package kr.co.ymp.chap16;

public class Example01 {
	public static void main(String[] args) {

		// �迭 �����
		// �ڷ��� [] ������ = new �ڷ���[����];

		int[] arr_score = new int[5];

		// index: �迭 ������ ������ �ǹ��Ѵ�.
		// 0�� ���� �����Ѵ�.
		// 0�̻��� ��� ������ �� �� �ִ�. (����, �Ǽ��� ��� �Ұ���)
		arr_score[0] = 90;
		arr_score[1] = 50;
		arr_score[2] = 83;
		arr_score[3] = 39;
		arr_score[4] = 29;

		double total = 0;
		
		// ������ index: �迭�� ũ��(����) - 1

		for (int i = 0; i < arr_score.length; i++) {
			total += arr_score[i];
		}

		System.out.println("���: " + total / (double) arr_score.length);
		
//		����� �� �ִ� ������ �ε����� ����� ArrayIndexOutOfBoundsException �߻�
//		System.out.println(arr_score[10]);
		
		// �迭 ��ü�� �ѹ� �����Ǹ� �� ũ�Ⱑ ���� �� ����.
		
	}
}
