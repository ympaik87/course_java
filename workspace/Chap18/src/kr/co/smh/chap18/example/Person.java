package kr.co.smh.chap18.example;

public class Person {

	private String name;
	private String desc;
	
	private int nameHashCode;
	
	public Person(String name, String desc) {
		this.name = name;
		this.desc = desc;
		
		//검색의 기준이 될 이름의 해쉬코드 구하기( 해쉬 알고리즘 사용하기 )
		this.nameHashCode = this.name.hashCode() % 3;
	}
	
	//hash 알고리즘을 구현하기 위해서는 검색어에 대한 기준이 필요하다
	// 대부분이 문자열...
	
	// 메모리 주소값은 hashCode() - Object 클래스의 메소드
	// Object 클래스의 hashCode() -> 메모리 주소값
	
	@Override
	public int hashCode() {
		//Person 객체가 위치해야 할 그룹을 지정
		return this.nameHashCode;
	}
	
	//Set에 들어갈 것이기 때문에 Person객체가 같을 조건을 지정해야 한다.
	// 반드시 equals 메소드를 오버라이딩 해야 한다.
	@Override
	public boolean equals(Object obj) {
		Person temp = (Person)obj;
		
		return this.name.equals(temp.name) &&
			   this.desc.equals(temp.desc);
	}
	
	
	@Override
	public String toString() {
		return "[해시코드] : "+ this.nameHashCode + 
			   "[이     름] : "  + this.name + 
			   "[설     명] : " + this.desc;
	}
	
	
	
	
	

}
