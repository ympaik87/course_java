package kr.co.smh.chap18;

import java.util.HashSet;
import java.util.Set;

import kr.co.smh.chap18.example.Person;

public class Example06 {

	
	public static void main(String[] args) {
		
		Set<Person> personHashSet = new HashSet<>();
		
		personHashSet.add(new Person("謝被肯", "ばば"));
		personHashSet.add(new Person("戚渋酔", "せせせ"));
		personHashSet.add(new Person("伐費濁", "ぞぞぞぞ"));
		personHashSet.add(new Person("重殿遂", "ぞぞぞぞ"));
		personHashSet.add(new Person("戚遂", "ぞぞぞぞ"));
		
		for(Person p : personHashSet) {
			System.out.println(p);
		}
		
		
	}
}
