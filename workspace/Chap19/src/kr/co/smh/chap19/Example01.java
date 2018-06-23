package kr.co.smh.chap19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example01 {

	public static void main(String[] args) {
		
		//Map은 Key, Value 두가지를 지정한다.
		// Key는 Set으로 저장된다.(HashMap이면 HashSet으로, TreeMap이면 TreeSet으로...)
		// Value는 ArrayList로 저장된다.
		
		Map<String, String> hashMap = new HashMap<>();
		
		// Map에 키, 밸류 추가
		// put(키, 밸류) 메소드를 활용한다.
		hashMap.put("A", "Hello~");
		hashMap.put("B", "Bye~");
		hashMap.put("C", "Hi~");
		
		
		// Map에 있는 값 가져오기
		// get(키) 메소드를 활용한다.
		System.out.println(hashMap.get("A"));
		System.out.println(hashMap.get("C"));
		
		// Map에 있는 키, 밸류 삭제하기
		// remove(키) 메소드를 활용한다.
		hashMap.remove("A");
		System.out.println(hashMap.get("A"));
		
		// Map에 있는 값 수정하기
		// put 메소드를 이용해 수정 할 수 있음
		//  즉 기존에 없던 키가 들어가면 추가가 되고, 기존에 있던 키가 들어가면 수정이 된다.
		hashMap.put("B", "수정 되었습니다.");
		System.out.println(hashMap.get("B"));

		// Map의 Key 확인하기
		// keySet() 메소드를 이용해 Map의 키를 확인한다.
		Set<String> keys = hashMap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}
	
}



