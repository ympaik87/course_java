package kr.co.ymp.chap11;

import kr.co.ymp.chap11.example.Audi;
import kr.co.ymp.chap11.example.AudiEngine;
import kr.co.ymp.chap11.example.Benz;
import kr.co.ymp.chap11.example.BenzEngine;
import kr.co.ymp.chap11.example.Car;
import kr.co.ymp.chap11.example.MetalKey;
import kr.co.ymp.chap11.example.SmartKey;

public class Example01 {
	public static void main(String[] args) {
//		Car car = new Car();
//		car.engineOn();
//		car.engineOff();
//		
//		Car car1 = new Car(new AudiEngine(1000, 3, 100));
//		Car car2 = new Car(new BenzEngine(2000, 200, 200));
//		
//		car1.engineOn();
//		car1.engineOff();
//		
//		car2.engineOn();
//		car2.engineOff();
		Car benz = new Benz(new BenzEngine(1, 2, 3));
		
		SmartKey smartKey = new SmartKey();
		benz.engineOn(smartKey);
		benz.engineOff(smartKey);
		
		System.out.println();
		
		Car audi = new Audi(new AudiEngine(4, 5, 6));
		
		MetalKey metalKey = new MetalKey();
		audi.engineOn(metalKey);
		audi.engineOff(metalKey);
		
		System.out.println();
		
		audi.engineOn(smartKey);
		audi.engineOff(smartKey);
		
//		Car benz2 = new Benz(new AudiEngine(1, 3, 5));
	}

}
