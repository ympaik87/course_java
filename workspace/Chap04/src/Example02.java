
public class Example02 {

	public static void main(String[] args) {
		
		//for -> 횟수제에 유리하다
		
		//for(1. 반복 초기변수 설정; 2. (1)에 대한 조건 검사; 4. (1) 증감){
		
				// 3. (2)의 결과가 true일 때 실행 할 문장 
		
		//}
		
		// 반복 순서 : 1->2->3->4->2->3->4... (2)의 조건이 false 일 때까지 반복한다.
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println( "반복중 : " + i );
			
			for(int j = 1; j < 9; j+=2) {
				System.out.println("  j 반복 : " + j);
			}
			
		}
		
		
	}
	
}
