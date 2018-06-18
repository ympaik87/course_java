package kr.co.ymp.chap17.example;

// Generic: 일반화
// 일반화란?: 하나의 클래스를 특정지어서 그 클래스만 사용하게 해 주겠다. e.g. AppleBox엔 Apple만 사용 가능.
// Object class를 활용한 Box class같은 경우는 모든 자바의 객체가 사용 가능하기 때문에
// Downcasting을 진행해야 하고, instanceof로 계속 타입 검사를 해야한다.(단점)

// Generic을 사용한면 개발자가 직접 클래스의 일반화를 그때그때 다르게 할 수 있다.
public class GenericBox<T> {
	private T t;
	
	public void store(T t) {
		this.t= t;
	}
	
	public T getT() {
		return this.t;
	}
}
