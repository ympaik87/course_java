package kr.co.ymp.chap18;

import java.util.Set;
import java.util.TreeSet;

public class Example05 {
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Banana");
		treeSet.add("Cherry");
		treeSet.add("Apple");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("G");
		treeSet.add("D");
		treeSet.add("B");
		treeSet.add("E");
		treeSet.add("F");

		for (String str : treeSet) {
			System.out.println(str);
		}
	}
}
