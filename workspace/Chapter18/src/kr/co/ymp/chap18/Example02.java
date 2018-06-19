package kr.co.ymp.chap18;

import java.util.ArrayList;
import java.util.List;

public class Example02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// for-each문 사용
		// list에 있는 엘리먼트를 하나씩 꺼내서 str 변수에 집어 넣음
		// 더 이상 꺼낼 엘리먼트가 없을 때 까지 반복함 - Iterator의 원리
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("0, 1 삭제");
		list.remove(0);
		list.remove(1);

		for (String str : list) {
			System.out.println(str);
		}
	}
}
