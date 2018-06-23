package kr.co.smh.chap14.example;

//Object클래스는 모든 클래스의 최 상위 클래스 이다.
// 따라서 우리가 만들어내는 모든 클래스는 Object 클래스의 하위클래스 이다.

// 명시적으로 extends 하지 않으면 묵시적으로 Object 클래스를 상속 받는다.
public class Person {

	private String name;
	private int age;
	
	private final String JUMIN_NUMBER;
	
	public static final String PERSON_VERSION = "1.0";	
	
	public Person(String JUMIN_NUMBER, String name, int age) {
		this.JUMIN_NUMBER = JUMIN_NUMBER;
		this.name = name;
		this.age = age;
	}
	
	
	
	//객체와 객체의 동등성을 비교하기 위해 Object 클래스에서 오버라이딩 한다.
	//  --> 두 객체가 같아야 하는 조건을 개발자가 직접 작성한다.
	//  --> Object 클래스의 equals는 메모리 주소값을 비교 하고 있다(동일성 비교를 하고 있다.)
	@Override
	public boolean equals(Object obj)//파라미터 Object obj는 비교 대상 객체 
	{
		
		if( !(obj instanceof Person )) {
			System.out.println("obj가 Person이 아닙니다.");
			return false;
		}
		
		Person temp = (Person)obj;
		//주민등록번호나 나이가 같고, 이름이 같으면 같은 사람
		return  (this.JUMIN_NUMBER.equals(temp.JUMIN_NUMBER) ||
				 this.age == temp.age) &&
				 this.name.equals(temp.name);
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", JUMIN_NUMBER=" + JUMIN_NUMBER + "]";
	}
	
	
	
	
	
}




