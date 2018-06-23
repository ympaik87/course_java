package kr.co.smh.chap11;

import kr.co.smh.chap11.example.AudiCar;
import kr.co.smh.chap11.example.AudiEngine;
import kr.co.smh.chap11.example.BenzCar;
import kr.co.smh.chap11.example.BenzEngine;
import kr.co.smh.chap11.example.Car;
import kr.co.smh.chap11.example.MetalKey;
import kr.co.smh.chap11.example.SmartKey;

public class Example02 {

	public static void main(String[] args) {
		
		Car benz = new BenzCar(new BenzEngine(1, 2, 3));
		Car audi = new AudiCar(new AudiEngine(1, 2, 3));
		
		SmartKey smartKey = new SmartKey();
		benz.engineOn(smartKey);
		benz.engineOff(smartKey);
		
		System.out.println();
		
		MetalKey metalKey = new MetalKey();
		audi.engineOn(metalKey);
		audi.engineOff(metalKey);
		
		System.out.println();
		
		audi.engineOn(smartKey);
		benz.engineOn(metalKey);
		
//		Car benz2 = new BenzCar(new AudiEngine(1, 2, 3));
//		Car audi2 = new AudiCar(new BenzEngine(1, 2, 3));
	}
	
}
