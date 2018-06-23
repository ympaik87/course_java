package kr.co.smh.chap18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		// list의 Iterator 가져오기
		// list 객체에서 가져올 수 있음
		
		// Iterator는 리스트의 제네릭과 똑같아야 한다.
		Iterator<String> iter = list.iterator();
		
		// hasNext() : 이터레이터가 다음으로 이동할 노드가 있는지 판별함
		while(iter.hasNext()) {
			String str = iter.next();	//연결부를 타고 이동 후 
										//해당 노드의 데이터를 리턴
			
			if(str.equals("A") || str.equals("B")) {
				iter.remove();//현재 이터레이터가 위치한 노드를 삭제함
			}
			
			//System.out.println(str);
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
	
}
