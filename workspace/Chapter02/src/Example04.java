
public class Example04 {

	public static void main(String[] args) {
		byte by1 = 120;
		byte by2 = 8;
		
		byte by3 = (byte) (by1 + by2); // ���� ���·� ���� (4 byte) �� byte�� ��ȯ
		int i1 = by1 + by2;
		
		System.out.println(by3);
		System.out.println(i1);
		
	}

}
