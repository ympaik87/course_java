package kr.co.ymp.chap18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		// List에 Element 추가하기
		// add method 사용
		list1.add(1);	// index 0
		list1.add(2);	// index 1
		list1.add(3);	// index 2
		
		// List에 있는 Element 가져오기(참조하기)
		System.out.println(list1.get(2));
		System.out.println(list1.get(0));
		
		// List에 있는 Element 수정하기
		// set (인덱스, 엘리먼트) method 사용
		list1.set(0, 4);	// 0번 인덱스의 에리먼트를 4로 수정
		System.out.println(list1.get(0));
		
		// List에 있는 Element 삭제
		// remove(인덱스), remove(엘리먼트) 메소드 사용
		// - index를 활용해 삭제하는 것이 일반적이다.
		list1.remove(1);	// 1번 인덱스에 위차한엘리먼트 삭제
		System.out.println(list1.get(1));
		
		List<Integer> list2 = new LinkedList();
		
		
	}
}
