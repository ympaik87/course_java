package kr.co.ymp.chap14.example;

// Object class�� ��� Ŭ������ �ֻ��� Ŭ�����̴�.
// ���� �츮�� ������ ��� Ŭ������ Object Ŭ������ ����Ŭ�����̴�.

// ��������� extends ���� ������ ���������� Object Ŭ������ ��� �޴´�.
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
	
	// ��ü�� ��ü�� ����� ���ϱ� ���� Object Ŭ�������� overriding�Ѵ�.
	// 	--> �� ��ü�� ���ƾ� �ϴ� ������ �����ڰ� ���� �ۼ��Ѵ�.
	// 	--> Object Ŭ������ equals�� �޸� �ּ� ���� �� �ϰ� �ִ�. (���ϼ� �񱳸� �ϰ� �ִ�.)
	@Override
	public boolean equals(Object obj) {	// �Ķ���� Object obj�� �� ��� ��ü
		if(!(obj instanceof Person)) {
			System.out.println("obj�� Person�� �ƴմϴ�.");
			return false;
		}
		
		Person temp = (Person)obj; // downcasting �ʿ�. object class�� JUMIN_NUMBER�� ��� �ϱ� ����.
		return (this.JUMIN_NUMBER.equals(temp.JUMIN_NUMBER) || this.age == temp.age) && this.name.equals(temp.name); // �ֹι�ȣ�� ���̰� ����, �̸��� ���� ���
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", JUMIN_NUMBER=" + JUMIN_NUMBER + "]";
	}
	
	
	
//	// final�� �ƴϸ� ���ο��� ���� ����
//	void foo() {
//		this.JUMIN_NUMBER = "111";
//	}
}
