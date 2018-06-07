package kr.co.ymp.chap11;

import kr.co.ymp.chap11.example.AudiEngine;
import kr.co.ymp.chap11.example.BenzEngine;
import kr.co.ymp.chap11.example.Car;

public class Example01 {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.engineOn();
//		car.engineOff();
		
		Car car1 = new Car(new AudiEngine(1000, 3, 100));
		Car car2 = new Car(new BenzEngine(2000, 200, 200));
		
		car1.engineOn();
		car1.engineOff();
		
		car2.engineOn();
		car2.engineOff();
	}

}
