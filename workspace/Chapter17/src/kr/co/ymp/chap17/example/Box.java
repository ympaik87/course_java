package kr.co.ymp.chap17.example;

public class Box {
	
	// Java�� �����ϴ� ��� �͵��� ��Ƴ���
	private Object item;
	
	public void store(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
}
