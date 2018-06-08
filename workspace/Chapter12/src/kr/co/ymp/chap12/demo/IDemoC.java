package kr.co.ymp.chap12.demo;

// 인터페이스는 인터페이스를 확장할 수 있다.
public interface IDemoC extends IDemoA, DemoB {
	void demoCMethod();
}
