
public class Example03 {

	public static void main(String[] args) {
		
		//while, do ~ while --> 조건제 반복이다.
		
		// while(조건식){
		//    실행할 문장
		// }
		
		// while의 특징 : 조건식이 맞지 않으면 한번도 실행이 안될 수 있다.
		
		int n = 0;
		
		while( n < 5 ) {
			System.out.println("while 반복 : " + n);
			n++;
		}
		
		while( n < 5 ) {
			System.out.println("두 번째 while 반복 : " + n);
			n++;
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}





