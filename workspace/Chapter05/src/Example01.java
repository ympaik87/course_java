
public class Example01 {
	public static void main(String[] args) {
		
		// 참조 자료형: class
		// 참조 변수: 참조 자료형으로 만든 변수
		// 		-> 참조 변수에는 객체의 메모리 주소 값이 들어간다.
		
		// * Class: 객체가 가지고 있어야 할 데이터, 부품, 기능(행위 - method)를 명세만 해 놓은 것
		// * 객체: class를 통해 만들어진 실제 사용 할 수 있는 것. (new class)
		// * new: class를 이용해 새로운 객체를 만든다.
		// * Heap: new를 이용해 만들어진 객체가 할당되는 메모리 공간
		
		Car c1 = new Car(); // Heap 메모리에 Car 클래스의 새로운 객체를 만든다.
							// Heap에 객체가 할당되면 Car의 데이터인 brand, cc, seats가 새로 만들어 진다.
							// 만들어진 객체는 메모리 주소값(참조값)을 발생하며, 참조 변수인 c1에 대입한다.
		
		// 접근 연산자 (참조 연산자) --> . 연산자
		// 	참조 변수에 들어있는 객체의 메모리 주소 값을 이용해 Heap 메모리에 할당된 객체에 접근하여
		// 	그 객체 안에 있는 요소를 (데이터, 부품, 메소드)를 사용할 수 있게 해주는 연산자.
		c1.brand = "K3";
		c1.cc = 1900;
		c1.seats = 5;
		
		Car c2 = new Car();
		Car c3 = c1; // c1에 저장되 있는 객체의 메모리 주소값이 c3에 대입.
					 // - c1과 c3는 같은 객체를 참조 하고 있다.
		
		c3.cc = 2000;
		System.out.println(c1.cc); // 2000
		
		c2 = c1; // c2가 원래 참조 하고 있던 객체의 참조 카운트는 0
				 // 객체의 참조 카운트 (reference count)가 0이 되면 Garbage Collector가
				 // Heap memory에 위치한 객체를 삭제한다.
		
	}
}
