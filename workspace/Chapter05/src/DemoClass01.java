
public class DemoClass01 {
	
	// method: class가 객체가 되었을 때 할 수 있는 기능(행위)
	
	// * 매개변수: 메소드를 실행할 때 필요한 재료가 되는 데이터를 담아 놓는 변수
	// * 리턴값: 메소드를 실행하고 나서의 결과
	
	// 리턴값이 없을 시 리턴형에 void를 적는다.
	// 리턴형 메소드명 (매개변수 ...) {
	//
	//		실행할 매소드
	//
	// }
	
	// 1) 매개변수 x, 리턴값 x
	void foo() {
		System.out.println("매개변수 x, 리턴값 x");
		System.out.println("foo() 실행");
	}
	
	// 2) 매개변수 o, 리턴값 x. 매개변수 초기화 필요 없음.
	void goo(int param1) {
		System.out.println("매개변수 o, 리턴값 x");
		System.out.println("goo(int) 실행: " + param1);
	}
	
	// 3) 매개변수 x, 리턴값 o
	int koo() {
		System.out.println("매개변수 x, 리턴값 o");
		System.out.println("int koo() 실행");
		
		// koo 메소드의 호출 했을 때 리턴 값은 5
		return 5;
		
		// return 키워드는 값을 반환한 뒤 메소드를 종료하기 때문에
		// return 키워드 밑에 어떠한 코드도 들어 갈 수 없다.
	}
	
	// 4) 매개변수 o, 리턴값 o
	int moo(char ch, int first, int second) {
		if(ch == 'a') {
			System.out.println("덧샘을 수행 합니다.");
			return first + second;
		}else if(ch == 'b') {
			System.out.println("뺄샘을 수행 합니다.");
			return first - second;
		}else {
			System.out.println("잘못된 기호 입니다.");
			return -9999;
		}
		
	}
	
}
