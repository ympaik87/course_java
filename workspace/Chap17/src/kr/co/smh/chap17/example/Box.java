package kr.co.smh.chap17.example;

public class Box {

	//�ڹٿ� �����ϴ� ��� �͵��� ��Ƴ���
	private Object item;
	
	public void store(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
	
}
