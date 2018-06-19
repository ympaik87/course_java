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

		// for-each�� ���
		// list�� �ִ� ������Ʈ�� �ϳ��� ������ str ������ ���� ����
		// �� �̻� ���� ������Ʈ�� ���� �� ���� �ݺ��� - Iterator�� ����
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("0, 1 ����");
		list.remove(0);
		list.remove(1);

		for (String str : list) {
			System.out.println(str);
		}
	}
}
