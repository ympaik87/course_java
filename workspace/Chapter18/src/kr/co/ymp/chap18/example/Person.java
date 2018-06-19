package kr.co.ymp.chap18.example;

public class Person {
	private String name;
	private String desc;

	private int nameHashCode;

	public Person(String name, String desc) {
		this.name = name;
		this.desc = desc;

		// �˻� ������ �� �̸��� �ؽ��ڵ� ���ϱ� (�ؽ� �˰��� ����ϱ�)
		this.nameHashCode = this.name.hashCode() % 3;
	}

	// hash �˰����� �����ϱ� ���ؼ��� �˻�� ���� ���� �ʿ�
	// ��κ��� ���ڿ�

	// �޸� �ּҰ��� hashCode() - Object class�� �żҵ�
	// Object class�� hashCode() -> �޸� �ּ� ��

	@Override
	public int hashCode() {
		// Person ��ü�� ��ġ �ؾ� �� �׷��� ����
		// return this.hashCode() % 3;
		return this.nameHashCode;
	}
	
	// Set�� �� ���̱� ������ Person��ü�� ���� ������ �����ؾ� �Ѵ�.
	// �ݵ�� equals methods�� �������̵� �ؾ� �Ѵ�.
	@Override
	public boolean equals(Object obj) {
		Person temp = (Person)obj;
		return this.name.equals(temp.name) && this.desc.equals(desc);
	}
	@Override
	public String toString() {
		return "�ؽ��ڵ�: " + this.nameHashCode + "�̸�: " + this.name + "����: " + this.desc;
	}
}
