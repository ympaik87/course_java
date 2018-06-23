package kr.co.smh.chap10;

import kr.co.smh.chap10.example.AudiEngine;
import kr.co.smh.chap10.example.BenzEngine;
import kr.co.smh.chap10.example.Car;
import kr.co.smh.chap10.example.Æø½º¹Ù°Õ¿£Áø;

public class Example03 {

	public static void main(String[] args) {
		Car car = new Car(new BenzEngine());
		Car car2 = new Car(new AudiEngine());
		Car car3 = new Car(new Æø½º¹Ù°Õ¿£Áø());
		
	}
	
}
