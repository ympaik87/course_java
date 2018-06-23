
public class Person {

	private int age;
	private String name;
	
	
	// Setter : �ܺη� ���� ���� �Ű������� �޾ƿͼ� ���� ��������� ����(set) �ϴ� �޼ҵ�
	// setXXX ���·� �����.
	public void setAge(int _age) {
		
		if( _age < 0 ) {
			System.out.println("���̰� �߸� �Ǿ����ϴ�. " + _age);
			return;
		}
		
		age = _age;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	// Getter : �ܺο��� �ش� Ŭ������ ��� ������ �ʿ� �� �� ��ȯ ���� ���� �ϴ� ����(get) �ϴ� �޼ҵ�
	// getXXX ���·� �����.
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}




