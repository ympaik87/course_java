package kr.co.smh.chap12;

import kr.co.smh.chap12.demo.DemoA;
import kr.co.smh.chap12.demo.DemoB;
import kr.co.smh.chap12.demo.DemoBImpl;
import kr.co.smh.chap12.demo.DemoC;
import kr.co.smh.chap12.demo.IDemoA;

public class Example01 {

	public static void main(String[] args) {
		
		//�������̽� UpCasting
		IDemoA demoA = new DemoA();
		demoA.foo();
		//DemoB demoB = new DemoBImpl();
		
		// DemoC�� IDemoA, DemoB �������̽��� ���� �޾ұ� ������
		// �� ���� ���·� UpCasting�� �����ϴ�.
		IDemoA demo1 = new DemoC();
		DemoB demob = new DemoC();
		
		
	}
	
}
