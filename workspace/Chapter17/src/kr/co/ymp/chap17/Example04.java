package kr.co.ymp.chap17;

import kr.co.ymp.chap17.example.Apple;
import kr.co.ymp.chap17.example.GenericBox;
//import kr.co.ymp.chap17.example.Orange;

public class Example04 {
	public static void main(String[] args) {
		GenericBox<Apple> appleBox = new GenericBox<>();
		appleBox.store(new Apple());
		Apple apple = appleBox.getT();
		
		
//		appleBox.store(new Orange()); // error: type�� Apple class�� ���� ��������
		
		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.store("���");
		String apple_str = stringBox.getT();
		
	}
}
