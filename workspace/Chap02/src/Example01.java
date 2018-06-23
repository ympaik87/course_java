
public class Example01 {

	public static void main(String[] args) {
		// 변수의 선언 -> 변수를 만드는 행위
		// 변수란? 데이터를 저장 할 수 있는 공간
		// 변수 선언 방법 : 자료형(타입) 변수명;
		
		int a;
		int b;
		
		// 변수를 만들고 나서 반드시 해야 할 것
		// -> 초기화 (변수가 선언되고 값이 최초로 들어가는 작업)
		
		a = 10;
		b = a;
	
		System.out.println(a);
		System.out.println( a + b );
		
		//선언과 동시에 초기화
		// 변수가 만들어 짐과 동시에 값이 초기화 됨
		
		int c = 10;
		a = c + 5;		// c에 5를 더해서 a에 대입		
		
		// 대입은 변수에 값이 들어 있는 상태에서 다른 값이 들어 갈 때
		// 초기화는 변수가 선언되고 값이 최초로 들어 갈 때
//		double d = 3.3;
//		int e = d;
//		d = a;
		
		{
			int f = 0;
			System.out.println(a);
		}
		// 변수의 스코프(범위) 변수가 선언된 중괄호( 코드블럭 )
		// System.out.println(f);
		
		
	}

}
