package kr.co.ymp.chap12;

import kr.co.ymp.chap12.demo.DemoA;
import kr.co.ymp.chap12.demo.DemoB;
import kr.co.ymp.chap12.demo.DemoC;
import kr.co.ymp.chap12.demo.IDemoA;

public class Example01 {
	public static void main(String[] args) {
		// �������̽� Up Casting
		IDemoA demoA = new DemoA();
		demoA.foo();
		// DemoB demoB = new Demo
		
		// DemoC�� IDemoA, DemoB �������̽��� ���� �޾ұ� ������
		// �� ���� ���·� Up Casting�� �����ϴ�.
		IDemoA demo1 = new DemoC();
		DemoB demob = new DemoC();
		
		
	}
}
