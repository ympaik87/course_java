package kr.co.smh.chap17;

import kr.co.smh.chap17.example.Apple;
import kr.co.smh.chap17.example.GenericBox;
import kr.co.smh.chap17.example.Orange;

public class Example04 {

	public static void main(String[] args) {
		
		GenericBox<Apple> appleBox = new GenericBox<>();
		appleBox.store(new Apple());
		Apple apple = appleBox.getT();
		
		//appleBox.store(new Orange());	//error
		
		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.store("»ç°ú");
		String apple_str = stringBox.getT();
		
	}
	
}
