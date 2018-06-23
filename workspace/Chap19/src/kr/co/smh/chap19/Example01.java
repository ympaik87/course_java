package kr.co.smh.chap19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example01 {

	public static void main(String[] args) {
		
		//Map�� Key, Value �ΰ����� �����Ѵ�.
		// Key�� Set���� ����ȴ�.(HashMap�̸� HashSet����, TreeMap�̸� TreeSet����...)
		// Value�� ArrayList�� ����ȴ�.
		
		Map<String, String> hashMap = new HashMap<>();
		
		// Map�� Ű, ��� �߰�
		// put(Ű, ���) �޼ҵ带 Ȱ���Ѵ�.
		hashMap.put("A", "Hello~");
		hashMap.put("B", "Bye~");
		hashMap.put("C", "Hi~");
		
		
		// Map�� �ִ� �� ��������
		// get(Ű) �޼ҵ带 Ȱ���Ѵ�.
		System.out.println(hashMap.get("A"));
		System.out.println(hashMap.get("C"));
		
		// Map�� �ִ� Ű, ��� �����ϱ�
		// remove(Ű) �޼ҵ带 Ȱ���Ѵ�.
		hashMap.remove("A");
		System.out.println(hashMap.get("A"));
		
		// Map�� �ִ� �� �����ϱ�
		// put �޼ҵ带 �̿��� ���� �� �� ����
		//  �� ������ ���� Ű�� ���� �߰��� �ǰ�, ������ �ִ� Ű�� ���� ������ �ȴ�.
		hashMap.put("B", "���� �Ǿ����ϴ�.");
		System.out.println(hashMap.get("B"));

		// Map�� Key Ȯ���ϱ�
		// keySet() �޼ҵ带 �̿��� Map�� Ű�� Ȯ���Ѵ�.
		Set<String> keys = hashMap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}
	
}



