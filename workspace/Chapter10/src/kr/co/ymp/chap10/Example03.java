package kr.co.ymp.chap10;

import kr.co.ymp.chap10.example.AudiEngine;
import kr.co.ymp.chap10.example.BenzEngine;
import kr.co.ymp.chap10.example.Car;

public class Example03 {
	public static void main(String[] args) {
		Car car = new Car(new BenzEngine());
		Car car2 = new Car(new AudiEngine());
	}
}
