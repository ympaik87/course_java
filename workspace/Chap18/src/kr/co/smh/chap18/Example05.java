package kr.co.smh.chap18;

import java.util.Set;
import java.util.TreeSet;

public class Example05 {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Banana");
		treeSet.add("Cherry");
		treeSet.add("Apple");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}
	
}
