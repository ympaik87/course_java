package kr.co.smh.chap18;

import java.util.HashSet;
import java.util.Set;

import kr.co.smh.chap18.example.Person;

public class Example06 {

	
	public static void main(String[] args) {
		
		Set<Person> personHashSet = new HashSet<>();
		
		personHashSet.add(new Person("¼ÕÈï¹Î", "¤Ğ¤Ğ"));
		personHashSet.add(new Person("ÀÌ½Â¿ì", "¤»¤»¤»"));
		personHashSet.add(new Person("È²ÈñÂù", "¤¾¤¾¤¾¤¾"));
		personHashSet.add(new Person("½ÅÅÂ¿ë", "¤¾¤¾¤¾¤¾"));
		personHashSet.add(new Person("ÀÌ¿ë", "¤¾¤¾¤¾¤¾"));
		
		for(Person p : personHashSet) {
			System.out.println(p);
		}
		
		
	}
}
