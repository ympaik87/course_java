
public class Example05 {
	public static void main(String[] args) {
		// break; continue; 를 이용한 반복 제어
		// break: 반복을 아예 멈춤
		// continue: 반복을 멈추고 처음부터 이어서 함
		
		// 1. break 활용
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("반복 멈춤");
				break;
			}
			System.out.println("반복 붕: "+ i);
		}
		
		// 2. continue 활용
		for(int i=0; i<5; i++) {
			if(i==3) {
				System.out.println("반복 멈추고 이어서 계속");
				continue;
			}
			System.out.println("반복 중: "+ i);
		}
	}
}
