package kr.co.ymp.chap18;

import java.util.HashSet;
import java.util.Set;

public class Example04 {
	public static void main(String[] args) {

		// set: ���� ����
		// �ڷ� ������ ������ �������� �ʴ´�.
		// �ߺ� ������ ������� �ʴ´�.

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
