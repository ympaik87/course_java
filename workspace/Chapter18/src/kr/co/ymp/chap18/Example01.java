package kr.co.ymp.chap18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		// List�� Element �߰��ϱ�
		// add method ���
		list1.add(1);	// index 0
		list1.add(2);	// index 1
		list1.add(3);	// index 2
		
		// List�� �ִ� Element ��������(�����ϱ�)
		System.out.println(list1.get(2));
		System.out.println(list1.get(0));
		
		// List�� �ִ� Element �����ϱ�
		// set (�ε���, ������Ʈ) method ���
		list1.set(0, 4);	// 0�� �ε����� ������Ʈ�� 4�� ����
		System.out.println(list1.get(0));
		
		// List�� �ִ� Element ����
		// remove(�ε���), remove(������Ʈ) �޼ҵ� ���
		// - index�� Ȱ���� �����ϴ� ���� �Ϲ����̴�.
		list1.remove(1);	// 1�� �ε����� �����ѿ�����Ʈ ����
		System.out.println(list1.get(1));
		
		List<Integer> list2 = new LinkedList();
		
		
	}
}
