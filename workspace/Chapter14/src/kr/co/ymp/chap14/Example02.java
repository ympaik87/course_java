package kr.co.ymp.chap14;

import kr.co.ymp.chap14.example.Person;

public class Example02 {
	public static void main(String[] args) {
		Person p1 = new Person("123456-7890123", "ȫ�浿", 31);
		Person p2 = new Person("123456-7890123", "ȫ�浿", 1);
		
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true
		
		System.out.println(p1.toString());
	}
}
