package kr.co.ymp.chap18;

import java.util.HashSet;
import java.util.Set;

public class Example04 {
	public static void main(String[] args) {

		// set: 집합 개념
		// 자료 저장의 순서가 유지되지 않는다.
		// 중복 저장을 허용하지 않는다.

		Set<String> hashSet = new HashSet<>();
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Banana");
		hashSet.add("Banana");
		
		System.out.println(hashSet.size());

		for (String str : hashSet) {
			System.out.println(str);
		}

	}
}
