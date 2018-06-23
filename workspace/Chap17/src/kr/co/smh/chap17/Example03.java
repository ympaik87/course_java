package kr.co.smh.chap17;

import kr.co.smh.chap17.example.Apple;
import kr.co.smh.chap17.example.Box;

public class Example03 {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.store(new Apple());
		Apple apple = (Apple)box.getItem();
		
		
		box.store("사과");
		String apple_str = (String)box.getItem();
		Apple apple_object = (Apple)box.getItem();	//error
										//문자열 "사과"를 집어 넣었는데 Apple 객체로 꺼내고 있음
										// 예외가 발생하지만 아무런 처리가 되지 않음
										// instanceof 로 해결 가능
		
		//상자에서 꺼낸 아이템을 instanceof로 검증하면 됨
		Object boxItem = box.getItem();
		if(boxItem instanceof String) {
			
		}else if (boxItem instanceof Apple) {
			
		}
		
		
		
	}
	
}
