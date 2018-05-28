
public class Example04 {

	public static void main(String[] args) {
		// do - while: 특징: 조건이 애초에 맞지 않더라고 무조건 한번 실행.
		
		
		int n = 0;
		
		do {
			System.out.println("while 반복: "+ n);
			n++;
		}while(n<5);
		
		do{
			System.out.println("두번째 do-while 반복: "+n);
			n++;
		}while(n<5);
		System.out.println("프로그램 종료");
	}

}
