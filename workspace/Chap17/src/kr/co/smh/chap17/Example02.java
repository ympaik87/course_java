package kr.co.smh.chap17;

import kr.co.smh.chap17.example.Apple;
import kr.co.smh.chap17.example.AppleBox;
import kr.co.smh.chap17.example.Orange;

public class Example02 {

	public static void main(String[] args) {
		AppleBox appleBox = new AppleBox();
		appleBox.storeApple(new Apple());
		//appleBox.storeApple("»ç°ú");
		//appleBox.storeApple(new Orange());
		
	}
	
}
