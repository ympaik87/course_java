package kr.co.smh.chap18;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		
		//List�� Element �߰��ϱ�
		// add �޼ҵ� ���
		list1.add(1);	//�ε��� 0
		list1.add(2);	//�ε��� 1
		list1.add(3);	//�ε��� 2
		
		//List�� �ִ� Element ��������(�����ϱ�)
		// get(�ε���) �޼ҵ� ���
		System.out.println(list1.get(2));
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		//List�� �ִ� Element �����ϱ�
		// set(�ε���, ������Ʈ) �޼ҵ� ���
		
		list1.set(0, 4);	// 0�� �ε����� ������Ʈ�� 4�� ����
		System.out.println(list1.get(0));
		
		//List�� �ִ� Element �����ϱ�
		// remove(�ε���), remove(������Ʈ) �޼ҵ� ���
		// 	--> �ε����� Ȱ���� ���� �ϴ� ���� �Ϲ����̴�.
		
		list1.remove(1);	//1�� �ε����� ��ġ�� ������Ʈ ����
		System.out.println(list1.get(1));
		
		
		
	}
	
}
