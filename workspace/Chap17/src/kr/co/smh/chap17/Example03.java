package kr.co.smh.chap17;

import kr.co.smh.chap17.example.Apple;
import kr.co.smh.chap17.example.Box;

public class Example03 {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.store(new Apple());
		Apple apple = (Apple)box.getItem();
		
		
		box.store("���");
		String apple_str = (String)box.getItem();
		Apple apple_object = (Apple)box.getItem();	//error
										//���ڿ� "���"�� ���� �־��µ� Apple ��ü�� ������ ����
										// ���ܰ� �߻������� �ƹ��� ó���� ���� ����
										// instanceof �� �ذ� ����
		
		//���ڿ��� ���� �������� instanceof�� �����ϸ� ��
		Object boxItem = box.getItem();
		if(boxItem instanceof String) {
			
		}else if (boxItem instanceof Apple) {
			
		}
		
		
		
	}
	
}
