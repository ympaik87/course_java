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
		
		// list�� Iterator ��������
		// list ��ü���� ������ �� ����
		
		// Iterator�� ����Ʈ�� ���׸��� �Ȱ��ƾ� �Ѵ�.
		Iterator<String> iter = list.iterator();
		
		// hasNext() : ���ͷ����Ͱ� �������� �̵��� ��尡 �ִ��� �Ǻ���
		while(iter.hasNext()) {
			String str = iter.next();	//����θ� Ÿ�� �̵� �� 
										//�ش� ����� �����͸� ����
			
			if(str.equals("A") || str.equals("B")) {
				iter.remove();//���� ���ͷ����Ͱ� ��ġ�� ��带 ������
			}
			
			//System.out.println(str);
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
	
}
