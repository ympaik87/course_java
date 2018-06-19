package kr.co.ymp.chap18;

import java.util.HashSet;
import java.util.Set;

import kr.co.ymp.chap18.example.Person;

public class Example06 {
	public static void main(String[] args) {
		Set<Person> personHashSet = new HashSet<>();
		
		personHashSet.add(new Person("¼ÕÈï¹Î", "¤Ì¤Ì"));
		personHashSet.add(new Person("È²ÈñÂù","¤»¤»¤»"));
		personHashSet.add(new Person("¹é¿µ¹Î", "¤·¤·¤·"));
		personHashSet.add(new Person("½ÅÅÂ¿ë", "¤¾¤¾¤¾"));
		personHashSet.add(new Person("ÀÌ¿ë", "¤»¤§¤»¤§"));
		
		for (Person p : personHashSet) {
			System.out.println(p);
		}
	}
}
