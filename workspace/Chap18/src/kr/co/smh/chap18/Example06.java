package kr.co.smh.chap18;

import java.util.HashSet;
import java.util.Set;

import kr.co.smh.chap18.example.Person;

public class Example06 {

	
	public static void main(String[] args) {
		
		Set<Person> personHashSet = new HashSet<>();
		
		personHashSet.add(new Person("�����", "�Ф�"));
		personHashSet.add(new Person("�̽¿�", "������"));
		personHashSet.add(new Person("Ȳ����", "��������"));
		personHashSet.add(new Person("���¿�", "��������"));
		personHashSet.add(new Person("�̿�", "��������"));
		
		for(Person p : personHashSet) {
			System.out.println(p);
		}
		
		
	}
}
