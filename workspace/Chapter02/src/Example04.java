
public class Example04 {

	public static void main(String[] args) {
		byte by1 = 120;
		byte by2 = 8;
		
		byte by3 = (byte) (by1 + by2); // 정수 형태로 연산 (4 byte) 뒤 byte로 변환
		int i1 = by1 + by2;
		
		System.out.println(by3);
		System.out.println(i1);
		
		float f1 = 1.3f;
		float f2 = 1.5f;
		
		float f3 = f1 + f2;
		
		System.out.println(f3);
		
	}

}
