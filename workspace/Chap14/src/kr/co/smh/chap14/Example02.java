package kr.co.smh.chap14;

import kr.co.smh.chap14.demo.DemoA;
import kr.co.smh.chap14.example.Person;

public class Example02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-7890123", "A", 10);
		Person p2 = new Person("123456-7890123", "A", 10);
		
		System.out.println(p1 == p2);	// false
		System.out.println(p1.equals(p2)); //true
		
		System.out.println(p1.toString());
		
		
	}
	
}
