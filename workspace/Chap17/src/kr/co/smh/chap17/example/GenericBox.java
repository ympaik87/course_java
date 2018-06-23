package kr.co.smh.chap17.example;

//제네릭 : 일반화
// 일반화란? : 하나의 클래스를 특정지어서 그 클래스만 사용하게 해 주겠다. ex) AppleBox엔 Apple만 사용 가능
// Object 클래스를 활용한 Box 클래스 같은 경우는 모든 자바의 객체가 사용 가능 하기 때문에
// DownCasting 을 진행해야 하고, instanceof로 계속 타입 검사를 해야 한다.

// 제네릭을 사용하면 개발자가 직접 클래스의 일반화를 그때그때 다르게 할 수 있다.
public class GenericBox <T> {

	private T t;
	
	public void store(T t) {
		this.t = t;
	}
	public T getT() {
		return this.t;
	}
	
}
