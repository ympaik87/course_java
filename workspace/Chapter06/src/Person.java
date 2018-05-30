
public class Person {
	private int age;
	private String name;
	
	// setter: �ܺη� ���� ���� �Ű������� �޾ƿͼ� ���� ��������� ����(set) �ϴ� method
	// setXXX ���·� �����.
	public void setAge(int _age) {
		
		if(_age<0) {
			System.out.println("���� �Է��� �� �� �Ǿ����ϴ�." + _age);
			return;
		}
		
		age = _age;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	// getter: �ܺο��� �ش� Ŭ������ ��� ������ �ʿ��� �� ��ȯ���� �����ϴ� ����(get) �ϴ� method
	// getXXX ���·� �����.
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
