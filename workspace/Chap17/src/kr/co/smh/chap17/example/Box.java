package kr.co.smh.chap17.example;

public class Box {

	//자바에 존재하는 모든 것들을 담아내기
	private Object item;
	
	public void store(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
	
}
