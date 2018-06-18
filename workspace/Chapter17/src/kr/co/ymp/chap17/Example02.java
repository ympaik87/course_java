package kr.co.ymp.chap17;

import kr.co.ymp.chap17.example.Apple;
import kr.co.ymp.chap17.example.AppleBox;
//import kr.co.ymp.chap17.example.Orange;

public class Example02 {

	public static void main(String[] args) {
		AppleBox appleBox = new AppleBox();
		appleBox.storeApple(new Apple()); // appleBox는 apple class에 *일반화*되있다.
//		appleBox.storeApple("사과"); --> error
//		appleBox.storeApple(new Orange()); --> error
	}
	
}
