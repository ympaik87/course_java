package kr.co.smh.chap15.demo;

import kr.co.smh.chap15.exception.MyException;

public class DemoA {

	public void foo() {
		System.out.println("DemoA.foo()");
	}
	
	
					//throws : �޼ҵ带 ȣ�� ���� �� ���ܰ� �� ���̴� ��� ���� �̸� �˷���
	public void goo(int a) throws MyException{
		
		//a�� ¦���� ����
		if(a % 2 == 0) {
			//���� ��ü ���� �� catch�� ������
			throw new MyException();
		}
		
		System.out.println(a);
		
	}
	
}
